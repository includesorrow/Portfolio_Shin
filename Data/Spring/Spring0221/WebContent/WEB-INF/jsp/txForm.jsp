<%@ page language="java" contentType="text/html; charset=EUC-KR"
   pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
   <div id="article">
      <div id="header2">
         <h1>uri : jQuery :</h1>
         <p id="time">2019. 02. 20</p>
      </div>
      <div id="content">
         <div style="width: 450px; margin: auto;">
            <form action="testTx" method="post">
               <fieldset>
                  <legend>트랜잭션 처리 예제 폼</legend>
                  <p>
                     <label>ID(Unique)</label><input type="text" name="id">
                  </p>
                  <p>
                     <label>PWD</label><input type="password" name="password">
                  </p>
                  <p>
                     <label>Name</label><input type="text" name="name">
                  </p>
                  <p>
                     <label>ADDRESS</label><input type="text" name="address">
                  </p>
                  <p>
                     <label>SSN(UNIQUE)</label><input type="text" name="ssn">
                  </p>
                  <p>
                     <input type="submit" value="입력">
                  </p>
               </fieldset>

            </form>

         </div>
      </div>
      </div>
</body>
</html>