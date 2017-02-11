package mumExamSolutions;

public class Bunker {

	public static void main(String[] args) {
		int[] a = { 4, 9, 6, 15, 21};
		int i = isBunker(a);
		System.out.println(i);

	}

	public static int isBunker(int[] a) {
		for (int i=0;i<a.length-1;i++){
			if(a[i]%2!=0&&isPrime(a[i+1])==1){
				return 1;
		}

	}
		return 0;

}

	public static int isPrime(int n) {
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return 0;
			}
		}
		return 1;
	}
}