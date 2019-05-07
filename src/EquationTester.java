// mainメソッドを含むEquationTesterクラスを書く
class EquationTester {
	public static void main(String[] args) {
		Equation[] equations = new Equation[5];
		// Equation equation = new Equation();

		// LinearEquation確認用
		double a0 = 2, b0 = 4;
		// QuadraticEquation確認用 二つの異なる実数解
		double a1 = 1, b1 = 3, c1 = 2;
		// QuadraticEquation確認用 重解
		double a2 = 2, b2 = 8, c2 = 8;
		// QuadraticEquation確認用 二つの異なる虚数解
		double a3 = 4, b3 = 1, c3 = 2;
		// TrigonometricEquation確認用
		double a4 = 1;

		equations[0] = new LinearEquation(a0, b0);
		equations[1] = new QuadraticEquation(a1, b1, c1);
		equations[2] = new QuadraticEquation(a2, b2, c2);
		equations[3] = new QuadraticEquation(a3, b3, c3);
		equations[4] = new TrigonometricEquation(a4);

		for (Equation e : equations) {
			e.print();
			e.solve();
		}
	}
}
