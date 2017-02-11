package mumExamSolutions;

public class OneLess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 4, 2, 3, 1,0 };
		int i = isOneLess(a);
		System.out.println(i);
	}
	public static int isOneLess(int[] a){
		int count=0;
		for(int i=0;i<a.length;i++){
			count=0;
			for(int j=0;j<a.length;j++){
				if(i==a[j]){
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
