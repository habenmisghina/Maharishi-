package mumExamSolutions;

public class Isbalanced {

	public static void main(String[] args) {
		int[]a={2,-3, 2, 3,-2};
		int i=isComplete(a);
		System.out.println(i);

	}
	public  static int isComplete(int[]a){
		int count=0;
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a.length;j++){
				if(a[i]+a[j]==0){
					count++;
				}
			}
			if(count==0)
				return 0;
		}
		return 1;
	}

}
