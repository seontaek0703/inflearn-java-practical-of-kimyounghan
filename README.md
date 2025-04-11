# Inflearn - [ROADMAP] Java Practical of Kimyounghan

## 자바란?

### 자바 표준 스펙과 구현
![java-spec](https://github.com/user-attachments/assets/5b9e489e-9f9e-4603-bac5-3fd4c94e14aa)

* 자바 표준 스펙
  + 자바의 설계도이자 문서로 자바 커뮤니티 프로세스(JCP)를 통해 관리된다.

* 다양한 자바 구현
  + 여러 회사에서 자바 표준 스펙에 맞추어 실제 작동하는 자바 프로그램을 개발한다.
  + 각각 장단점이 있다. Amazon Corretto는 AWS에 최적화되어 있다.
  + 각 회사들은 대부분 윈도우, MAC, 리눅스 같이 다양한 OS에서 작동하는 버전의 자바도 함께 제공한다.
 
* 변경의 용이
  + 자바 구현들은 모두 표준 스펙에 맞춰 개발된다. 따라서 오라클 Open JDK를 사용하다가 Amazon Corretto 자바로 변경해도 대부분 문제 없이 동작한다.
 
### 컴파일과 실행
![compile-run](https://github.com/user-attachments/assets/2ad4bbe5-5e95-440c-80c0-5d955cef61c1)

자바 프로그램은 **컴파일**과 **실행 단계**를 거친다.
1. Hello.java와 같은 소스코드를 개발자가 작성
2. 자바 컴파일러를 사용해 소스코드 컴파일
   * 자바가 제공하는 javac라는 프로그램을 사용
   * .class 파일이 생성
   * 자바 소스 코드를 바이트코드로 변환하며 자바 가상 머신(JVM, Java Virtual Machine)에서 더 빠르게 실행될 수 있게 최적화하고 문법 오류를 검출한다.
3. 자바 프로그램 실행
   * 자바가 제공하는 java라는 프로그램을 사용
   * JVM이 실행되면서 프로그램이 작동된다.

### 통합 개발 환경(IDE, Intergrated Development Environment)
