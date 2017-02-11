package mumExamSolutions;

public class Nice {

	public static void main(String[] args) {
		int[]a={4, 10, 8, 3};
		int i=isNice(a);
		System.out.println(i);

	}
public static int isNice(int []a){
	int count=0;
	for(int i=0;i<a.length;i++){
		count=0;
		for(int j=0;j<a.length;j++){
			if(a[i]-a[j]==1||a[i]-a[j]==-1){
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
