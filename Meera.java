package mumExamSolutions;

public class Meera {

	public static void main(String[] args) {
		int[]a={3,6,2};
		int i=isMeera(a);
		System.out.println(i);

	}
	public static int isMeera(int[]a){
		int product=0;
		for(int i=0;i<a.length;i++){
			product=2*a[i];
			for(int j=0;j<a.length;j++){
				if(product==a[j]){
					return 0;
				}
			}
			product=0;
			
		}
		return 1;
	}

}
