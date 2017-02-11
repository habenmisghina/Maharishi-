package mumExamSolutions;

public class Iscomplete {

	public static void main(String[] args) {
		int[]a={2, 3, 2, 11, 6, 10,- 4,9, 8};
		int i=isComplete(a);
		System.out.println(i);

	}
	public static int isComplete(int[]a){
		int maxeven=0;
		int count=0;
		for(int i=0;i<a.length;i++){
			if(a[i]<=0){
				return 0;
			}
			else if(a[i]%2==0){
				if(a[i]>maxeven){
					maxeven=a[i];
				}
			}
		}
		for(int i=maxeven-2;i>0;i=-2){
			count=0;
			for(int j=0;j<a.length;j++){
				if(a[j]==i){
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
