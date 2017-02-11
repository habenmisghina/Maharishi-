package mumExamSolutions;

public class ZeroBalanced {

	public static void main(String[] args) {
	int[]a=	{3,-3,-3};
	int i=isZeroBalanced(a);
	System.out.println(i);

	}
public static int isZeroBalanced(int[]a){
	int sum=0;
	int countopp=0;
	for(int i=0;i<a.length;i++){
		countopp=0;
		for(int j=0;j<a.length;j++){
		sum=sum+a[i];
		if(a[i]+a[j]==0){
			countopp++;
		}
		}
		if(countopp==0){
			return 0;
		}
	}
	if(sum==0){
	return 1;}
	return 0;
}
}
