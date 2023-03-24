# dividend project

Description : 주식 배당금 API 서비스

2023-03-20 ~ 2023-03-24

## 프로젝트 목표
- 필요한 배당금 정보 스크래핑 하기
- 서비스 제공을 위한 API 구현
- 서비스 별 접근 권한 설정
- 매일 밤 자정 마다 배당금 정보 업데이트를 위한 스케줄링
- Thread Pool이 무엇이고 필요한 이유 알기
- 서버 부하를 줄이기 위한 캐시 서버 구성(redis)
- JWT를 이용하여 토큰 파싱
- 회원가입, 로그인 기능 구현
- 회원가입을 통해 서비스 접근 권한 부여
## 스크래핑 사이트
[야후 파이낸스](https://finance.yahoo.com/)

## 사용 스택
![image](https://user-images.githubusercontent.com/102509636/227448656-b24b6c73-92ae-4219-beb1-9ca08c0f34a4.png)

![image](https://user-images.githubusercontent.com/102509636/227448692-f849f733-ec4a-41ea-9aa4-7b8403a46d28.png)
![image](https://user-images.githubusercontent.com/102509636/227448758-6146774c-5b40-4e7d-b949-862170add5ed.png)
![image](https://user-images.githubusercontent.com/102509636/227448768-a8a0d208-ef0a-4e0e-958a-8c81e13c0761.png)
![image](https://user-images.githubusercontent.com/102509636/227448788-3e24cc79-0717-424f-be61-4f787bd4ace4.png)
![image](https://user-images.githubusercontent.com/102509636/227448833-891b8f58-0d48-4688-a864-d8b0ec9e7865.png)
![image](https://img.shields.io/badge/redis-DC382D?style=for-the-badge&logo=Redis&logoColor=white)

## 주요 기능
- 서비스 구현
  - 회사(배당금) 저장
  - 전체 회사 조회
  - 회사 정보 조회 - 자동완성
  - 회사 삭제
- 회원 관리
  - 회원 가입
  - 로그인
  
  ![image](https://user-images.githubusercontent.com/102509636/227458643-3960946e-6dc7-4824-bca1-4e604899afb3.png)

