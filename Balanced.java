package mumExamSolutions;

public class Balanced {

	public static void main(String[] args) {
		int[] a={16,6,7,8,};
		int i=isComplete(a);
		System.out.println(i);

	}
	public static int isComplete(int []a){
		for(int i=0;i<a.length;i++){
			if(i%2==0){
				if(a[i]%2!=0){
					return 0;
				}
			}
			else {
				if(a[i]%2==0){
					return 0;
				}
			}
		}
		return 1;
	}

}
