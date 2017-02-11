package mumExamSolutions;

public class SameNu {

	public static void main(String[] args) {
		int n=8;
		int m=12;
		int i=isFactorEqual(n,m);
		System.out.println(i);
	}
	public static int isFactorEqual(int n1,int n2){
		if(n1<0||n2<0){
			return -1;
		}
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