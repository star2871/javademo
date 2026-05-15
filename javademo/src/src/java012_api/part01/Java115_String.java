package java012_api.part01;
//import java.lang.String;

public class Java115_String {

	public static void main(String[] args) {
		String str = new String("KoREa,jsp,java");
		System.out.println(str.length());
		System.out.println(str.toUpperCase());
		System.out.println(str.charAt(0));
		String[] arr = str.split(",");
		for (String line : arr) {
			System.out.println(line);
		}
		
		char[] data = {'1','2','3'};
		String sn = String.valueOf(data);
		System.out.println(sn);
		
	}

}
