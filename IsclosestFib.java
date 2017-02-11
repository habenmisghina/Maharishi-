package mumExamSolutions;

public class IsclosestFib {

	public static void main(String[] args) {
		int n=30;
		int i=closestfib(n);
		System.out.println(i);
	}
	public static int closestfib(int n){
		int first=0;
		int second=1;
		int sum=0;
		int b=0;
		while(sum<=n){
			b=sum;
			sum=first+second;
			
			first=second;
			second=sum;
			
		}
		
	    return b;
	}
	}


