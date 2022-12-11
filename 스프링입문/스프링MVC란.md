# **스프링 MVC란?**

## **Spring에서 제공하는 웹 모듈!**

<br>

> - 3가지 구성요소<br>
M : Model<br>
V : View<br>
C : Controller

<br>

+ 사용자의 다양한 `HTTP Request`를 처리하고 단순한 텍스트 형식의 응답
+ `REST` 형식의 응답
+ `View`를 표시하는 `html`을 `return`하는 응답

<br>

> 다양한 응답을 할수 있도록 하는 프레임웍!

<br>

Spring MVC는 다양한 요청을 처리하고 응답하기 위해 주요 구성요소들을 생성해놓고 구성요소들을 확장할 수 있게 생성해 놓는데 이를 제대로 사용하기 위해서는 MVC가 어떻게 구성되어 있는지를 알 필요가 있다.

---

## **Spring MVC 구조**

<br>

주요 구성요소는 위에서 언급했듯이 `Model`, `View`, `Controller`이며, 이를 유기적으로 동작하도록 하기 위해서 다양한 구성요소가 함께한다.

+ DispatcherServlet(Front Controller)
+ Handler(Controller)
+ ModelAndView
+ ViewResolver

<br>

<img src="https://raw.githubusercontent.com/gwooden96/ImageAdd/88f1b6a79df78d76f9d26091a292e697e466f419/MVC%20%EA%B7%B8%EB%A6%BC.png" width="800" height="500">

<br>

+ DispatcherServlet : 제일 앞단에서 HTTP Request를 처리하는 Controller

+ Controller(Handler) : HTTP Request를 처리해 Model을 만들고 View를 지정

+ ModelAndView: Controller에 의해 반환된 Model과 View가 Wrapping된 객체

+ ViewResolver :  ModelAndView를 처리하여 View를 그리기

<br>