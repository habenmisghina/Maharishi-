package mumExamSolutions;

public class HolderNum {

	public static void main(String[] args) {
		int n=127;
		int i=isHolder(n);
		System.out.println(i);

	}
	public static int isHolder(int n){
		int product=1;
		int productdiff=0;
		if(isPrime(n)==1){
			while(n>=productdiff){
				product=product*2;
				 productdiff=product-1;
				if(productdiff==n){
					return 1;
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
