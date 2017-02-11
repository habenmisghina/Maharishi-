package mumExamSolutions;

public class AllPossiblity {

	public static void main(String[] args) {
		int[]a={};
		int i=isAllposs(a);
		System.out.println(i);

	}
public static int isAllposs(int[]a){
	int count=0;
	for(int i=0;i<a.length;i++){
		count=0;
		for(int j=0;j<a.length;j++){
			if(a[i]==j){
				count++;
			}
			
		}
		if(count==0){
			return 0;
		}
	}
	return 1;
}
}
