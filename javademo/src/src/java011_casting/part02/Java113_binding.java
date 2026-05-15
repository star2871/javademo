package java011_casting.part02;

public class Java113_binding {
	
	public static void main(String[] args) {
		LgTv lgTv = new LgTv("LG");
	     process(lgTv);
	     
	     SamsungTv ssTv = new SamsungTv("SAMSUNG");
	     process(ssTv);
	}
		
                              // 업캐스팅
	public static void process(HomeTv  tv) {
		tv.turnOff();
		
		if (tv instanceof LgTv) {
			LgTv lgTv = (LgTv)tv;  //다운캐스팅
			lgTv.call();		
			
		}else if (tv instanceof SamsungTv) {
			SamsungTv ssTv = (SamsungTv)tv;  //다운캐스팅
			ssTv.move();			
		}
	}
}
