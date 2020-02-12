package Capgemini.Dlg;

public class ProgramPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int maxNum=20;
		int prev=1;
		int present=1;
		int prev2=0;
		for(int i=1;i<=20;i++) {
			if(present>20) {
				break;
			}
			System.out.println(present);
			present=prev+prev2;
			prev2=prev;
			prev=present;
		}
		
		
		
	}

}
