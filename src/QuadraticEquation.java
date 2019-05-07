// サブクラスQuadraticEquationを書く
public class QuadraticEquation extends Equation {

	private double a, b, c;

	public QuadraticEquation(double a, double b, double c) {
		this.name = "QuadraticEquation";
		this.a = a;
		this.b = b;
		this.c = c;
	}

	@Override
	public void print() {
		System.out.println(name + ": (" + a + ")x^2 + (" + b + ")x + (" + c + ") = 0");
	}

	@Override
	public void solve() {
		if (a == 0) {
			if (b == 0) {
				System.out.println("任意の実数xについても成り立つ");
			} else {
				double x = -c / b;
				System.out.println("x = " + x);
			}
		} else {
			double d = b * b - 4 * a * c;
			if (d > 0) {
				double x1 = (-b + Math.sqrt(d)) / (2 * a);
				double x2 = (-b - Math.sqrt(d)) / (2 * a);
				System.out.println("x1 = " + x1 + ", x2 = " + x2);
			} else if (d == 0) {
				double x = -b / (2 * a);
				System.out.println("x = " + x + "(重解)");
			} else {
				double real = -b / (2 * a);
				double imaginary = Math.sqrt(-1 * d) / (2 * a);
				System.out.println("x1 = " + real + " + " + imaginary + "i");
				System.out.println("x2 = " + real + " - " + imaginary + "i");
			}
		}
		System.out.println();
	}
}
