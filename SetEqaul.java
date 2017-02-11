package mumExamSolutions;

public class SetEqaul {

	public static void main(String[] args) {
		int[]a={1,12,9};
		int[]b={1,9, 12, 9, 12, 1, 9};
		int i=isSetEqual(a,b);
		System.out.println(i);

	}
	public static int isSetEqual(int[]a,int[]b){
		int count=0;
		int count2=0;
		int count3=0;
		int n;
		if(a.length<b.length){
			n=a.length;
		}
		else{
			n=b.length;
		}
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				if(a[i]!=b[j]){
					count++;
				}
				if(a[i]!=a[j]){
					count2++;
				}
				if(a[i]==b[j]){
					count3++;
				}
				
			}
			if (count3==0||count!=count2){
				return 0;
			}
		}
		return 1;
	}

}
