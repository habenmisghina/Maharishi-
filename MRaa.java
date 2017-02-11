package mumExamSolutions;

public class MRaa {

	public static void main(String[] args) {
		int[]a={-8,0, 0, 2,0};
		int i=isMeera(a);
		System.out.println(i);
		

	}
	public static int isMeera(int[]a){
		int sum=0;
		for(int i=0;i<a.length;i++){
			if(a[i]>i){
				return 0;
			}
			sum=sum+a[i];
		}
		if(sum!=0){
			return 0;
		}
		return 1;
	}

}
