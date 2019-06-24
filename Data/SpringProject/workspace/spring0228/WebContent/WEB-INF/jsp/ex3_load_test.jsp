<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>ex3_load_test.jsp</title>
<style>
	.border-0{border: 1px solid;}
</style>
</head>
<body>
<section class=" border-0">
		<div class="container">
			<div class="row">
				<div class="col-md-12 col-xs-12 border-top lecture-content">
					<h3 id="content" class="kt-mb-20 kt-mt-22 item-title text-blue2"><b>��������</b></h3>
					<div class="kt-p-15">
					
						<h5 class="font-16"><b>��������� OS ���� �� ����ȯ�� ����</b></h5>
						
							
								<h5 class="font-weight-200 font-16"> -  ������ �ٿ�ε� �� ����</h5>
							
								<h5 class="font-weight-200 font-16"> -  ��������� ����ȯ�� ����</h5>
							
								<h5 class="font-weight-200 font-16"> -  ������ configuration �⺻����</h5>
							
						
					
						<h5 class="font-16"><b>��������̿� GPIO</b></h5>
						
							
								<h5 class="font-weight-200 font-16"> -  RPi�� GPIO ���̺귯��</h5>
							
								<h5 class="font-weight-200 font-16"> -  �ý��� �������Ϳ� ������ �����</h5>
							
								<h5 class="font-weight-200 font-16"> -  WiringPi�� GPIO</h5>
							
								<h5 class="font-weight-200 font-16"> -  ������ ����̽� ����̹��� GPIO</h5>
							
						
					
						<h5 class="font-16"><b>C Ȱ�� ����� ����̽� ����</b></h5>
						
							
								<h5 class="font-weight-200 font-16"> -  C Ȱ�� LED ���� ���α׷���</h5>
							
								<h5 class="font-weight-200 font-16"> -  C Ȱ�� ����ġ ���� ���α׷���</h5>
							
								<h5 class="font-weight-200 font-16"> -  C Ȱ�� ����Ŀ ���� ���α׷���</h5>
							
								<h5 class="font-weight-200 font-16"> -  C Ȱ�� ���� ���� ���α׷���</h5>
							
								<h5 class="font-weight-200 font-16"> -  C Ȱ�� FND ���� ���α׷���</h5>
							
						
					
						<h5 class="font-16"><b>���̽� Ȱ�� ����� ����̽� ����</b></h5>
						
							
								<h5 class="font-weight-200 font-16"> -  ���̽� Ȱ�� LED ���� ���α׷���</h5>
							
								<h5 class="font-weight-200 font-16"> -  ���̽� Ȱ�� ����ġ ���� ���α׷���</h5>
							
								<h5 class="font-weight-200 font-16"> -  ���̽� Ȱ�� ����Ŀ ���� ���α׷���</h5>
							
								<h5 class="font-weight-200 font-16"> -  ���̽� Ȱ�� ���� ���� ���α׷���</h5>
							
								<h5 class="font-weight-200 font-16"> -  ���̽� Ȱ�� FND ���� ���α׷���</h5>
							
						
					
					</div>
				</div>
			</div>
			<div class="row">
				<div class="col-md-12 col-xs-12 border-top lecture-content">
					<h3 id="goal" class="kt-mb-20 kt-mt-22 item-title text-blue2"><b>������ǥ</b></h3>
					<h5 class="font-weight-200 font-16 kt-p-15">����� ��ǳ�� ���Ծ� ����Ʈ ����� ��Ʈ��ũ�� �������� �繰���ͳ�(IoT)�̶�� ���ο� �ô밡 �����ϰ� �ֽ��ϴ�. �繰���ͳ��� ���� �繰�� ������ ��� ����� �����Ͽ� ���ͳݿ� �����ϴ� ����μ� �繰 ���� ���� �ɵ����� ������ �� �� �ֵ��� �ϱ� ���ؼ��� �繰(����̽�) ���� ����� �߿��մϴ�. �ֱ� �繰���ͳݿ� ����Ǵ� �ɵ����� ����̽���� ����� ���̳� �Ƶ��̳�� ���� ���¼ҽ� �ϵ��� �θ� ���ǰ� �ֽ��ϴ�.
<br>�� ���������� ��������� OS ���� �� ����ȯ�� ���� ����� �ľ��ϰ� ��������̿��� GPIO�� �����ϴ� �پ��� ����� �н��մϴ�. �� C �� Ȱ���� ���� ����� ����̽��� �����ϴ� ����� ���̽� �� Ȱ���� ���� ����� ����̽� ���� ����� �����մϴ�.</h5>
				</div>
			</div>
			<div class="row">
				<div class="col-md-12 col-xs-12 border-top lecture-content">
					<h3 id="target" class="kt-mb-20 kt-mt-22 item-title text-blue2"><b>�������</b></h3>
					<h5 class="font-weight-200 font-16 kt-p-15">&lt;�������&gt;
<br>������ ������(��뺸�� ����) �� ȸ���� ������ ��������
<br>
<br>�� ������û�� �����·� ��ȸ�� ���� ���� �� ������ �����մϴ�. 
<br>�� ���� �����¿����� ������ ������ ���� �� ������ �� �� �����Ͻñ� �ٶ��ϴ�. 
<br>�� �����ȳ� ���� �� ���ڴ� ���� ���εǽ� �е鿡 ���Ͽ� ���� ������ ���� �߼۵˴ϴ�. 
<br>�� ������ �����ο��� ���� ���� �� �� �� �� ������, �̴� ���� ������ ���� Ȯ���˴ϴ�.
<br>
<br>&lt;�Ʒô�� ���&gt;
<br>- IoT ��ǰ �� ���� ������, ��ȹ��, ������Ʈ, ���������
<br>- IoT �о߿��� �ű� ����� ���� ���̵� �޲ٰ� �ִ� ��
<br>- C ���α׷��� ���� ��, "Linux Fundamentals" ������
<br>
<br>&lt;���� ����&gt;
<br>- C ���α׷��� ����
<br>- IoT �Ƶ��̳� ����̽� ���α׷��� ����
<br>
<br>
<br>&lt;�г�Ƽ �ȳ�&gt;
<br>���������� �����Ǵ� ���������� ��� ������ �ް� �; ���� ���ϴ� �е��� ��� �� �ֽ��ϴ�. ��Ȱ�� ���� ������ ���� �Ʒ� ��쿡 �г�Ƽ�� �ο����� �˷��帳�ϴ�.
<br>
<br>- ��û �� ���λ����� ���� ���� ���� ���� �������� 3ȸ �̻� �Ἦ ��.
<br>- ��û �� ���� 3�� �̳��� ���� ����� ��찡 3ȸ �̻��� ��.
<br>- ���� �̼��� 3ȸ �̻��.
<br>- ��������ڿ��� ���� ���� ���� 20�� �̻� �ڸ��� ��Ż�ϴ� ���
<br>
<br>�г�Ƽ�� 3ȸ �̻� �ο����� �������� 3���� �� �������� ó���˴ϴ�.
<br>�̷��� �������� 3�� �̻��� ��� ���� ���� ���� ���̽� ȸ���� ��� �������� 3���� ���������� �޽��ϴ�.</h5>
				</div>
			</div>
			<div class="row">
				<div class="col-md-12 col-xs-12 border-top lecture-content">
					<h3 id="relation" class="kt-mb-20 kt-mt-22 item-title text-blue2"><b>��������</b></h3>
					<div class="row kt-p-15">
						<div class="col-md-4 bg-blue1 height-200">
							<h4 class="text-center text-white border-bottom">��������</h4>
							<div class="no-padding">
								<ul class="list-group kt-pb-40">
								
									<li class="list-group-item text-white font-15">
									����� �����ϴ�.
									</li>
								
								</ul>
							</div>
						</div>
						<div class="col-md-4 bg-blue2 height-200">
							<h4 class="text-center text-white kt-ptb-60 font-15">IoT ��������� ����̽� ���α׷��� - ����</h4>
						</div>
						<div class="col-md-4 bg-blue3 height-200">
							<h4 class="text-center text-white border-bottom">�ļ� ����</h4>
							<div class="no-padding">
								<ul class="list-group kt-pb-40">
								
									<li class="list-group-item text-white font-15">
									����� �����ϴ�.
									</li>
								
								</ul>
							</div>
						</div>
					</div>
				</div>
				</div>

			<div class="row">
				<div class="col-md-12 col-xs-12 border-top lecture-content kt-mb-41">
					<h3 id="center" class=" kt-mt-30 item-title text-blue2"><b>���Ǽ���</b></h3>
					<h5 class="font-weight-200 font-16 kt-pl-15">
						[�Ǳ� ������] ������:031-606-9319, ä�뿹����:031-606-9316</h5>
					<h5 class="font-weight-200 font-16 kt-pl-15">[���� ������] ������:02-6278-9353, ä�뿹����:02-6278-9352</h5>
				</div>
			</div>
		</div>
	</section>
</body>
</html>