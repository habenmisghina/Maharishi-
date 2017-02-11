package mumExamSolutions;

public class MaxAdjSum {

	public static void main(String[] args) {
	int []a={13,15,1,28,9,12};
	int i=maxadjsum(a);
	System.out.println(i);

	}
	public static int maxadjsum(int[]a){
		int maxsum=0;
		for(int i=0;i<a.length-1;i++){
			
			if(a[i]+a[i+1]>maxsum){
				maxsum=a[i]+a[i+1];
			}
			}
		return maxsum;
		}

}
