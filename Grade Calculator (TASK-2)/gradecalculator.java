package confirmation;
import java.util.*;
public class gradecalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		double sum=0;
		//here we consider 5 subjects
		double marks;
		int j=0;
		for(int i=0;i<5;i++) {
			j++;
			System.out.println("Enter the marks for subject "+j+" :");
			marks=sc.nextDouble();
			if(marks>100 || marks<0) {
				System.out.println("Invalid input");
			}
			sum=sum+marks;
		}
		double totalpercent;
		totalpercent=sum/5;
		System.out.println("Total marks acquired by the student is:"+sum);
		System.out.println("The total percentage you have acquired is :"+totalpercent+"%");
		if(totalpercent >=90) {
			System.out.println("Your grade is A");
		}else if(totalpercent >70 && totalpercent<89) {
			System.out.println("Your grade is B");
		}else if(totalpercent>50 && totalpercent <69) {
			System.out.println("Your grade is C");
		}else if(totalpercent>30 && totalpercent<49) {
			System.out.println("Your grade is D");
		}else if(totalpercent <29) {
				System.out.println("Your grade is E");
			}else 
				System.out.println("Invalid output");
		}
   }
