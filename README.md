# java-racingcar

자동차 경주 게임 미션 저장소

## 🎯 구현 목록

- 자동차
    - [x] 자동차 생성(n대)
    - [x] 자동차 움직임 (전진)
    - [x] 자동차 이름 부여 기능
    - [x] 값이 4이상 전진, 3이하 정지
    - [x] 자동차 위치 문자열 표현 기능
- 검증
    - [x] 자동차 이름 5자 이하
    - [x] 사용자 입력 이동횟수 자연수
- 게임 진행
    - [x] 게임 횟수 지정
    - [x] 지정된 게임 횟수 실행
    - 판정
        - [x] 우승자 판정
            - 가장 멀리간 자동차(들)
    - 자동차 그룹
        - [x] 모든 자동차에 대한 이름 부여 기능
        - [x] 모든 자동차에 대한 게임 진행 기능
            - 각 자동차에 대해 랜덤 값 입력
- 입력
    - [x] 사용자 자동차 입력. ','로 구분
    - [x] 사용자 이동횟수 입력
- 출력
    - [ ] 우승자 출력
        - 한 명 이상이면 ','로 구분해 출력

## 🚀 기능 요구사항

- 주어진 횟수 동안 n대의 자동차는 전진 또는 멈출 수 있다.
- 각 자동차에 이름을 부여할 수 있다. 전진하는 자동차를 출력할 때 자동차 이름을 같이 출력한다.
- 자동차 이름은 쉼표(,)를 기준으로 구분하며 이름은 5자 이하만 가능하다.
- 사용자는 몇 번의 이동을 할 것인지를 입력할 수 있어야 한다.
- 전진하는 조건은 0에서 9 사이에서 random 값을 구한 후 random 값이 4 이상일 경우 전진하고, 3 이하의 값이면 멈춘다.
- 자동차 경주 게임을 완료한 후 누가 우승했는지를 알려준다.
- 우승자가 한 명 이상일 경우, 쉼표(,)로 이름을 구분해 출력한다.
- 사용자가 잘못된 값을 입력할 경우 “[ERROR]”로 시작하는 에러 메시지를 출력 후 입력을 다시 받는다.

**실행 결과**

- 위 요구사항에 따라 3대의 자동차가 5번 움직였을 경우 프로그램을 실행한 결과는 다음과 같다.

```
경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).
pobi,crong,honux
시도할 회수는 몇회인가요?
5

실행 결과
pobi : -
crong : -
honux : -

pobi : --
crong : -
honux : --

pobi : ---
crong : --
honux : ---

pobi : ----
crong : ---
honux : ----

pobi : -----
crong : ----
honux : -----

pobi : -----
crong : ----
honux : -----

pobi, honux가 최종 우승했습니다.
```

## 프로그래밍 요구사항

- 모든 로직에 단위 테스트를 구현한다. 단, UI(System.out, System.in) 로직은 제외
- 자바 코드 컨벤션을 지키면서 프로그래밍한다.
    - 참고문서: https://google.github.io/styleguide/javaguide.html 또는 https://myeonguni.tistory.com/1596
- 규칙 1: 한 메서드에 오직 한 단계의 들여쓰기(indent)만 한다.를 지키며 구현한다.
    - 예를 들어 while문 안에 if문이 있으면 들여쓰기는 2이다.
    - 힌트: indent(인덴트, 들여쓰기) depth를 줄이는 좋은 방법은 함수(또는 메소드)를 분리하면 된다.
- 규칙 2: else 예약어를 쓰지 않는다.를 지키며 구현한다.
    - 힌트: if 조건절에서 값을 return하는 방식으로 구현하면 else를 사용하지 않아도 된다.
    - else를 쓰지 말라고 하니 switch/case로 구현하는 경우가 있는데 switch/case도 허용하지 않는다.
- 함수(또는 메소드)의 길이가 10라인을 넘어가지 않도록 구현한다.
    - 함수(또는 메소드)가 한 가지 일만 잘 하도록 구현한다.
    -

## 프로그래밍 요구사항2 - 2주차 추가

- 일급콜렉션을 활용해 구현한다.
    - 참고문서: https://developerfarm.wordpress.com/2012/02/01/object_calisthenics_/
- 모든 원시값과 문자열을 포장한다.
    - 참고문서: https://developerfarm.wordpress.com/2012/01/27/object_calisthenics_4
    -

## 기능 목록 및 commit 로그 요구사항

- 기능을 구현하기 전에 README.md 파일에 구현할 기능 목록을 정리해 추가한다.
- git의 commit 단위는 앞 단계에서 README.md 파일에 정리한 기능 목록 단위로 추가한다.