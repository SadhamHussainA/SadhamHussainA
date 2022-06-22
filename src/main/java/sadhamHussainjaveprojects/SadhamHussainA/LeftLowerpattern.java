package sadhamHussainjaveprojects.SadhamHussainA;

public class LeftLowerpattern {
	public static void main(String[] args) {
		
		for(int row=1;row<=100;row++) {
			
			for(int space=99;space>=row;space--) {
				System.out.print(" ");
				
			}
			for(int col=1;col<=row;col++) {
				System.out.print("#");
			}
			System.out.println();
		}
	}

}
