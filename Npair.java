package mumExamSolutions;

public class Npair {

	public static void main(String[] args) {
		int[]a={1,4,1,4,5,6};
		int n=5;
		int i=isPair(a,n);
		System.out.println(i);

	}
	public static int isPair(int[]a,int n){
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a.length;j++){
				if(a[i]+a[j]==n &&i+j==n){
					return 1;
					
				}
			}
		}
		return 0;
	}

}
