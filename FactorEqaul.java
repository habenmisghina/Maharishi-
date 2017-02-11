package mumExamSolutions;

public class FactorEqaul {

	public static void main(String[] args) {
		int n=10;
		int m=9;
		int i=isFactorEqual(n,m);
		System.out.println(i);
	}
	public static int isFactorEqual(int n1,int n2){
		if(factorCounter(n1)==factorCounter(n2)){
			return 1;
		}
		return 0;
		
	}
public static int factorCounter(int x){
	int factorcount=0;
	for(int i=1;i<=x;i++){
		if(x%i==0){
			factorcount++;
			
		}
	}
	return factorcount;
}
}
