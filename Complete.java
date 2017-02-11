package mumExamSolutions;

public class Complete {

	public static void main(String[] args) {
		int [] a={2,6,3,4};
		int i=isComplete(a);
		System.out.println(i);

	}
	public static int isComplete(int []a){
		int maxeven=Integer.MIN_VALUE;
		int mineven=Integer.MAX_VALUE;
		int evencount=0;
		for(int i=0;i<a.length;i++){
			if(a[i]%2==0){
				if(maxeven<a[i]){
					maxeven=a[i];
				}
				if(mineven>a[i]){
					mineven=a[i];
				}
				evencount++;
			}
			
		}
		
		if(mineven==maxeven||evencount==0){
			return 0;
			
		}
		for(int i=mineven+1;i<maxeven;i++){
			int count=0;
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
