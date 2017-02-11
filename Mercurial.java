package mumExamSolutions;

public class Mercurial {

	public static void main(String[] args) {
		int[] a = { 1, 3, 1, 3 };
		int i = isMercurial(a);
		System.out.println(i);

	}

	public static int isMercurial(int[] a) {
		int index1 = -1;
		int index3 = -1;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == 1) {
				index1 = i;
			}
			if (a[i] == 3) {
				index3 = i;
			}

			if (index1 != -1 && index3 > index1) {
				for (int j = index3; j < a.length; j++) {

					if (a[j] == 1) {

						return 0;
					}
				}
			}
		}
		return 1;
	}
}
