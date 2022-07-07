
public class TA04_3App {

	public static void main(String[] args) {
		int x, y;
		double m, n;
		x = 21;
		y = 65;
		m = 42.43;
		n = 3.83;
		System.out.println("Variable X = "+x);//valor
		System.out.println("Variable Y = "+y);//valor
		System.out.println("Variable M = "+m);//valor
		System.out.println("Variable N = "+n);//valor
		System.out.println(x+" + "+y+" = "+(x+y));//Suma x + y
		System.out.println(x+" - "+y+" = "+(x-y));//Diferencia x - y
		System.out.println(x+" * "+y+" = "+(x*y));//Producto x * y
		System.out.println(x+" / "+y+" = "+(x/y));//cociente x / y
		System.out.println(x+" % "+y+" = "+(x%y));//Resto x % y
		System.out.println(n+" + "+m+" = "+(n+m));//Suma n + m
		System.out.println(n+" - "+m+" = "+(n-m));//diferencia n - m
		System.out.println(n+" * "+m+" = "+(n*m));//producto n * m
		System.out.println(n+" / "+m+" = "+(n/m));//cociente n / m
		System.out.println(n+" % "+m+" = "+(n%m));// resto n % m
		System.out.println(x+" + "+m+" = "+(x*n));//suma x + n
		System.out.println(y+" / "+m+" = "+(y/m));//cociente y / m
		System.out.println(y+" % "+m+" = "+(y%m));//resto y % m
		System.out.println("2*"+x+" = "+(2*x));//doble de cada
		System.out.println("2*"+y+" = "+(2*y));//doble de cada
		System.out.println("2*"+n+" = "+(2*n));//doble de cada
		System.out.println("2*"+m+" = "+(2*m));//doble de cada
		System.out.println(x+" + "+y+" + "+n+" + "+m+" = "+(x+y+n+m));//suma de todas
		System.out.println(x+" * "+y+" * "+n+" * "+m+" = "+(x*y*n*m));//producto de todas
	}

}
