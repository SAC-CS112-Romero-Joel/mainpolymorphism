package lab1polymorphism;
import java.util.Scanner;
public class MAinpolymorphism {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int iDices, iBounces, iRoll;

		System.out.print("Enter the number of dices: ");
		iDices = scan.nextInt(); 
		System.out.print("Enter the number of bounces: ");
		iBounces = scan.nextInt(); 
		Dices dice = new Dices();
		if (iBounces == 1)
			iRoll = dice.Throw(iDices);
		else
			iRoll = dice.Throw(iDices, iBounces);
		System.out.println(iRoll);
	
	}

}
