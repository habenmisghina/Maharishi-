package mumExamSolutions;

public class NICE12 {

	public static void main(String[] args) {
	int[]a={7, 6, 20};
	int i=isNice(a);
	System.out.println(i);

	}
public static int isNice(int[]a){
	int primesum=0;
	int primecount=0;
	for(int i=1;i<a.length;i++){
		if(isPrime(a[i])==1){
			primesum=primesum+a[i];
			primecount++;
		}
	}
	if(isPrime(a[0])==0&& primecount==0&&a[0]==0||primecount==0&&isPrime(a[0])==1||primecount>0&&primesum==a[0]){
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
