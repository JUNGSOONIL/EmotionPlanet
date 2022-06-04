<h1 align="center">EmotionPlanet</h1>

### 목차

---

1. [프로젝트 소개](#-프로젝트-소개)
2. [사용스택](#사용스택)
3. [Project Period](#project-period)
4. [Constributors](#constributors)
5. [기능 상세](#기능-상세)

---

## 📖 프로젝트 소개

`EmotionPlanet` 은 사용자 감정 기반 SNS & 큐레이팅 서비스 입니다.


📜 [노션](https://ionized-sugar-931.notion.site/B-Noty-cf7e5b4f43754c178652ae2f23698852)

-   기획 내용
    사용자에게 로그인 시 감정테스트를 제공, 테스트로 유추한 감정 결과를 토대로 SNS서비스에 이용될 태그 제공, 추천 음악, 영화, 활동 정보 등의 추천 서비스 제공

---

## 사용스택

| 용도      | 스택                                                                                                                                                                                                           | 버전  |
| --------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----- |
| 코드 편집 | <img src="https://img.shields.io/badge/Visual Studio Code-007ACC?style=plastic&logo=Visual Studio Code&logoColor=white">                                                                                       | v1.64 |
| DB        | <img src="https://img.shields.io/badge/MySQL-FFCA28?style=plastic&logo=MySQL&logoColor=white">                                                                                                              |       |
| 형상관리  | <img src="https://img.shields.io/badge/git-F05032?style=plastic&logo=git&logoColor=white">                                                                                                                     |       |
| 협업      | <img src="https://img.shields.io/badge/Jira Software-0052CC?style=plastic&logo=Jira Software&logoColor=white"><img src="https://img.shields.io/badge/Notion-000000?style=plastic&logo=Notion&logoColor=white"> |       |

---

## Project Period

2022.01.04 - 2022.02.18 (7주)

---

## Constributors

| 팀원   | 역할                             | 비고 | 깃허브                            |
| ------ | -------------------------------- | ---- | --------------------------------- |
| 조은누리 | 팀장, 프론트 담당               |      | https://github.com/eunnuricho     |
| 임경훈 | 프론트 담당                       |      | https://github.com/KyounghoonLim  |
| 전호정 | 프론트 담당                       |      | https://github.com/hojeong33      |
| 정순일 | 백 담당                           |      | https://github.com/JUNGSOONIL     |
| 최명재 | 프론트 담당                       |      | https://github.com/HKLM93         |
| 최상후 | 백 담당                           |      | https://github.com/Neungji-Baksal |

---

## 기능 상세

-   회원가입, 로그인, 감정테스트

       ![login](https://user-images.githubusercontent.com/88392868/171982162-e68359c3-3ca6-49cb-9067-cd99f6b47940.gif)
        ▶ 이메일, 닉네임, 전화번호 input event 발생시마다 DB의 데이터와 비교, 유효성 검증 제공을 통해 쾌적한 회원가입 제공

    ▶ Google OAuth2, Kakao를 이용한 소셜 로그인 제공

    ▶ 로그인 이후 감정 테스트로 redirect(여섯 가지의 감정 카테고리에서 랜덤 키워드 서버에서 받아와 테스트 진행, 아직 안할래요 버튼 클릭시 메인 페이지로 redirect, '떠돌이 행성' 으로 선택)
        
-   메인페이지

       <img src="exec/main.gif">
        ▶ 메인 페이지의 추천 목록은 carousel 형식으로 fit 한 UI 구현, 사용자 편의성 제공

    ▶ 메인 페이지의 추천 목록에서 찜 목록에 담을 수 있음. 찜 목록은 음악, 영화, 활동 세 카테고리마다 따로 존재

    ▶ 피드 작성은 네비게이션 바 버튼과 사이드 카드의 버튼으로 사용. 현재 제공된 감정 태그가 자동으로 입력됨. 또한, 해당 감정에서 어떤 활동을 하였는지 한정된 키워드를 통해서 선택 후 작성

-   유저검색 및 피드

       ![search](https://user-images.githubusercontent.com/88392868/171982260-f6cb2834-5cca-407a-bfa8-c40091089f81.gif)
        ▶ 검색바에 키워드 input event 시 서버에 저장된 게시글, 사용자, 찜 목록 이름과 대조해 결과 제공

    ▶ 검색 결과를 선택해 해당 페이지로 이동

    ▶ 유저 페이지에서 해당 유저의 게시글, 찜 목록 조회 가능

-   실시간 알림 및 설정

       ![set](https://user-images.githubusercontent.com/88392868/171982282-86304238-e33f-4a6c-a843-323161172f71.gif)

    ▶ 사용자 프로필 변경 페이지에서 프로필 이미지, 닉네임, 소개글, 비밀번호 변경 제공

-   그외
    - 이메일 찾기, 비밀번호 찾기 제공. 비밀번호 찾기 시 데이터 검증 후 해당 이메일로 임시 비밀번호 제공
    - 각 기능별 제작된 modal 사용으로 UI 통일성 제공
    - WebSocket 연결로 실시간 알림 제공
    - 서버측에 요청을 보내는 기능의 경우,  access token이 만료되었을 경우 갱신(로그인 시 access token과 refresh token을 반환하여 사용)
    - 음악 데이터의 경우 spotify, 영화의 경우 TMDB, 활동의 경우 자체적으로 추가한 데이터 제공
    - 감정 테스트 알고리즘은 간단한 키워드 선택의 순서, 갯수별로 점수화하여 결과 도출
