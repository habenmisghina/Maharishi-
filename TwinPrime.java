package mumExamSolutions;

public class TwinPrime {
public static void main (String[]args){
	int n=11;
	int i=isTwin(n);
	System.out.println(i);
}
public static int isTwin(int n){
	if(isPrime(n)==1){
		if(isPrime(n-2)==1 || isPrime(n-2)==1){
			return 1;
		}
	}
	return 0;
	
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
