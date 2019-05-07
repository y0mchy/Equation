// サブクラスLinearEquationを書く
public class LinearEquation extends Equation {

	private double a, b;

	public LinearEquation(double a, double b) {
		this.name = "LinearEquation";
		this.a = a;
		this.b = b;
	}

	@Override
	public void print() {
		System.out.println(name + ": (" + a + ")x + (" + b + ") = 0");
	}

	@Override
	public void solve() {
		if (a == 0) {
			System.out.println("任意の実数xについても成り立つ");
		} else {
			double x = -b / a;
			System.out.println("x = " + x);
		}
		System.out.println();
	}

}
