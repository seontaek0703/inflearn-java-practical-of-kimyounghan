# JAVA - mid1 (3/7)

## 오브젝트 클래스

### java.lang Package
자바에서 기본으로 제공하는 라이브러리 중에서도 가장 기본이 되는 패키지

#### java.lang의 대표격 클래스들
* Object: 모든 자바 객체의 부모 클래스
* String: 문자열
* Integer, Long, Double: 래퍼 타입, 기본형 타입을 객체로 만든 것
* Class: 클래스 메타 정보
* System: 시스템 관련 기본 기능들 제공

#### Object 클래스가 최상위 클래스인 이유
* 공통 기능 제공
  + toString(): 객체의 정보를 제공
  + equals(): 객체의 같음을 비교
  + getClass(): 객체의 클래스 정보 제공
  + 기타 등등
* 다형성 기본 구현
    + Object는 최상위 클래스로서 모든 자바 객체는 Object 타입으로 처리될 수 있다.

> Implicit vs Explicit
> > Implicit: 개발자가 직접 구현하지 않아도 시스템 또는 컴파일러에 의해 자동으로 수행되는 것  
> > Explicit: 개발자가 직접 구현해 작동시키는 것

#### Object 다형성의 장점
어떤 객체든 인자로 전달할 수 있다.

#### Object 다형성의 한계
하위 클래스의 메서드는 Object에 존재할 수 없어 호출할 수 없다.  
(다운캐스팅이 필요하다.) (오버라이딩도 할 수 없다.)

### Object 배열
Object[]를 만들면 세상의 모든 객체를 담을 수 있는 배열이 생성됨.

### toString()
```java
public String toString() {
  return getClass().getName() + "@" + Integer.toHexString(hashCode());
}
```
객체의 정보를 문자열 형태로 제공해 디버깅과 로깅에 유용하다.  
Object 클래스에 정의되어있어 모든 클래스에서 상속 받아 사용할 수 있다.

### Object와 OCP
Object와 toString()이 없다면 관계가 없는 객체의 정보를 출력하는건 매우 번거로웠을 것.  
각각의 클래스마다 객체 정보를 호출할 수 있는 메서드를 만들어야 했을수도 있다.

#### 정적 의존관계 vs 동적 의존관계
* 정적 의존관계는 컴파일 시간에 결정되며, 주로 클래스 간 관계를 의미함. 프로그램을 실행하지 않고 클래스 내에서 사용하는 타입들로 쉽게 의존관계를 파악할 수 있다.
* 동적 의존관계는 프로그램을 실행하는 런타임에 확인할 수 있다. 런타임에 어떤 인스턴스를 사용하는지 나타내는 것이 동적 의존관계다.

### equals(), 등일성과 동등성
* 동일성(Identify): == 연산자를 사용해 두 객체의 참조가 동일한 객체를 가리키고 있는지
* 동등성(Equality): equals() 메서드를 사용하여 두 객체가 논리적으로 동등한지

#### 정확한 equals() 구현 규칙
* 반사성(Reflexivity): 객체는 자기 자신과 동등해야 함
* 대칭성(Symmetry): 두 객체가 서로 동일하다고 판단하면 양방향으로 동일해야 함
* 추이성(Transitivity): 1번 객체가 2번객체와 동일하고 2번 객체가 3번 객체와 동일하면 1번 객체는 3번 객체와 동일해야 함
* 일관성(Consistency): 두 객체의 상태가 변경되지 않는 한, equals() 메서드는 항상 동일한 값을 반환해야 함
* null에 대한 비교: 모든 객체는 null과 비교했을 때 false를 반환해야 함

## 불변 객체

### 기본형과 참조형의 공유
* 기본형(Primitive Type): 하나의 값을 여러 변수에서 절대로 공유하지 않음
* 참조형(Reference Type): 하나의 객체를 참조값을 통해 여러 변수에서 공유할 수 있음

#### 공유 참조와 사이드 이펙트(Side Effect: 부작용)
주 목적을 가진 작업 외에 부수 효과를 가진 사이드 이펙트는 변경이 의도치 않게 다른 부분에 영향을 미치는 경우로 디버깅이 어려워지고 코드의 안정성이 저하될 수 있다.

* 해결 방안: 공유 참조에서의 사이드 이펙트를 제외시키는 좋은 방법은 서로 다른 인스턴스를 참조하게 하는 것.

### 불변 객체 도입
객체의 상태(객체 내부의 값, 필드, 멤버 변수)가 변하지 않는 객체는 불변 객체(Immutable Object).

### 불변 객체 값 변경
불변 객체를 사용함에도 값을 변경해야하는 메서드가 필요하다면 return value를 새로운 객체에 던져 넘긴다.

<<<<<<< HEAD
> **withVoca()**  
> 불변 객체에서 값을 변경하는 경우 withVoca()와 같은 형식을 가진다
> 이는 그 메서드가 지정된 수정사항을 포함하는 객체의 새 인스턴스를 반환한다는 사실을 뜻한다
> withVoca()는 관례 중 하나이고, 원본 객체의 상태가 그대로를 유지하면서 변경사항을 새 복사본(객체)에 포함하는 과정을 표현한다
 
=======
## String 클래스 - 기본
* char
* String

> Java9부터 String 클래스의 변화
> > 기존 문자열을 담던 char[] 대신에 byte[]가 역할을 대신하게 됨
> > char는 기본적으로 2byte 메모리를 사용하기에 1 byte만 필요한 단순 영어와 숫자는 1 byte만 사용하고
> > 이외에는 UTF-16 인코딩을 사용해 메모리 효율을 높이고자 함.

### String 클래스의 기능(메서드)
* length(): 문자열의 길이를 반환한다.
* charAt(int index): 특정 인덱스의 문자를 반환한다. 
* substring(int beginIndex, int endIndex): 문자열의 부분 문자열을 반환한다.
* indexOf(String str): 특정 문자열이 시작되는 인덱스를 반환한다.
* toLowerCase(), toUpperCase(): 문자열을 소문자 또는 대문자로 반환
* trim(): 문자열 양 끝의 공백을 제거
* concat(String str): 문자열을 더한다.

### String 클래스 - 비교
String 클래스를 비교할때는 == 연산자가 아닌 equals()를 비교해야 한다.
* 동일성(Identify): == 연산자를 사용해 두 객체의 참조가 동일한 객체를 가리키고 있는지
* 동등성(Equality): equals() 메서드를 사용해 두 객체가 논리적으로 같은지 확인

#### 문자열 리터럴, 문자열 풀
* String str3 = "hello"와 같이 문자열 리터럴을 사용하는 경우 자바는 메모리 효율성과 성능 최적화를 위해 문자열 풀을 사용한다.
* 자바가 실행되는 시점에 클래스에 문자열 리터럴이 있으면 문자열 풀에 String 인스턴스를 미리 만들어둔다. 이때 같은 문자열이 있으면 만들지 않는다.
* String str3 = "hello"와 같이 문자열 리터럴을 사용하면 문자열 풀에서 "hello"라는 문자를 가진 String 인스턴스를 찾는다. 그리고 찾은 인스턴스의 참조(x003:예시)를 반환한다.
* String str4 = "hello"의 경우 "hello" 문자열을 리터럴을 사용하므로 문자열 풀에서 str3와 같은 x003:예시 참조를 사용한다.
* 문자열 풀 덕분에 같은 문자를 사용하는 경우 메모리 사용을 줄이고 문자를 만든느 시간도 줄어들기 때문에 성능도 최적화 할 수 있다.

### String 클래스 - 불변 객체
#### String이 불변으로 설계된 이유
문자열 풀에 있는 String 인스턴스의 값이 중간에 변경되면 같은 문자열을 참고하는 다른 변수의 값도 함께 변경된다.
* String은 자바 내부에서 문자 풀을 통해 최적화 한다.
* 만약 String 내부의 값을 변경할 수 있다면, 기존에 문자열 풀에서 같은 문자를 참조하는 변수의 모든 문자가 함께 변경되어 버리는 문제가 발생. str3이 참조하는 문자를 변경하면 str4의 문자도 함께 변경되는 사이드 이펙트 문제 발생.
  + String str3 = "hello"
  + String str4 = "hello"  

**String** 클래스는 불변으로 설계되어서 이런 사이드 이펙트 문제가 발생하지 않는다.

### String 클래스 - 주요 메서드1
#### 문자열 정보 조회
* length(): 문자열의 길이를 반환
* isEmpty(): 문자열이 비어 있는지 확인한다. (길이가 0)
* isBlank(): 문자열이 비어 있는지 확인한다. (길이가 0이거나 공백만 있는경우, JAVA11)
* charAt(int index): 지정된 인덱스에 있는 문자를 반환.

#### 문자열 비교
* equals(Object anObject): 두 문자열이 동일한지 비교한다.
* equalsIgnoreCase(String anotherString): 두 문자열을 대소문자 구분 없이 비교한다.
* compareTo(String anotherString): 두 문자열을 사전 순으로 비교한다.
* compareToIgnoreCase(String str): 두 문자열을 대소문자 구분 없이 사전적으로 비교한다.
* startsWith(String prefix): 문자열이 특정 접두사로 시작하는지 확인한다.
* endsWith(String suffix): 문자열이 특정 접미사로 끝나는지 확인한다.

#### 문자열 검색
* contains(CharSequence s): 문자열이 특정 문자열을 포함하고 있는지 확인한다.
* indexOf(String ch) / indexOf(String ch, int fromIndex): 문자열이 처음 등장하는 위치를 반환한다.
* lastIndexOf(String ch): 문자열이 마지막으로 등장하는 위치를 반환한다.

#### 문자열 조작 및 변환
* substring(int beginIndex) / substring(int beginIndex, int endIndex): 문자열의 부분 문자열을 반환한다.
* concat(String str): 문자열의 끝에 다른 문자열을 붙인다.
* replace(CharSequence target, CharSequence replacement): 특정 문자열을 새 문자열로 대체한다
* replaceAll(String regex, String replacement): 문자열에서 정규 표현식과 일치하는 부분을 새 문자열로 대체한다
* replaceFirst(String regex, String replacement): 문자열에서 정규 표현식과 일치하는 첫 번째 부분을 새 문자열로 대체
* toLowerCase() / toUpperCase(): 문자열을 소문자나 대문자로 변환
* trim(): 문자열 양쪽 끝의 공백에 제거. 단순 Whitespace만 제거
* strip(): Witespace와 유니코드 공백을 포함해서 제거한다. (JAVA 11)

#### 문자열 분할 및 조합
* split(String regex): 문자열을 정규 표현식을 기준으로 분할
* join(CharSequence delimiter, CharSequence... elements): 주어진 구분자로 여러 문자열을 결합한다

#### 기타 유틸리티
* valueOf(Object obj): 다양한 타입을 문자열로 변환
* toCharArray(): 문자열을 문자 배열로 변환
* format(String format, Object... args): 형식 문자열과 인자를 사용하여 새로운 문자열을 생성
  + %d: 숫자
  + %b: boolean
  + %s: 문자열
* matches(String regex): 문자열이 주어진 정규 표현식과 일치하는지 확인

> 참고: CharSequence는 String, StringBuilder의 상위 타입이다. 문자열을 처리하는 다양한 객체를 받을 수 있다. StringBuilder는 뒤에서 설명한다.

### StringBuilder - 가변 String
String은 불변 클래스는 문자를 더하거나 변경할 때 마다 새로운 객체를 생성해야 한다는 점이다. 변경해야할 사항이 많은 상황이면 더 많은 String 객체를 생성하고 GC를 활용해야 한다.
결과적으로 컴퓨터의 CPU, 메모리 자원을 더 많이 사용하게 된다. 그리고 문자열의 크기가 클수록, 더 자주 변경할수록 시스템 자원도 더 많이 소모한다.

#### StringBuilder
이런 문제를 해결키위해 StringBuilder라는 가변 String이 존재하나 사이드 이펙트에 주의해야 한다.

* StringBuilder 객체 생성
* append(): 여러 문자열 추가
* insert(): 특정 위치에 문자열 삽입
* delete(): 특정 범위의 문자열 삭제
* reverse(): 문자열 뒤집기
* 마지막에 toString()을 통해 String 객체를 생성 및 반환

### String 최적화
#### 자바의 String 최적화
* 문자열 리터럴 최적화
* String 변수 최적화  
  + String result = new StringBuilder.append(str1).append(str2).toString();  
  + 자바 9부터 StringConcatFactory를 사용할 수 있음

> **StringBuilder vs StringBuffer**  
> 둘은 똑같은 기능을 수행하나 StringBuffer는 내부에 동기화가 되어 있어, 멀티 스레드 상황에 안전하나 동기화 오버헤드로 인해 성능이 느린반면, Builder는 그와 반대되는 성격을 가짐.

### 메서드 체이닝 - Method Chaining
메서드 체이닝 방식은 메서드가 끝나는 시점에 .을 찍어 변수명 생략과 동시에 연결하여 적을 수 있다.  
이는 자기 자신의 참조값을 반환하기에 가능하다  
코드를 간결하고 이해하기 쉽게 만들 수 있다.  
"만든 사람이 수고로우면 쓰는 사람이 편하고, 만드는 사람이 편하면 쓰는 사람이 수고롭다."

### 래퍼 클래스 (Wrapper Class)
#### 기본형의 한계
int, double과 같은 기본형 타입(Primitive Type)은 객체가 아니라서 따라오는 한계가 있다.
* 객체 지향 프로그램의 장점을 살릴 수 없다. 유용한 메서드를 제공할 수 없다
  + 객체 참조가 필요한 컬렉션 프레임워크 사용 불가, 제네릭도 사용 불가.
* null 값을 가질 수 없다. 데이터가 `존재하지 않음`을 표현할 수 없다.

#### 자바 래퍼 클래스

자바는 기본형에 대으아는 래퍼 클래스를 기본으로 제공한다.
* byte -> Byte
* short -> Short
* int -> Integer
* long -> Long
* float -> Float
* double -> Double
* char -> Character
* boolean -> Boolean

기본 래퍼 클래스는 다음 특징을 가지고 있다.
* 불변이다.
* equals()로 비교해야 한다.

#### 래퍼 클래스 생성 - Boxing
* 기본형을 래퍼 클래스로 변경하는 것을 박싱이라고 한다.
* new Integer(n)을 직접 사용하는 것은 향후 자바에서 제거될 예정
  + 대신 valueOf(n)을 사용할 것.
  + 자바 내부에서 new Integer(n)을 사용해 객체를 생성하고 반환함
* Integer.valueOf()는 성능 최적화 기능이 있다. -128 ~ 127 범위 내에서 Integer 클래스를 미리 생성해줌. 벗어난 값에서 new Integer() 호출
  + String Pool과 비슷하게 자주 사용하는 숫자를 미리 생성해두고 재사용.
  + 미래에 개선된 방향으로 변경될 수도 있음
* 래퍼 클래스는 객체 그대로 출력해도 내부에 있는 값을 문자로 출력하도록 toString()을 재정의 함.

#### intValue() - 언박싱(Unboxing)
* 래퍼 클래스에 들어있는 기본형을 다시 꺼내는 메서드

#### 비교시 equals() 사용
* 래퍼 클래스는 객체로 == 비교시 인스턴스의 참조값을 비교
* 래퍼 클래스는 내부의 값을 비교하기 위해 equals()를 재정의 함.

#### 오토박싱(Autoboxing)
Primitive -> Wrapper 로 변경하거나 그 역의 상황을 사용하고자할 때 편하게하기 위해  
자바 1.5부터 Autoboxing 혹은 Autounboxing을 컴파일러가 자동으로 지원해주는 기능

#### parseInt() vs valueOf()
* valueOf("n"): 래퍼 타입 반환
* parseInt("n"): 기본 타입 반환

#### 유지보수 vs 최적화
두 상황 중 우선순위를 고려할 상황이라면 유지보수에 더 중점을 두어야 한다.  

#### 리플렉션 - Reflection
Class를 사용하ㅏ면 클래스의 메타 정보를 기반으로 클래스에 정의된 메소드, 필드, 생성자 등을 조회하고,
이들을 통해 객체 인스턴스를 생성하거나 메솓를 호출하는 작업이 가능. 이것이 리플렉션.

추가로 어노테이션 정보를 읽어서 특별한 기능을 수행할 수 있다. 최신 프레임워크들은 이런 기능을 적극 활용.

지금은 Class가 뭔지 대략 어떤 기능들을 제공하는지만 알아두면 충분

### System 클래스
* 표준 입력, 출력, 오류 스트림: System.in, System.out, System.err
* 시간 측정: System.currentTimeMills()와 .nanoTime()은 현재 시간을 밀리초 또는 나노초 단위로 제공한다
* 환경 변수: System.getenv() 메서드를 사용해 OS에서 설정한 환경 변수의 값을 얻을 수 있다.
* 시스템 속성: System.getProperties()를 사용해 현재 시스템 속성을 얻거나 .getProperty(String key)로 특정 속성을 얻을 수 있다. 시스템 속성은 자바에서 사용하는 설정 값이다
* 시스템 종료: System.exit(int status) 메서드는 프로그램을 종료하고, OS에 프로그램 종료의 상태 코드르 전달한다.
  + 상태 코드 0: 정상 종료
  + 0이 아님: 오류나 예외적인 종료
* 배열 고속 복사: System.arraycopy는 시스템 레벨에서 최적화된 메모리 복사 연산을 사용. 직접 반복문을 작성하여 배열을 복사할 때 보다 2배 이상의 빠른 성능을 제공

### Math, Random 클래스
수학 문제를 해결하기 위한 클래스

1. 기본 연산 메서드
  * abs(x): 절대값
  * max(a, b): 최대값
  * miin(a, b): 최소값

2. 지수 및 로그 연산 메서드
  * exp(x): e^x 계산
  * log(x): 자연 로그
  * log10(x): 로그 10
  * pow(a, b): a의 b 제곱

3. 반올림 및 정밀도 메서드
  * ceil(x): 올림
  * floor(x): 내림
  * rint(x): 가장 가까운 정수로 반올림
  * round(x): 반올림

4. 삼각 함수 메서드
  * sin(x): 사인
  * cos(x): 코사인
  * tan(x): 탄젠트

5. 기타 유용한 메서드
  * sqrt(x): 제곱근
  * cbrt(x): 세제곱근
  * random(): 0.0과 1.0 사이에서 무작위 값 생성

> 아주 정밀한 숫자와 반올림 계산이 필요하다면 `BigDecimal`을 검색 및 활용

## 문자열과 타입 안정성1
열거형(Enum Type)을 제대로 이해하기 위해 열거형이 생겨난 이유를 알아보자

* 등급에 문자열을 사용하는 방식의 문제점
  + 타입 안정성 부족: 문자열은 오타와 유효하지 않는 값을 입력하는 경우가 있음
  + 데이터 일관성: "GOLD", "Gold", "gold" 등 다양한 입력 경우에 따라 일관성이 떨어짐

* String 사용시의 타입 안정석 부족
  + 값의 제한 부족: 오타나 유효하지 않은 값의 입력 위험이 존재
  + 컴파일 오류 감지 불가: 사용하자 값을 입력하는 런타임 중에 오류가 발생해 디버깅에 불리할 수 있음

## 타입 안전 열거형 패턴(Type-safe Enum Pattern)
Enum(Enumeration, 열거)

#### 타입 안전 열거형 패턴의 장점
* 타입 안전성 향샹
* 데이터 일관성

#### 자세히
* 제한된 인스턴스 생성
* 타입 안정성

#### 단점
패턴을 구현하기 위해 많은 코드를 작성해야하고 생성자를 private으로 외부 사용을 방지해야함.

## 열거형 - Enum Type
