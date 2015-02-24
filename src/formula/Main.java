package formula;

import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("# of Touchdowns: ");
		float TD=input.nextFloat();
		
		System.out.print("# of Yards:  ");
		float yards=input.nextFloat();
		
		System.out.print("# of Interception: ");
		float intercept=input.nextFloat();
		
		System.out.print("# of Completions: ");
		float comp=input.nextFloat();
		
		System.out.print("# of Pass attempted: ");
		float PA=input.nextFloat();
		
		input.close();
		
		float a=(float)((comp/PA)-0.3)*5;
		double b=((yards/PA)-3)*.25;
		float c=(float)(TD/PA)*20;
		float d=(float)(2.375-((intercept/PA)*25));
		
		float Passerrating=(float)((a+b+c+d)/6)*100;	
		System.out.println("The passer rating is:"+Passerrating);
	}
}