package mumExamSolutions;

public class Fancy {

	public static void main(String[] args) {
		int n = 61;
		int i = isFancy(n);
		System.out.println(i);

	}

	public static int isFancy(int n){
	int sum=0;
	int firstnum=1;
	int secondnum=1;
	for(int i=0;i<=n;i++){
		sum=3*firstnum+2*secondnum;
		if(sum==n){
			return 1;
		}
		if(sum>n){
			break;
		}
		secondnum=firstnum;
		firstnum=sum;
	}
return 0;
}
}
