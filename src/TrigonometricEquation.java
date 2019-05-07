// サブクラスTrigonometricEquationを書く
public class TrigonometricEquation extends Equation {

	private double a;

	public TrigonometricEquation(double a) {
		this.name = "TrigonometricEquation";
		this.a = a;
	}

	@Override
	public void print() {
		System.out.println(name + ": sin(x) + (" + a + ") = 0");
	}

	@Override
	public void solve() {
		double x = Math.asin(-a);
		System.out.println("x = " + x / Math.PI + "pi");
		System.out.println();
	}
}
