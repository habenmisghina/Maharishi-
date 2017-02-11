package mumExamSolutions;

public class Bunk {

	public static void main(String[] args) {
		int[]a={ 7, 6, 10};
		int i=isBunk(a);
		System.out.println(i);

	}
	public static int isBunk(int []a){
		int primeCount=0;
		int oneCount=0;
		
	for (int i=0;i<a.length;i++){
		if(a[i]==1){
			oneCount++;
		}
		else if(isPrime(a[i])==1){
			primeCount++;
		}
		
	}
	if(oneCount>0 && primeCount>0){
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