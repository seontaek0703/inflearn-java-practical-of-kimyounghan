# Inflearn's Roadmap: PRACTICAL JAVA of KIMYOUNGHAN (2/7)

# BASIC COURSE

## 기본형 vs 참조형

* 기본형(Primitive Type): int, long, double, boolean차람 변수에 사용할 값을 직접 넣을 수 잇는 데이터 타입을 기본형이라 한다.
* 참조형(Reference Type): 클래스 객체나 배열 변수와 같이 데이터에 접근하기 위한 참조를 저장하는 데이터 타입을 참조형이라 한다. 참조형은 객체 또는 배열에 사용된다.

기본형 변수는 변수를 직접 호출해 값을 사용할 수 있다.  
참조형 변수는 값을 사용하기 위해 참조값을 통해 해당 주소로 이용하여야 한다.(값에 접근하기 위해 클래스 변수에 .을 찍어 접근한다.)

> 사실 String도 참조형이나 사용 빈도가 많아 자바에서 특별하게 편의 기능을 제공한다.

## NULL

*참조할 대상이 없다.*

> GC: Garbage Collection
> > NULL 값으로 참조할 수 없는 대상은 접근할 수 없어서 인스턴스를 메모리에서 제거해야한다.  
> > C와 같은 언어는 개발자가 직접 찾아 삭제하고 누락시 메모리 낭비가 발생하고 심한 경우 메모리 부족 오류에 부딪혔다.  
> > 자바는 이런 과정을 자동으로 처리해준다.  
> > 아무도 참조하지 않는 인스턴스가 존재하면 JVM의 GC가 더 이상 사용하지 않는 인스턴스라 판단하고 해당 인스턴스를 메모리에서 제거한다.

### NullPointerExceotion

NULL 값인 객체를 참조하고자 할 때 발생하는 예외
> 예시
```
public class Data {
    int value;
}
```
```java
public class DataMain {

    public static void main {
        Data data = null;
        data.value = 10; // ?
    }
}
```

> Exception in thread "main" java.lang.NullPointerException: Cannot assign field "value" because "data" is null
--- --- ---
## 절차 vs 객채 지향 프로그래밍
### 절차 지향 프로그래밍
* 실행 순서를 중요하게 생각하며 '어떻게'가 중심이 되어 프로그래밍

### 객체 지향 프로그래밍
* 객체간 상호작용을 중요하게 생각하며 '무엇을'이 중심이 되어 프로그래밍