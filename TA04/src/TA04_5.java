
public class TA04_5 {

	public static void main(String[] args) {
		int a, b, c, d;
		a = 21;
		b = 62;
		c = 71;
		d = 18;
		System.out.println("Valor inicial de A = "+a);
		System.out.println("Valor inicial de B = "+b);
		System.out.println("Valor inicial de C = "+c);
		System.out.println("Valor inicial de D = "+d);
		
		b = c;
		System.out.println("B toma el valor de C, B = "+b);
		c = a;
		System.out.println("C toma el valor de A, C = "+c);
		a = d;
		System.out.println("A toma el valor de D, A = "+a);
		d = b;
		System.out.println("D toma el valor de B, D = "+d);
	}

}
