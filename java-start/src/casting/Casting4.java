package casting;

public class Casting4 {

	public static void main(String[] args) {
		int div1 = 3 / 2;
		System.out.println("div1 = " + div1);
		// 출력: 1

		double div2 = 3 / 2;
		System.out.println("div2 = " + div2);
		// 출력: 1.0

		double div3 = 3.0 / 2;
		System.out.println("div3 = " + div3);
		// 출력: 1.5

		double div4 = (double) 3 / 2;
		System.out.println("div 4 = " + div4);
		// 출력: 1.5

		int a = 3;
		int b = 2;
		double result = (double) a / b;
		System.out.println("result = " + result);
		// 출력: 1.5
	}
}