<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
	<%-- deptForm.jsp --%>
<%@ include file="header.jsp" %>
	
		<%-- header 끝 --%>
		<div id="content">
		<form method="post" action="my.kosta188">
		<input type="hidden" name="cmd" value="deptAdd">
			<fieldset>
				<legend>Dept 입력 폼 예제</legend>
				<p>
				<%-- onclick 속성은 Web표준 위반 --%>
					<label for="부서명">부서명 </label>
					<input type="text" name="dname" id="dname">
					<input type="button" id="btn" value="중복확인">
				</p>
				<p id="res"></p>
				<p>
					<label for="부서 위치">부서 위치</label>
					<input type="text" name="loc" id="loc">
				</p>
				<p>
					<input type="submit" value="부서가입">
					<input type="button" value="부서리스트">
				</p>
			</fieldset>
		</form>
		</div>
		<%-- content 끝 --%>
<script src="resources/js/httpRequest.js"></script>		
<script>
		// 모든 HTML이 돔으로 로딩이 된 후에 자바스크립트 엔진이 동작
		document.getElementById("btn").addEventListener("click",function(){
			var dname = document.getElementById("dname").value;	
			console.log("부서명:"+dname);
			var param = "";
			//Ajax 통신을 위한 함수 호출
			// url, param, callback , method
sendRequest("my.kosta188?cmd=dnameFind&dname="+dname,param,res,'get');
		});
		// Ajax의 callback 응답
		function res(){
			console.log("readyState:"+xhr.readyState);
			console.log("status:"+xhr.status);
			if(xhr.readyState === 4){
				if(xhr.status === 200){
					// xhr.responseText 서버측 데이터 
document.getElementById('res').innerHTML=xhr.responseText;
				}
			}
		}
</script>	
<%@ include file="footer.jsp" %>




