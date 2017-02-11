package mumExamSolutions;

public class IsPrimeProduct {

	public static void main(String[] args) {
		int n=22;
		int i=isPrimeProduct(n);
		System.out.println(i);

	}
	public static int isPrimeProduct(int n){
		for(int i=2;i<n;i++){
			if(n%i==0){
				if(isPrime(i)==1){
					for(int j=3;j<n;j++){
						if(n%j==0){
							if(isPrime(j)==1){
								if(i*j==n){
									return 1;
								}
							}
						}
					}
				}
			}
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
