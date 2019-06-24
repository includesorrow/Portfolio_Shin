<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
   
   <table>
      <thead>
         <tr><td><h3>게시판</h3></td></tr>
      </thead>
      <tbody>
         <tr><td>번호</td><td>글종류</td><td>제목</td><td>글쓴이</td><td>작성일</td><td>조회수</td></tr>
         
            <tr><td>29</td><td>잡담</td>
            <td style="color: gray;"><a href="writedetail?idx=29">ㅎㅇ</td>
            <td>di01096</td><td>2019-02-11 19:59:08</td><td>19</td>
            </tr>
         
            <tr><td>30</td><td>잡담</td>
            <td style="color: gray;"><a href="writedetail?idx=30">ㅎㅇㅎㅇ</td>
            <td>di01096</td><td>2019-02-11 20:00:11</td><td>7</td>
            </tr>
         
            <tr><td>41</td><td>잡담</td>
            <td style="color: gray;"><a href="writedetail?idx=41">gdgdg</td>
            <td>312</td><td>2019-02-20 17:59:57</td><td>2</td>
            </tr>
         
            <tr><td>42</td><td>잡담</td>
            <td style="color: gray;"><a href="writedetail?idx=42">12312</td>
            <td>312</td><td>2019-02-20 18:01:45</td><td>6</td>
            </tr>
         
            <tr><td>43</td><td>잡담</td>
            <td style="color: gray;"><a href="writedetail?idx=43">12312</td>
            <td>312</td><td>2019-02-20 18:01:48</td><td>2</td>
            </tr>
         
            <tr><td>44</td><td>잡담</td>
            <td style="color: gray;"><a href="writedetail?idx=44">213</td>
            <td>312</td><td>2019-02-20 18:02:51</td><td>3</td>
            </tr>
         
            <tr><td>46</td><td>잡담</td>
            <td style="color: gray;"><a href="writedetail?idx=46">ㄻㄴㅇㄹ</td>
            <td>312</td><td>2019-02-20 18:12:42</td><td>0</td>
            </tr>
         
      </tbody>
      <tfoot>
         <form action="search" method="get">
         <tr><td>
            검색
         </td><td>
            <select name="searchtype">
               <option value="wtitle">제목</option>
               <option value="write">내용</option>
               <option value="writer">작성이</option>
               <option value="bun">번호</option>
            </select>
         </td><td>
            <input type="search" name="search">
         </td><td>
            <input type="submit" value="검색">
         </td></tr>
         </form>
         <tr><td>
         <form action="setwrite" method="get">
            <input type="submit" value="글작성">
         </form>
         </td><td>
         <form action="logout" method="get">
            <input type="submit" value="로그아웃">
         </form>
         </td></tr>
      </tfoot>
   </table>
</body>
</html>
      
    
    
    <div id="header1" class="hd">
    
    </div>
   </div>
</body>
</html>