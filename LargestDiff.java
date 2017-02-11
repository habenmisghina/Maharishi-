package mumExamSolutions;

public class LargestDiff {

	public static void main(String[] args) {
		int[] a = { 1,2,1,2,1,4,1,6,4};
		int i = isThelargest(a);
		System.out.println(i);

	}

	public static int isThelargest(int[] a) {
		int diff=0;
		int evencount = 0;
		int evenmin = Integer.MAX_VALUE;
		int evenmax = Integer.MIN_VALUE;
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				evencount++;
				if (a[i] > evenmax) {
					evenmax = a[i];
				}
				if(a[i]<evenmin){
					evenmin=a[i];
				}

			}
		}
		if(evencount<2){
			return -1;
		}
		diff=evenmax-evenmin;
		return diff;
	}

}
