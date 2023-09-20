import java.util.Random;

class MyMath {
	public static double randomRange(double a, double b) {
		if (a > b) {
			double t = a;
			a = b;
			b = t;
		}
		return a + Math.random() * (b - a);
	}
}

class Output {
	public static void printTable(double[][] array, int dimX, int dimY) {
		for (int i = 0; i < dimY; i++) {
			for (int j = 0; j < dimX; j++) {
				System.out.printf("%-8.3f ", array[i][j]);
			}
			System.out.println("\n");
		}
	}
}


class Program {
	private static final int[] VARS = {7, 15, 19, 23};
	private static final int SIZEY = 9;
	private static final int SIZEX = 14;

	private static long[] c;
	private static double[] x;
	private static double[][] ans;

	private static boolean checkInclusion(long x) {
		for (int t : VARS) {
			if (t == x) return true;
		}
		return false;
	}

	private static void fillArrays() {
		Program.c = new long[SIZEY];
		int curNumber = 23;
		for (int i = 0; i < SIZEY; i++) {
			c[i] = curNumber;
			curNumber -= 2;
		}
		Program.x = new double[SIZEX];
		for (int i = 0; i < SIZEX; i++) {
			x[i] = MyMath.randomRange(-14.0, 9.0);
		}
		Program.ans = new double[SIZEY][SIZEX];
	}

	private static void doMagic() {
		for (int i = 0; i < SIZEY; i++) {
			for (int j = 0; j < SIZEX; j++) {
				double X = x[j];

				if (c[i] == 9) {
					Program.ans[i][j] = Math.pow(3 * Math.atan(Math.cos(X)), 2);
				}
				else if (Program.checkInclusion(c[i])) {
					
					double ePowed = Math.exp(Math.pow(Math.cbrt(X) / 2, 2));
					Program.ans[i][j] = Math.log(ePowed);
				}
				else {
					double arc = Math.cbrt(Math.asin((X - 2.5) / 23));
					
					double aPow = 1 - Math.log(Math.abs(X));
					double bPow = Math.pow(X / (X + 0.25), 3);
					double cPow = Math.pow(aPow / bPow, 3);

					double arcPow = (1 - cPow) / 2;
					double arcPowed = Math.pow(arc, arcPow);
					double arcRes = Math.pow((arcPowed + 3) / 12, 3);
					Program.ans[i][j] = arcRes;
				}
			}
		}
	}

	private static void printResults() {
		Output.printTable(Program.ans, SIZEX, SIZEY);
	}

	public static void run() {
		Program.fillArrays();
		Program.doMagic();
		Program.printResults();
	}
}

public class Main {
	public static void main(String[] args){
		Program.run();
	}
}