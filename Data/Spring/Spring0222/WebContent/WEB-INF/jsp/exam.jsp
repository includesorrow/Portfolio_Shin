<%@ page language="java" contentType="text/html; charset=EUC-KR"
   pageEncoding="EUC-KR"%>
<div id="article">
   <div id="header2">
      <h1>학습목표 : UI Design : Jsoup 크롤링 실습예제</h1>
      <p id="time">2019-02-20</p>
   </div>
   <div id="content">
      <form action="js1" method="Post">
         <fieldset>
            <legend>URL and Selector</legend>
            <p>
               <label>url</label> <input type="text" size="50" name="url"
                  value="https://comic.naver.com/index.nhn" >
            </p>
            <p>
               &nbsp; <label>selector</label> <input type="text" name="selector" size="50"
                  value="#realTimeRankFavorit > li > a" >
            </p>
            <input type="submit" value="send">
         </fieldset>
      </form>
   </div>
</div>