package mumExamSolutions;

public class Ksmart {

	public static void main(String[] args) {
		int n=26;
		int i=isKsmart(n);
		System.out.println(i);

	}
	public static int isKsmart(int n){
		int sum=1;
		for(int i=1;i<n;i++){
			sum=sum+i;
			if(sum==n){
				return 1;
			}
			if(sum>n){
				break;
			}
		}
		return 0;
	}

}
