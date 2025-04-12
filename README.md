# 🔥SpringBootStudy🔥

## Optional이란 무엇인가?
## Junit, jupiter란 무엇인가?
## assertj란 무엇인가?
## AOP란 무엇인가?
## Jar란?
- 자바는 여러 클래스와 리소스를 묶어서 Jar(Java Archive)라고 하는 압축 파일을 만들 수 있음.
- jar 파일은 JVM 위에서 직접 실행 또는 다른 곳에서 사용하는 라이브러리로 제공된다.
- 직접 실행하는 경우 main() 메서드가 필요하고, MANIFEST.MF 파일에 실행할 메인 메서드가 있는 클래스 지정 필요 
> - 실행 방법
>> $java -jar abc.jar
## War란?
- War(Web Application Archive)란 웹 어플리케이션 서버에 배포할 때 사용하는 파일.
- Jar 파일이 JVM 위에서 실행된다면, War 파일은 웹 어플리케이션 서버 위에서 실행됨.
웹 어플리케이션 서버 위에서 실행됨.
- HTML과 같은 정적 리소스와 클래스 파일을 모두 포함하기때문에 Jar에 비해 구조가 복잡하며, War 구조를 꼭 지켜야함.

>- 압축 해제 방법(war 구조 확인) 
>>$jar -xvf abc.war

## Servlet이란?
- 자바로 작성한 서버 프로그램
- 브라우저 요청(Http Request)을 받아서 처리하고, 결과(Http Response)를 돌려줌
- 자바 클래스를 만들어 HttpServlet을 상속 받거나, @WebServlet을 써서 요청 처리

### Servlet Container란?
- 위 서블릿들을 관리하고 실행해주는 프로그램(ex.톰캣)
- 톰캣은 웹서버 + 서블릿 컨테이너 기능을 모두 가짐
- 
# 💡IntelliJ 단축키 모음

- Ctrl + i : Interface 메소드 오버라이딩
- Ctrl + p : 파라미터 정보 확인
- Ctrl + Shif + T : 해당 클래스의 테스트 케이스 생성
- Ctrl + Alt + v : 해당 함수를 반환 받는 변수 생성
- Ctrl + Alt + Shift + T : 자주 사용하는 함수 리팩토링 (로직을 함수로 만들어냄)
- Ctrl + Alt + N : 지역 변수 제거 후 코드에 넣는 리팩토링
- Alt + Insert : Getter and Setter, Constructor 등 자동 완성
- Alt + Enter : 필요한 import 추가
- Shift + F6 : 지정 변수 전체 변경
- Shift + F10 : 이전에 실행한 것 재실행