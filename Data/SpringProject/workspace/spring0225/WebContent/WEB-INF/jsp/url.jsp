<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<div id="article">
	<div id="header2">
		<h1>�н���ǥ : UI Design : Apache Tiles �����ϱ�</h1>
		<p id="time">2019-02-20</p>
	</div>
	<div id="content">
		<form method="post" action="jsoup2" autocomplete="off">
			<p>
				<label>url : </label>
				<!-- <input type="url" name="url" id="url"> -->
				<select name="url" id="url" style="width: 400px;">
					<option value="https://www.w3schools.com/">https://www.w3schools.com/</option>
					<option value="https://comic.naver.com/index.nhn">https://comic.naver.com/index.nhn</option>
				</select>
			</p>
			<p>
				<label>selector : </label> <input style="width: 400px;" type="text" name="selector"
					id="selector"> <input type="submit" value="save">
			</p>
		</form>
	</div>
</div>