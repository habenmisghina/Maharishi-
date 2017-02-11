package mumExamSolutions;

public class HOLLOW2 {

	public static void main(String[] args) {
		int[]a={1,0,0,0,0,1};
		int i=ishallow(a);
		System.out.println(i);
	}
public static int ishallow(int[]a){
	int pre0count=0;
	int post0count=0;
	int zerocount=0;
	
	for(int i=0;i<a.length;i++){
		if(a[i]!=0){
			if(zerocount==0){
				pre0count++;
			}
			else{
				post0count++;}
		}
		else if(a[i]==0){
			if(post0count==0){
				zerocount++;
			}
			else{
				return 0;
			}
		}
	}
	if(zerocount<3||post0count!=pre0count||post0count==0&&pre0count==0){
		return 0;
	}
	return 1;
}
}
