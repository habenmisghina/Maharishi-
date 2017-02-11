package mumExamSolutions;

public class MaritianArray {

	public static void main(String[] args) {
		int []a={1, 2, 1, 4,2, 1, 2, 1, 2,1,1};
		int i=isMaritian(a);
		System.out.println(i);

	}
public static int isMaritian(int[]a){
	int count1=0;
	int count2=0;
	for(int i=0;i<a.length;i++){
		if(a[i]==1){
			count1++;
		}
		else if(a[i]==2){
			count2++;
		}
		if(i<a.length-1){
			if(a[i]==a[i+1]){
				return 0;
			}
				
		}
		
	}
	if(count1<count2){
		return 0;
	}
	return 1;
}
}
