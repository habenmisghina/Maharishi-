package mumExamSolutions;

public class HasNValues {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int n = 10;
		int i = hasNValues(a, n);
		System.out.println(i);

	}

	public static int hasNValues(int[] a, int n) {
		int flag = 0;
        int count=0;
		int[] b = new int[a.length];
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a.length;j++){
				if(a[i]==b[j]){
					flag++;
				}
				
			}
			if(flag==0){
				b[i]=a[i];
				count++;
			}
		}
		if(n==count){
			return 1;
		}
		return 0;

	}

}
