package mumExamSolutions;

public class Daphne {

	public static void main(String[] args) {
		int[] a = { 8,1};
		int i = isDaph(a);
		System.out.println(i);

	}

	public static int isDaph(int[] a) {
		int evencount = 0;
		int oddcount=0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				evencount++;
			}
			else{
				oddcount++;
			}
		}
		if(oddcount==0&& evencount>0 || oddcount>0&&evencount==0){
			return 1;
		}
		return 0;
	}

}
