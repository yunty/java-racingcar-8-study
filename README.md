# java-racingcar-precourse
# [프로젝트 이름]

> [프로그램이 무엇을 하는지 한 문장으로 설명]

> [순서]
> 사용자 입력 안내 출력 &rarr; 사용자 입력받기 &rarr; 도메인 &rarr; 실행 결과 출력 &rarr; 우승자 출력 
## 📋 기능 목록

### 1. 입력

- [ ] 자동차 이름을 입력받는다.
    - 입력 형식: `[쉼표로 구분된 문자열 / ","]`
- [ ] 시도할 횟수를 입력받는다.
  - 입력 형식 : `[숫자]`

### 2. 핵심 기능

- [ ] 자동차를 생성한다.
    - 적용 규칙: [입력받은 이름의 개수만큼]
- [ ] 각 차수별 랜덤 숫자를 생성한다
    - 적용 규칙: [각 자동차마다 독립적인 숫자, 0-9 사이 숫자]
- [ ] 랜덤 숫자를 비교하여 전진 혹은 재자리를 유지한다.
    -  적용 규칙 : [숫자가 4이상일 시 전진]
- [ ] 입력받은 시도 횟수를 만족하면 결과 출력 및 실행을 종료한다.

### 3. 출력

- [ ] [사용자에게 필요한 안내]를 출력한다.
  - [ ] 출력 형식 : `[경주할 자동차 이름을 쉼표(,)로 구분하여 입력한다.]`
  - [ ] 출력 형식 : `[시도할 회수는 몇회인가요?]`
- [ ] [각 차수별 현재 상태]를 출력한다.
  - [ ] 출력 형식 : `[실행 결과]` ~~
- [ ] [최종 결과]를 지정된 형식으로 출력한다.
    - 출력 형식: `[최종 우승자 : pobi, jun]`

### 4. 예외 처리

- [ ] 입력받은 이름의 형식 예외 발생
  - [ ] null값
  - [ ] Empty 값
  - [ ] 이름의 길이가 5 초과
- [ ] 입력받은 횟수의 형식 예외 발생
  - [ ] null 값
  - [ ] Empty 값
  - [ ] 숫자가 아닌경우
- [ ] 예외 발생 후 종료한다.

## ✅ 테스트 계획



## 객체별 책임
- Car
  - String name
  - int moveCount
  - Car(String name)
  - move(int randomNumber)
  - getName()
  - getCount()
  - validate : 5자 이하
- Cars
    - list<Car> cars
    - Cars(String names)
    - move(int randomNumber)
    - getMax()
    - String[] getWinner()
    - validate() :쉼표분리
- RandomNumberGenerate
  - static generate()
- InputValidator
  - static validateNull
  - static validateEmpty
- ErrorMessege / enum
  - Null값을 입력할 수 는 없습니다.
  - 빈값을 입력할 수 는 없습니다.
  - 이름은 5자이하만 가능합니다.
  - 횟수는 숫자만 입력 가능합니다.
- RacingGameException / Exception
- InputView
  - getUserInput()
- OutputView
  - printInputNameComment()
  - printInputTryCountComment()
  - printTryResult()
  - printWinner(String[] names)

## 테스트

- [ ] 정상 입력에서 예상한 결과가 나온다.
- [ ] 경계값이 규칙에 맞게 처리된다.
- [ ] 잘못된 입력에서 요구된 예외 처리가 실행된다.

# [프로젝트 이름]

> [프로그램이 무엇을 하는지 한 문장으로 설명]

## 📋 기능 목록

### 1. 입력

### 2. 핵심 기능


### 3. 출력


### 4. 예외 처리


## ✅ 테스트 계획


## 객체별 책임

| 객체 | 책임 |    
| --- | --- |    
| `InputView` | 사용자 입력을 받는다 |    
| `[도메인 객체]` | 핵심 규칙을 수행하고 값과 상태를 검증한다 |    
| `OutputView` | 안내 문구와 결과를 출력한다 |    
| `[진행 객체]` | 입력, 핵심 기능, 출력의 실행 흐름을 연결한다 |    

## 테스트