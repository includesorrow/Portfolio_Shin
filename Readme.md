# 데이터 엔지니어 신동준입니다.

## Intro

안녕하세요, 데이터 엔지니어 신동준입니다. 

데이터 크롤링 및 데이터 파이프라인 구축과 데이터 정합성 향상에 열정을 가지고 있으며, 다양한 산업군에서 대용량 데이터 처리와 시스템 안정성을 높이는 데 기여해왔습니다. 

Python과 Airflow 등을 활용하여 효율적이고 신뢰성 있는 데이터 솔루션을 개발하였으며, 문제 해결 능력을 바탕으로 목표 달성에 이바지하고자 합니다. 

데이터 크롤링을 넘어 엔지니어로서 성장하고, 더 나은 데이터 처리 방법을 모색하는 데 지속적인 노력을 기울이고 있습니다. 

## Category
1. Contacts
2. Experiences
3. Communities
<!--4. [교육](#참여한-행사)
5. [발표 PPT](#발표-PPT)-->

<!--## 소개-->

<!--2017년에 IT를 처음으로 접하였고, IT에 흥미를 느껴 계속해서 공부하고 있는 개발자 신동준입니다.-->

<!--산업공학과 출신이지만 외부 수업으로 IT를 배우고, 거기서 IT에 대해 큰 매력을 느껴 도전하고 있습니다.-->


## Contacts
<!--
- 이메일 : includesorrow@gmail.com
- 전화번호 : 010-5164-7769
!-->
- github : https://github.com/includesorrow
- blog : https://includesorrow.tistory.com/


## Experiences

#### [스마트푸드네트웍스 (2025.02 ~ 현재)

#### 개발1팀

##### 데이터 스크래핑 아키텍쳐 설계 및 구축작업
- Airflow를 통한 스크래핑 아키텍처 설계 및 구축

##### 배달3사 사장님사이트 스크래핑 로직 개발
- 수백명의 유저를 채널별로 각각 데이터 스크래핑 로직 개발
- 데이터 정합성 이슈가 생길 시 알림 봇 개발
- AWS 대역 차단을 우회하기 위한 프록시 사용 및 프록시 데이터 비용 감축
- 초기 모델 대비 에러율 60% 감소 개발

##### POS 스크래핑 로직 개발
- 본사계약으로 진행된 POS 3사 수백개의 계정을 채널별로 각각 데이터 스크래핑 로직 개발
- 데이터 정합성 이슈가 생길 시 알림 봇 개발
- 각 POS사마다 요구사항에 맞게 데이터 수집 - 전처리 및 insert

#### [올라핀테크 데이터 엔지니어링팀 (2023.10 ~ 2025.02)](https://www.allra.co.kr/)

#### Data Engineer

###### 데이터 크롤링 - 로깅 및 에러 처리 로직 개선
- 기존에는 로깅처리 및 에러처리가 부족해서 이슈가 발생하더라도 문제점이 무엇인지 확인하기 어려웠음
  - 각 쇼핑몰별 에러 로깅 처리를 작업하여 어떤 페이지에서 이슈가 발생했는지에 대해 로깅처리
  - **해당 로직 도입으로 개발자 에러 처리 속도 향상 및 cs 인입에 대한 처리 향상**
 
##### 데이터 크롤링 - 에러율 개선
- 조회 시 필요한 모든 페이지를 크롤링 하는 것이 아닌 특정 상황에 맞는 수집 로직 개발
  - A로직 수집은 10페이지, B로직수집은 5페이지 등 최대한 수집하는 데이터 축소
  - **로직 도입을 통해 해당 웹사이트 IP밴 감소 및 에러율 감소(기존 대비 -35%)**

##### 데이터 엔지니어링 - DB 모니터링 시스템 개발
- DB의 정합성에 문제가 생겨 이를 해결하기 위해 DB 모니터링 시스템을 개발
  - DB 부하를 줄이기 위해 JOIN문 등 DB에 무리가는 모든 쿼리문을 제거하고 Python 내에서 처리, 이상치 탐지 시 슬랙 알림처리
  - **해당 로직 도입으로 운영팀에서 데이터 정합성 이슈 발생 시 즉각적인 대응 가능 처리** 

#### [라텔앤드파트너즈 ML팀 (2022.01 ~ 2023.10)](https://heyratel.com/)

#### Data Engineer ([링크](https://github.com/includesorrow/rt))

##### 주요 업무
- 데이터 수집
   - 30여개의 사이트에서 데이터 수집 개발 및 자동화
   - 일간 10만건의 데이터 수집
- 데이터 파이프라인 구축
   - Airflow 구축 및 유지보수
   - EKS, Kafka 유지보수
   - 데이터 정제 및 저장, 데이터 파이프라인 이슈 트래킹
- 기술스텍
   - Python3
   - AWS
   - Airlfow, EKS, Kafka

#### 아큐브 DBA Assist

##### 주요 업무
- 아큐브 정기 Report 데이터 추출
- 아큐브 CS 업무 지원

#### [트릿지 Data팀 (2021.10 ~ 2021.12)](https://www.tridge.com/ko/)

##### 주요 업무
- 무역 데이터 정보 크롤링
- 데이터 정제
- 기술스텍
  - node.js
  - javascript

#### [메쉬코리아 Data Engineering팀 (2020.10 ~ 2021.02)](https://meshkorea.net/kr/index.html)

##### 주요 업무
- 상점 정보 크롤링 
- 데이터 정제 업무
- 크롤링 자동화를 위한 Airflow Dag 개발
- 기술스택
  - Python 
  - AWS EMR, RDS, S3
  - Airflow  

## Communities

### 외주활동
- 데이터 수집 외주활동 8건 진행

### 개발 공부

<!--#### [Java 기반 피부과 예약 프로그램 (1.18 ~ 1.23 / 4일)](https://github.com/includesorrow/Java_SemiProject_Hospital)-->

- [Spring 기반 영화 스트리밍 서비스 (2019.03 ~ 2019.04 / 18일)](https://github.com/includesorrow/WAFLIX)

- Hadoop Eco-System 기반 신용등급 확인 프로젝트 (2019.05 ~ 2019.06 / 15일)

- [화분 프로젝트 (2019.08 ~ 2019.08 / 14일)](https://github.com/includesorrow/Hwabun)

<!-- ## 기술블로그(개인블로그?)(https://includesorrow.tistory.com/)-->



<!--## 교육-->

<!--1. DataBreak 2018: Hello Kaggler! (2018.10.7)
- 주최기관 : KaggleBreak
- 내용 : [데이터 과학을 쉽게 입문할 수 있는 캐글을 알리고, 데이터 과학에 관심있는 다양한 사람들과 만나 서로의 지식 경험을 공유하는 자리](https://databreak.org/databreak2018/)-->

<!--2. Data playground (2019.06.28)
- 주최기관 : KaggleBreak
- 내용 
  1) [Data Lake 구축을 위한 AWS 환경에서 데이터 파이프라인 구성기 (권낙주님(SK C&C))](https://github.com/KaggleBreak/databreak/raw/master/2019/meetup/3st/DataLake%EA%B5%AC%EC%B6%95%EC%9D%84%EC%9C%84%ED%95%9CAWS%ED%99%98%EA%B2%BD%EC%97%90%EC%84%9C%EB%8D%B0%EC%9D%B4%ED%84%B0%ED%8C%8C%EC%9D%B4%ED%94%84%EB%9D%BC%EC%9D%B8%EA%B5%AC%EC%84%B1%EA%B8%B0_%EA%B6%8C%EB%82%99%EC%A3%BC.pdf)
  2) [하둡과 Kudu를 활용한 Data Lake 활용 사례 (지용기님(굿모닝아이텍))](https://github.com/KaggleBreak/databreak/raw/master/2019/meetup/3st/DataPlayground%407_%ED%95%98%EB%91%A1%EA%B3%BCKudu%EB%A5%BC%ED%99%9C%EC%9A%A9%ED%95%9CDataLake%ED%99%9C%EC%9A%A9%EC%82%AC%EB%A1%80.pdf)-->
  
<!--3. Kafka Conference seoul 2019 (2019.10.18)
- 주최기관 : Kafka KRU
- 내용
  1) How to utilize KAFKA more efficiently (고승범)
  2) KSQL vs Kafk Streams (Mark Teehan)
  3) Producer와 Consumer (강한구)
  4) Kafka Streams: Interactive Queries (이동진)
  5) Kafka 모니터링을 위한 Metrics 이해 (박상원)
  6) 카카오 Datalake 소개 (윤도영)
  7) From zero to Hero with Kafka Connect (Mark Teehan)
- [행사링크](https://www.onoffmix.com/event/196156)-->

<!--1. 빅데이터 활용을 위한 DB관리
2. 머신러닝 지식기반의 데이터 사이언티스트 과정
- 기관 : KOSTA
- 교육내용  
  - Java, Spring, SQL, Python, Hadoop Eco-system
- 프로젝트
  - Spring 기반 영화 스트리밍 사이트
  - Hadoop Eco-system 기반 신용등급 확인 프로젝트

<!--3. 아파치 카프카 입문과 활용
- 주최기관 : Tacademy
- 내용
  1) Kafka 기본개념 및 생태계
  2) Kafka 설치, 실행, CLI
  3) Kafka Producer application
  4) Kafka Consumer application
  5) Kafka 활용 실습
- [강의링크](https://tacademy.skplanet.com/live/player/onlineLectureDetail.action?seq=183)
## 발표 PPT
### Hadoop Eco-system PPT
- 데이터 엔지니어 기술에 관심이 생겨 개인적으로 공부했던 내용을 바탕으로 공유차 작성하였습니다.
- PPT 내용 
1. 하둡에 대한 이해
2. HDFS, MapReduce 아키텍쳐
3. 하둡 1.X과 2.X의 차이
4. Flume, Hive, Spark 소개 및 아키텍처
5. Hadoop과 Spark의 차이
해당 PPT : [링크](https://github.com/includesorrow/Credit_Rating_Analysis_Project/files/3728951/%2B.Flume%2BHive%2BSpark._.pptx) -->



<!--## 마치며
### 코드 기획에 큰 시간을 들이는 개발자입니다.
코드를 한번 만들고 지속해서 수정에 수정을 거듭하지 않고 일단 한번 깔끔하게 잘 만들어놓을려고 노력합니다.
코드 리뷰를 좋아하며, 잘못된 부분이 있으면 고치고자 노력합니다.
### 작은 성취에도 행복해합니다.
코드가 안되어서 뭐가 문제인지 한참 고민하다가 오타인 사실을 알아내도 행복해합니다.
단 한줄이라도 정말 좋은 생각이였다고 생각되는 코드이면 뿌듯함이 오래갑니다. 
또한 다른 사람들의 코드를 보면서 자신의 코드가 어느 부분이 단점인지 생각해봅니다.-->




