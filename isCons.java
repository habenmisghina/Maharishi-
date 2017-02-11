package mumExamSolutions;

public class isCons {

	public static void main(String[] args) {
		int n=12;
		int i=iscons(n);
		System.out.println(i);

	}
	public static int iscons(int n){
	int	currentnum=0;
	int previousnum=0;
		
		for(int i=2;i<=n;i++){
			if(n%i==0){
				currentnum=i;
				if(currentnum-previousnum==1){
					return 1;
				}
				previousnum=i;
			}
			
		}
	return 0;
	}

}
