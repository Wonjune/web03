# GenericServlet 을 상속한 기본서블릿

## javax.servlet.GenericServlet 을 extends 하여 서블릿 java 파일을 생성
###1. public void service(ServletRequest request, ServletResponse response) 메서드를 오버라이딩하여 내부 서비스를 구현한다.
###2. response에 characterset을 설정한다.
```
response.setContentType("text/plain:charset=UTF-8");
response.setCharacterEncoding("UTF-8");
```
###3. 서블릿 배치 정보를 설정하는 방법은 두가지
####  - web.xml 파일에 설정하는 방법
```
  <servlet>
  	<servlet-name>Calculator</servlet-name>
  	<servlet-class>lesson03.servlets.CalculatorServlet</servlet-class>
  </servlet>
 
  <servlet-mapping>
  	<servlet-name>Calculator</servlet-name>
  	<url-pattern>/Calculator</url-pattern>
  </servlet-mapping>
```
####  - 어노테이션을 설정하는 방법
#####    Servlet 파일에 아래와 같이 추가
```
...
import javax.servlet.annotation.WebServlet;

@WebServlet("/calc")
public class CalculatorServlet extends GenericServlet {
...
```
###4. 어노테이션은 속성을 포함할 수 있다.
####이름 : 기본값은 빈 문자열
```
@WebServlet(name="서블릿이름")
```
####URL 목록 : 연결될 url 패턴
```
@WebServlet(urlPatterns={"/calc", "calc.do", "calculator.action"}
```
####Value : urlPattern 과 같은 용도
```
@WebServlet(value="/calc")
@WebServlet("/calc")
```
