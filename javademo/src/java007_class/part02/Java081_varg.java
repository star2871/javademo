package java007_class.part02;

public class Java081_varg {

	public static void main(String[] args) {
		CountVarg cvar = new CountVarg();
		cvar.addValue(1, 2);
		cvar.addValue(2, 3, 9);
		cvar.addValue(1, 5, 2, 4, 9);
		cvar.addValue("홍길동", 2, 5, 7);

	}

}


//public void addValue(int a, int b) {}
//public void addValue(int a, int b, int c) {}
//public void addValue(int a, int b, int c, int d) {}
