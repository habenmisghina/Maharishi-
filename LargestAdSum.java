package mumExamSolutions;

public class LargestAdSum {

	public static void main(String[] args) {
		int []a={1,1,5,2,1,1,1,2};
		int i=isLargestsum(a);
		System.out.println(i);

	}
public static int isLargestsum(int[]a){
	int maxsum=0;
	int currentsum=0;
	if(a.length<2){
		return 0;
	}
	for (int i=0;i<a.length-1;i++){
		currentsum=a[i]+a[i+1];
		if(currentsum>maxsum){
			maxsum=currentsum;
		}
	}
	return maxsum;
}
}
