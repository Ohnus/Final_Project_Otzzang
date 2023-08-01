<br>
<div align="center">
<img src="https://github.com/Ohnus/Final_Project_Otzzang/assets/88930889/91cd377c-c4d2-4090-a29f-4ab1d3354cf8">
</div>
<br>

## 🔗 Link
- **Repository**: https://github.com/Ohnus/Final_Project_Otzzang
<br>

## 🗂️ Table of Contents
- [👔 Introduction](#-introduction)
- [🤝 Team Members](#-team-members)
- [💻 Technologies Used](#-technologies-used)
- [🔍 Features](#-features)
- [📸 Screenshots](#-screenshots)
- [🛠 Prerequisites](#-prerequisites)
- [📥 Installation](#-installation)
- [📝 Changelog](#-changelog)
- [📧 Contact](#-contact)
<br>

#
### 👔 Introduction
- 프로젝트 이름: Otzzang(옷짱)
- 프로젝트 기간: 2023.06.12 ~ 2023.07.12
- 프로젝트 내용: 온라인 옷장으로 내 옷을 관리하고, 나의 옷장에서 날씨와 기온에 따른 옷을 추천해주는 서비스
- 프로젝트 목적: 해당 프로젝트는 KOSTA 257기 교육기간 중 진행된 파이널 프로젝트입니다. 교육기간 중 배운 JPA, REST API 기반 SpringBoot와 Vue.js 기술을 프로젝트에 도입함으로써 기술을 숙달하고, 기존 개발패턴이었던 jsp, handler, jQuery에서 새로운 개발패턴을 익히기 위해 진행된 프로젝트입니다.
<br>

### 🤝 Team Members
- 이주원
- 봉선호: https://github.com/Ohnus
- 문승미: https://github.com/moonparks
- 최예은: https://github.com/YeeBoss
- 손행원
<br>

### 💻 Technologies Used
- Programming Languages: Java, HTML5, CSS3, JavaScript
- Framework/Library: SpringBoot, JPA, REST API, Vue.js
- Server: Oracle DB, Apache Tomcat
- Envrionment/Tooling: Eclipse, VS Code, GitHub, Sourcetree
- Open API: 기상청 단기예보 API, 한국천문연구 출몰시각 API, 카카오 로컬 API, 네이버쇼핑 API
<br>

### 🔍 Features
#### 1. Member Part
> - 회원가입 시 정규표현식을 통한 유효성 검사
> - 유효성 검사 대상: 아이디, 비밀번호, 이메일, 닉네임
> - 로그인, 아이디 비밀번호 찾기 기능
> - 이메일 인증 기능
#### 2. Weather Part
> - 현 위치의 24시간 기상 정보를 3가지 API를 통해 불러오기
> - 날씨에 따른 view 아이콘 및 배경 변화
> - 현재 기온을 기준으로 기온별 추천 옷을 카테고리별로 추천
> - 추천된 카테고리로 옷장에서 옷 정보를 카드 형식으로 불러옴
> - 옷 정보가 없을 경우 네이버 쇼핑 API로 연동된 옷 검색 결과를 불러옴
> - 현재 기온과 유사한 날에 기록된 OOTW 게시글을 불러와 과거 옷차림 기록을 볼 수 있음
#### 3. Closet & OOTW(Outfit of the weather) Board Part
> - 이미지 drag&drop을 통해 옷장에 내 옷 등록하기
> - 메뉴바에서 옷 카테고리 클릭하여 리스트 필터링
> - 옷 키워드로 검색하여 리스트 필터링
> - 즐겨찾기, 수정, 삭제 기능으로 옷 관리하기
> - 2차원 배열과 JavaScript filter, find method를 활용한 더보기 기능
> - 옷장에 등록된 옷을 바탕으로 OOTW 게시판에 날짜, 날씨, 기온, 간단한 커멘트와 함께 기록하기
> - 날짜, 기온, 키워드로 작성된 게시글 검색하여 리스트 필터링
> - 옷장에 등록된 옷이 삭제되면 해당 옷이 등록된 모든 OOTW 게시글 자동 삭제 기능
#### 4. Outfit Coordination Board Part
> - 
#### 5. Battle Board Part
> - 매주 새로운 테마로 진행되는 테마에 맞는 코디 배틀 게시판
> - 금, 토, 일요일은 관리자에 의해 선정된 배틀 테마로 유저들이 테마에 맞는 코디 사진을 첨부하여 배틀 신청
> - 월요일 오전 10시까지 관리자가 배틀을 신청한 유저들 중 랜덤으로 2명을 후보로 선정
> - 선정된 2명의 후보는 월, 화, 수요일에 비밀투표를 받게 되고, 투표에 참여한 유저는 선택 번복 불가능
> - 수요일 밤 11시59분까지 투표를 진행하고 목요일 자정에 자동 집계하여 이 주의 우승자를 선정
> - 선정된 우승자는 일주일간 '이 주의 우승자' 게시판에 노출되며, 명예의 전당에 오르게 됨
<br>

### 📸 Screenshots
<h4>[Main]</h4><br>
<img src="https://github.com/Ohnus/Final_Project_Otzzang/assets/88930889/a84cbfe0-a86d-4d6d-b4dc-4a9dc55ec83e" width="80%">
<br>

<h4>[Member]</h4><br>
<img src="https://github.com/Ohnus/Final_Project_Otzzang/assets/88930889/b43a1c02-d8b6-4ae1-b5f7-84d792eef37a" width="22%">
<img src="https://github.com/Ohnus/Final_Project_Otzzang/assets/88930889/088526e9-f5dc-4ba8-87a1-9e9a14a9c791" width="22%">
<img src="https://github.com/Ohnus/Final_Project_Otzzang/assets/88930889/15d2a6a4-9e36-4834-b4c6-acbfd73fa127" width="47%">
<br>
<img src="https://github.com/Ohnus/Final_Project_Otzzang/assets/88930889/5862bd23-1969-4f2d-9f8e-f01edb52288f" width="30%">
<img src="https://github.com/Ohnus/Final_Project_Otzzang/assets/88930889/23145c20-b146-4456-bd87-c8c93a8ad86c" width="30%">
<img src="https://github.com/Ohnus/Final_Project_Otzzang/assets/88930889/f397f763-570c-4183-961d-532054170b69" width="30%">
<br>
<img src="https://github.com/Ohnus/Final_Project_Otzzang/assets/88930889/f83ffb6d-2728-44be-bbdb-29d3893e262c" width="60%">

<h4>[Weather]</h4><br>
<img src="https://github.com/Ohnus/Final_Project_Otzzang/assets/88930889/c67b6820-134e-4b3b-993e-2344db96243f" width="80%">
<br>
<img src="https://github.com/Ohnus/Final_Project_Otzzang/assets/88930889/377618e7-c820-4055-94b4-15ae51bcca3b" width="80%">
<br>
<img src="https://github.com/Ohnus/Final_Project_Otzzang/assets/88930889/f9ef559a-e48d-414b-bb47-e4288c6d2f97" width="80%">
<br>
<img src="https://github.com/Ohnus/Final_Project_Otzzang/assets/88930889/d4fb0d04-913e-4782-a4ba-c96c4a901d0d" width="80%">
<br>
<img src="https://github.com/Ohnus/Final_Project_Otzzang/assets/88930889/9e436717-a959-4d93-916f-dc926ae1bb78" width="80%">
<br>

<h4>[Closet]</h4><br>
<img src="https://github.com/Ohnus/Final_Project_Otzzang/assets/88930889/94ff3fd4-5200-4fa8-b4e2-41882231b9c7" width="80%">
<img src="https://github.com/Ohnus/Final_Project_Otzzang/assets/88930889/1ceb115b-7788-40f4-8612-6d451760fadd" width="80%">
<img src="https://github.com/Ohnus/Final_Project_Otzzang/assets/88930889/b56c9c97-17b8-48dc-ba7e-739c409362ce" width="80%">
<img src="https://github.com/Ohnus/Final_Project_Otzzang/assets/88930889/97a2a8b1-c153-4563-9cc1-88def243fdef" width="80%">
<br>

<h4>[OOTW]</h4><br>
<img src="https://github.com/Ohnus/Final_Project_Otzzang/assets/88930889/b59313d9-600e-4b7a-92be-bb3d5824504b" width="80%">
<img src="https://github.com/Ohnus/Final_Project_Otzzang/assets/88930889/3615b5e8-e04f-4124-a42a-0d659be7663a" width="80%">
<img src="https://github.com/Ohnus/Final_Project_Otzzang/assets/88930889/f1a61fae-cdba-46e3-8bee-9626025ddaf8" width="80%">
<img src="https://github.com/Ohnus/Final_Project_Otzzang/assets/88930889/b19ba509-95a7-4ce9-9298-2cee43bba8ed" width="80%">
<br>

<h4>[Coordi]</h4><br>
<img src="https://github.com/Ohnus/Final_Project_Otzzang/assets/88930889/91829290-8e7b-416c-bfad-b62bee64758a" width="80%">
<img src="https://github.com/Ohnus/Final_Project_Otzzang/assets/88930889/41371115-911c-4f47-b674-e286b8f94103" width="80%">
<img src="https://github.com/Ohnus/Final_Project_Otzzang/assets/88930889/275de3dc-0ff5-4e59-bc56-0221b2c5bd9b" width="80%">
<img src="https://github.com/Ohnus/Final_Project_Otzzang/assets/88930889/912aa5c1-1a47-49b2-bed1-e3943d2fde15" width="80%">
<img src="https://github.com/Ohnus/Final_Project_Otzzang/assets/88930889/f55c3a24-28a7-4eeb-850d-3a565ee155da" width="80%">
<img src="https://github.com/Ohnus/Final_Project_Otzzang/assets/88930889/40f3fe80-9554-4adc-a78d-0dd53d0ee3a1" width="80%">
<img src="https://github.com/Ohnus/Final_Project_Otzzang/assets/88930889/78255801-18ca-41a7-ac04-52369c08208f" width="80%">
<img src="https://github.com/Ohnus/Final_Project_Otzzang/assets/88930889/9c2fd952-5fc9-4c78-b920-d6b9406b3310" width="80%">
<br>

<h4>[Battle]</h4><br>
<img src="https://github.com/Ohnus/Final_Project_Otzzang/assets/88930889/7168ec13-0df2-4fc8-9b0b-de2f47ac6918" width="80%">
<img src="https://github.com/Ohnus/Final_Project_Otzzang/assets/88930889/bf0958d6-fb5a-4009-8640-6efd7008fd4f" width="80%">
<img src="https://github.com/Ohnus/Final_Project_Otzzang/assets/88930889/238b25da-edff-4e57-be47-1284945ae7ea" width="80%">
<img src="https://github.com/Ohnus/Final_Project_Otzzang/assets/88930889/d15df026-16f9-48bf-a787-316f7d3affe6" width="80%">
<img src="https://github.com/Ohnus/Final_Project_Otzzang/assets/88930889/619629ee-7d00-4783-bbdf-762795160611" width="80%">
<img src="https://github.com/Ohnus/Final_Project_Otzzang/assets/88930889/dd587e57-b329-45fc-959b-3633685be5cf" width="80%">
<img src="https://github.com/Ohnus/Final_Project_Otzzang/assets/88930889/75041d47-0c89-4600-b9c0-0712d340147c" width="80%">
<br>

### 🛠 Prerequisites
- (Under construction)
<br>

### 📥 Installation
- (Under construction)
<br>

### 📝 Changelog
- No Changes Yet
<br>

### 📧 Contact
- 이주원: joowon0410@gmail.com
- 봉선호: sh525293@gmail.com
- 문승미: mun75056@gmail.com
- 최예은: oloer12@gmail.com
- 손행원: thsgoddnjs@gmail.com
<br>
