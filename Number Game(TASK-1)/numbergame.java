package confirmation;
import java.util.*;
public class numbergame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int max=100;
		int min=0;
		int attempts =0;
		int rounds=0;
	
			for(int j=0;j<max;j++) {
				
		char a;
		System.out.println("Do you want to start a round ? Type Y for starting it "
				+ "and N for ending it, knowing your game stats and starting another round.");
		a=sc.next().charAt(0);
			
			switch(a){
				
			case 'Y':
				rounds++;
			int guessnumber=(int)((Math.random() * (max - min)) + min);
			
			for(int i=0;i<10;i++) {// Max number of guess attempts limited to 10
				
				System.out.println("Enter your guess: ");
				int n=sc.nextInt();
				attempts++;
				
				if(n==guessnumber) {
					System.out.println("Your guess was right ! YOU WON");
					break;
					
				}else if(n>guessnumber) {
					System.out.println("Guess was too high ! try again.");
					
				}else if(n<guessnumber) {
					System.out.println("Guess was too low ! try again.");
					
				}else 
					System.out.println("Invalid input");
				}
			break;
			
			case 'N':
				System.out.println("Number of rounds played:"+rounds);
				System.out.println("Number of attempts taken to win the game :"+attempts);
				break;
				
			default :
				System.out.println("Invalid input of character.");
			}
		}
	}
}