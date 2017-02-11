package mumExamSolutions;

public class Triple {

	public static void main(String[] args) {
		int[] a = { 3, 3,3, 1,  1 };
		int k = istriple(a);

		System.out.println(k);

	}

	public static int istriple(int[] a) {
         int count=0;
		for (int i = 0; i < a.length; i++) {
			count=0;
			for (int j = 0; j < a.length; j++) {
				if(a[i]==a[j]){
					count++;
				}

			}
			if(count!=3){
				return 0;
			}
		}
return 1;
	}
}