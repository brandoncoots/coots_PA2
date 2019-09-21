
import java.lang.Math;
import java.util.Scanner;

public class coots_p2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		double weight;
		int feet;
		int inches;
		
		System.out.println("Enter how many pounds you currently weigh:");
			weight = input.nextFloat();
			
		System.out.println("Enter how many feet tall you are (don't add inches yet)");
			feet = input.nextInt();
			
		System.out.println("Inter the amount of inches you are in correlation of your previous input");
			inches = input.nextInt();
			
		double weightInKilos = weight * 0.453592;
		double heightInMeters = (((feet * 12) + inches) * .0254);
		double bmi = weightInKilos / Math.pow(heightInMeters, 2.0);

		System.out.println("Your BMI is: " + bmi);
		
		if (bmi < 18.5 ) 
		{
            System.out.print("Underweight");
        }
		
		else if (bmi >= 18.5 && bmi < 25) 
		{
            System.out.print("Normal");
        }

        else if (bmi >= 25 && bmi < 30) 
        {
            System.out.print("Overweight");
        }

        else if (bmi >= 30) 
        {
            System.out.print("Obese");
        }
		
		input.close();
		
	}
		
		
	}
