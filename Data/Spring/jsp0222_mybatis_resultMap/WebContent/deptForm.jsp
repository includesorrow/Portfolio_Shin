<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
	<%-- deptForm.jsp --%>
<%@ include file="header.jsp" %>
	
		<%-- header �� --%>
		<div id="content">
		<form method="post" action="my.kosta188">
		<input type="hidden" name="cmd" value="deptAdd">
			<fieldset>
				<legend>Dept �Է� �� ����</legend>
				<p>
				<%-- onclick �Ӽ��� Webǥ�� ���� --%>
					<label for="�μ���">�μ��� </label>
					<input type="text" name="dname" id="dname">
					<input type="button" id="btn" value="�ߺ�Ȯ��">
				</p>
				<p id="res"></p>
				<p>
					<label for="�μ� ��ġ">�μ� ��ġ</label>
					<input type="text" name="loc" id="loc">
				</p>
				<p>
					<input type="submit" value="�μ�����">
					<input type="button" value="�μ�����Ʈ">
				</p>
			</fieldset>
		</form>
		</div>
		<%-- content �� --%>
<script src="resources/js/httpRequest.js"></script>		
<script>
		// ��� HTML�� ������ �ε��� �� �Ŀ� �ڹٽ�ũ��Ʈ ������ ����
		document.getElementById("btn").addEventListener("click",function(){
			var dname = document.getElementById("dname").value;	
			console.log("�μ���:"+dname);
			var param = "";
			//Ajax ����� ���� �Լ� ȣ��
			// url, param, callback , method
sendRequest("my.kosta188?cmd=dnameFind&dname="+dname,param,res,'get');
		});
		// Ajax�� callback ����
		function res(){
			console.log("readyState:"+xhr.readyState);
			console.log("status:"+xhr.status);
			if(xhr.readyState === 4){
				if(xhr.status === 200){
					// xhr.responseText ������ ������ 
document.getElementById('res').innerHTML=xhr.responseText;
				}
			}
		}
</script>	
<%@ include file="footer.jsp" %>




