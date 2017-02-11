package mumExamSolutions;

public class Npermeable {

	public static void main(String[] args) {
	int[]a={5, 15, 26};
	int n=2;
	int i=isPermeable(a,n);
	System.out.println(i);

	}
	public static int isPermeable(int []a,int n){
		for(int i=0;i<a.length;i++){
			if(isPrime(a[i]+n)==0){
				return 0;
			}
		}
		return 1;
	}
	public static int isPrime(int a){
		for(int i=2;i<a;i++){
			if(a%i==0){
				return 0;
			}
		}
		return 1;
}
}