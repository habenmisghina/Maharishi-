package mumExamSolutions;

public class Hollow {

	public static void main(String[] args) {
		int[] a = { 1, 2, 0, 0, 0, 0, 0, 3, 9 };
		int i = isHollow(a);
		System.out.println(i);

	}

	public static int isHollow(int[] a) {

		int i, j, k, len = a.length;

		int NumCnt1 = 0, NumCnt2 = 0, ZeroCnt = 0;

		for (i = 0; i < len; i++) {
			if (a[i] > 0) {

				NumCnt1++;
			} else
				break;

		}

		for (j = i; j < len; j++) {
			if (a[j] == 0) {

				ZeroCnt++;
			} else
				break;
		}

		if (ZeroCnt < 3) {
			return 0;
		}

		for (k = j; k < len; k++) {
			if (a[k] > 0) {

				NumCnt2++;
			} else
				break;
		}

		if (NumCnt1 == NumCnt2)
			return 1;

		return 0;
	}

}
