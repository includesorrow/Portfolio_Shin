<%@ page language="java" contentType="text/html; charset=UTF-8"
 pageEncoding="UTF-8"%>
<%@page import="org.math.R.RserveSession"%>
<%@page import="org.math.R.Rsession"%>
<%@page import="java.io.File"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
 <%
  Rsession r = RserveSession.newInstanceTry(System.out, null);

  double[] rand = (double[]) r.eval("rnorm(10)"); // create java variable from R command
  System.out.println("rand : " + rand);
  out.println("rand : " + rand);

  // ...
  r.set("c", Math.random()); // create R variable from java one

  r.save(new File("save.Rdata"), "c"); // save variables in .Rdata
  r.rm("c"); // delete variable in R environment
  r.load(new File("save.Rdata")); // load R variable from .Rdata

  // ...
  r.set("df", new double[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }, { 10, 11, 12 } }, "x1", "x2", "x3"); // create
                             // data
                             // frame
                             // from
                             // given
                             // vectors
  double value = (double) (r.eval("df$x1[3]")); // access one value in data frame
  System.out.println("value : " + value);
  out.println("value : " + value);
  // ...
  r.toJPEG(new File("plot.jpg"), 400, 400, "plot(rnorm(10))"); // create jpeg file from R graphical command (like
                  // plot)

  String html = r.asHTML("summary(rnorm(100))"); // format in html using R2HTML
  System.out.println(html);
  out.println(html);
  String txt = r.asString("summary(rnorm(100))"); // format in text
  System.out.println(txt);
  out.println(txt);
  // ...
  System.out.println(r.installPackage("sensitivity", true)); //install and load
  // R package
  System.out.println(r.installPackage("wavelets", true));

  r.end();
 %>

</body>
</html>