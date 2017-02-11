package mumExamSolutions;

public class DigitSum {

	public static void main(String[] args) {
		int n = 321;
	    int x=5;
		int i = isDigitSum(n,x);

		System.out.println(i);

	}
	public static int isDigitSum(int n,int x){
		int lastNum=0;
		int sum=0;
		while(n>0){
			lastNum=n%10;
			sum=sum+lastNum;
			n=n/10;
		}
		if(sum==x){
		return 1;}
		return 0;
	}

}
