package kr.co.softcampus.beans;

public class TestBean3 {
	
	public TestBean3() {
		System.out.println("TestBean3의 생성자");
	}
	
	public void default_init() {
		System.out.println("TestBean3의  default_init");
	}
	
	public void default_destroy() {
		System.out.println("TestBean3의 default_destroy");
	}
	
	public void bean3_init() {
		System.out.println("TestBean3의 init 메서드");
	}
	
	public void bean3_destroy() {
		System.out.println("TestBean3의 destroy 메서드");
	}

}
