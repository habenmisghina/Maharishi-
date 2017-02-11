package mumExamSolutions;

public class Array121 {

	public static void main(String[] args) {
		int[] a = { 1,1,1,1,1,1, 2, 2, 1, 1 ,1,1,1,1};
		int i = isArray121(a);
		System.out.println(i);

	}

	public static int isArray121(int[] a) {
		int pre2countof1 = 0;
		int post2countof1= 0;
		int mid2count = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == 1) {
				if(mid2count==0){
					pre2countof1++;
				}
				else{
					post2countof1++;
				}
			}
			else if(a[i]==2&&post2countof1==0){
				mid2count++;
			}
			else{
				return 0;
			}
		}
		if(pre2countof1!=post2countof1||mid2count==0|| pre2countof1==0&&post2countof1==0){
			return 0;
		}
		return 1;

	}
}
