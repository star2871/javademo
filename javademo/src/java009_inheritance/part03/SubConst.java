package java009_inheritance.part03;

public class SubConst extends SuperConst{
	
	public SubConst(int x, int y) {
		super(x, y);
	}

	
	/* overriding 오버라이딩*/
	// 메소드의 선언부는 그대로 사용하고, 메소드의 구현부만 재정의한다.
	// 단, 메소드의 접근제어자는 확장이 가능하다. protected  => protected, public
	
	@Override
	public String toString() {		
		return String.format("x=%d, y=%d", x, y);
	}
	
	public void display() {
		System.out.println(super.toString());
		System.out.println(this.toString());
	}
}
