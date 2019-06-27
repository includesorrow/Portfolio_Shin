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
					<h3 id="content" class="kt-mb-20 kt-mt-22 item-title text-blue2"><b>교육내용</b></h3>
					<div class="kt-p-15">
					
						<h5 class="font-16"><b>라즈베리파이 OS 포팅 및 개발환경 구축</b></h5>
						
							
								<h5 class="font-weight-200 font-16"> -  라즈비안 다운로드 및 포팅</h5>
							
								<h5 class="font-weight-200 font-16"> -  라즈베리파이 개발환경 구축</h5>
							
								<h5 class="font-weight-200 font-16"> -  라즈비안 configuration 기본설정</h5>
							
						
					
						<h5 class="font-16"><b>라즈베리파이와 GPIO</b></h5>
						
							
								<h5 class="font-weight-200 font-16"> -  RPi와 GPIO 라이브러리</h5>
							
								<h5 class="font-weight-200 font-16"> -  시스템 레지스터와 데이터 입출력</h5>
							
								<h5 class="font-weight-200 font-16"> -  WiringPi와 GPIO</h5>
							
								<h5 class="font-weight-200 font-16"> -  리눅스 디바이스 드라이버와 GPIO</h5>
							
						
					
						<h5 class="font-16"><b>C 활용 입출력 디바이스 제어</b></h5>
						
							
								<h5 class="font-weight-200 font-16"> -  C 활용 LED 제어 프로그래밍</h5>
							
								<h5 class="font-weight-200 font-16"> -  C 활용 스위치 제어 프로그래밍</h5>
							
								<h5 class="font-weight-200 font-16"> -  C 활용 스피커 제어 프로그래밍</h5>
							
								<h5 class="font-weight-200 font-16"> -  C 활용 모터 제어 프로그래밍</h5>
							
								<h5 class="font-weight-200 font-16"> -  C 활용 FND 제어 프로그래밍</h5>
							
						
					
						<h5 class="font-16"><b>파이썬 활용 입출력 디바이스 제어</b></h5>
						
							
								<h5 class="font-weight-200 font-16"> -  파이썬 활용 LED 제어 프로그래밍</h5>
							
								<h5 class="font-weight-200 font-16"> -  파이썬 활용 스위치 제어 프로그래밍</h5>
							
								<h5 class="font-weight-200 font-16"> -  파이썬 활용 스피커 제어 프로그래밍</h5>
							
								<h5 class="font-weight-200 font-16"> -  파이썬 활용 모터 제어 프로그래밍</h5>
							
								<h5 class="font-weight-200 font-16"> -  파이썬 활용 FND 제어 프로그래밍</h5>
							
						
					
					</div>
				</div>
			</div>
			<div class="row">
				<div class="col-md-12 col-xs-12 border-top lecture-content">
					<h3 id="goal" class="kt-mb-20 kt-mt-22 item-title text-blue2"><b>교육목표</b></h3>
					<h5 class="font-weight-200 font-16 kt-p-15">모바일 열풍에 힘입어 스마트 기기들과 네트워크의 융합으로 사물인터넷(IoT)이라는 새로운 시대가 도래하고 있습니다. 사물인터넷은 각종 사물에 센서와 통신 기능을 내장하여 인터넷에 연결하는 기술로서 사물 간에 보다 능동적인 연결을 할 수 있도록 하기 위해서는 사물(디바이스) 간의 통신이 중요합니다. 최근 사물인터넷에 연결되는 능동적인 디바이스들로 라즈베리 파이나 아두이노와 같은 오픈소스 하드웨어가 널리 사용되고 있습니다.
<br>본 과정에서는 라즈베리파이 OS 포팅 및 개발환경 구축 방법을 파악하고 라즈베리파이에서 GPIO를 제어하는 다양한 방법을 학습합니다. 또 C 언어를 활용한 각종 입출력 디바이스를 제어하는 방법과 파이썬 언어를 활용한 각종 입출력 디바이스 제어 기법을 습득합니다.</h5>
				</div>
			</div>
			<div class="row">
				<div class="col-md-12 col-xs-12 border-top lecture-content">
					<h3 id="target" class="kt-mb-20 kt-mt-22 item-title text-blue2"><b>교육대상</b></h3>
					<h5 class="font-weight-200 font-16 kt-p-15">&lt;교육대상&gt;
<br>협약기업 재직자(고용보험 납부) 및 회원사 재직자 지원가능
<br>
<br>※ 교육신청은 대기상태로 협회의 교육 승인 후 수강이 가능합니다. 
<br>※ 교육 대기상태에서는 수강에 제한이 있을 수 있으니 이 점 참고하시기 바랍니다. 
<br>※ 개강안내 메일 및 문자는 교육 승인되신 분들에 한하여 개강 일주일 전에 발송됩니다. 
<br>※ 과정별 모집인원에 따라 변동 및 폐강 될 수 있으며, 이는 개강 일주일 전에 확정됩니다.
<br>
<br>&lt;훈련대상 요건&gt;
<br>- IoT 제품 및 서비스 개발자, 기획자, 컨설턴트, 기술지원자
<br>- IoT 분야에서 신규 사업에 대한 아이디어를 꿈꾸고 있는 분
<br>- C 프로그래밍 가능 자, "Linux Fundamentals" 수강자
<br>
<br>&lt;선수 과목&gt;
<br>- C 프로그래밍 기초
<br>- IoT 아두이노 디바이스 프로그래밍 기초
<br>
<br>
<br>&lt;패널티 안내&gt;
<br>선착순으로 마감되는 교육과정일 경우 교육을 받고 싶어도 받지 못하는 분들이 계실 수 있습니다. 원활한 강의 진행을 위해 아래 경우에 패널티가 부여됨을 알려드립니다.
<br>
<br>- 신청 후 개인사정에 의해 교육 당일 사전 연락없이 3회 이상 결석 시.
<br>- 신청 후 개강 3일 이내에 수강 취소한 경우가 3회 이상일 시.
<br>- 강좌 미수료 3회 이상시.
<br>- 교육담당자에게 별도 전달 없이 20분 이상 자리를 이탈하는 경우
<br>
<br>패널티를 3회 이상 부여받은 수강생은 3개월 간 수강제한 처리됩니다.
<br>이러한 수강생이 3분 이상일 경우 개인 포함 재직 중이신 회사의 모든 임직원은 3개월 수강제한을 받습니다.</h5>
				</div>
			</div>
			<div class="row">
				<div class="col-md-12 col-xs-12 border-top lecture-content">
					<h3 id="relation" class="kt-mb-20 kt-mt-22 item-title text-blue2"><b>연관과정</b></h3>
					<div class="row kt-p-15">
						<div class="col-md-4 bg-blue1 height-200">
							<h4 class="text-center text-white border-bottom">선수과정</h4>
							<div class="no-padding">
								<ul class="list-group kt-pb-40">
								
									<li class="list-group-item text-white font-15">
									결과가 없습니다.
									</li>
								
								</ul>
							</div>
						</div>
						<div class="col-md-4 bg-blue2 height-200">
							<h4 class="text-center text-white kt-ptb-60 font-15">IoT 라즈베리파이 디바이스 프로그래밍 - 무료</h4>
						</div>
						<div class="col-md-4 bg-blue3 height-200">
							<h4 class="text-center text-white border-bottom">후수 과정</h4>
							<div class="no-padding">
								<ul class="list-group kt-pb-40">
								
									<li class="list-group-item text-white font-15">
									결과가 없습니다.
									</li>
								
								</ul>
							</div>
						</div>
					</div>
				</div>
				</div>

			<div class="row">
				<div class="col-md-12 col-xs-12 border-top lecture-content kt-mb-41">
					<h3 id="center" class=" kt-mt-30 item-title text-blue2"><b>문의센터</b></h3>
					<h5 class="font-weight-200 font-16 kt-pl-15">
						[판교 교육장] 재직자:031-606-9319, 채용예정자:031-606-9316</h5>
					<h5 class="font-weight-200 font-16 kt-pl-15">[가산 교육장] 재직자:02-6278-9353, 채용예정자:02-6278-9352</h5>
				</div>
			</div>
		</div>
	</section>
</body>
</html>