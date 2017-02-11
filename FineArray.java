package mumExamSolutions;

public class FineArray {

	public static void main(String[] args) {
		int[] a = { 4, 9, 6, 33};
		int i = isFineArray(a);
		System.out.println(i);

	}

	public static int isFineArray(int[] a) {
		int primecount=0;
		for (int i = 0; i < a.length; i++) {
			if (isPrime(a[i])==1) {
				primecount++;
				if(isPrime(a[i]-2)==1||isPrime(a[i]+2)==1){
					return 1;
				}

			}
		}
		if(primecount==0){
			return 1;
		}
		return 0;
	}
	public static int isPrime(int x){
		for(int i=2;i<x;i++){
			if(x%i==0){
				return 0;
			}
		}
		return 1;
	}
}
