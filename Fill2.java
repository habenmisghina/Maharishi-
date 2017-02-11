package mumExamSolutions;

public class Fill2 {

	public static void main(String[] args) {
		int[] a = { 4, 2, 3, 8 };
		int k = 0;
		int n = 5;
		int[] m = isfill(a, k, n);
		for (int i = 0; i < m.length; i++) {
			System.out.println(m[i]);
		}

	}

	public static int[] isfill(int[] a, int k, int n) {
		int[] b = new int[n];
		int j = 0;
		if (k == 0) {
			int[] c=new int[0];
			return c;
		}

		for (int i = 0; i < n; i++) {
			b[i] = a[j];
			j++;
			if (k == j) {
				j = 0;
			}
		}
		return b;

	}

}
