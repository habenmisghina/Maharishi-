package mumExamSolutions;

public class BEQ {

	public static void main(String[] args) {
		int i=isBEQ();
		System.out.println(i);

	}
	public static int isBEQ(){
		int max=Integer.MAX_VALUE;
		int pro=0;
		int lastd=0;
		int count6=0;
		int num=0;
		for(int i=0;i<max;i++){
			pro=i*i*i;
			count6=0;
			while(pro>0){
				lastd=pro%10;
				pro=pro/10;
				if(lastd==6){
					count6++;
			
				}
				
			}
			
			if(count6==4){
				num=i;
				break;
			}
		
		}
		return num;
	}

}
