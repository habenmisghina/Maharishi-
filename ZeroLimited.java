package mumExamSolutions;

public class ZeroLimited {
	public static void main(String[] arg) {
		int[] a = { 1, 0, 5, 9, 0, 2, 3, 0 };
		int i = isZerolimited(a);
		System.out.println(i);
	}

	public static int isZerolimited(int[] a) {
		
		for (int i=0,k=1;i<a.length;i++,k=k+3) {
			System.out.println(k);
			if(a[k]!=0){
				return 0;
			}
			 if(a[i]==0 && i!=k){
			
					return 80;
				}
				
			}
		
	return 1;		
}
}