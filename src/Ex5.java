
public class Ex5 {

	public static void main(String[] args) {
		for(int i = 1; i < 11; i++) {
			multiplica(i);
		}
	}
	public static void multiplica(int num) {
		System.out.println("=============Tabuada do " + num + "=============");
		for(int i = 0; i < 11; i++) {
			System.out.println("\t" + num + " x " + i + " = " + num * i);
		}
		System.out.println("=========================================");

	}

}
