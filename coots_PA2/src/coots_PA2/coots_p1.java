package coots_PA2;

import java.util.Scanner;
public class coots_p1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	       System.out.print("Enter a 4 digit integer:");
	       String number = sc.nextLine();
	       String encryptedNumber = encrypt(number);
	       System.out.println("The decrypted number is:"+ encryptedNumber);
	       System.out.println("The original number is:"+ decrypt(encryptedNumber));
	}

		  private static String decrypt(String encryptedNumber) {
		// TODO Auto-generated method stub
			  int arr1[] = new int[4];
		       for(int i=0;i<4;i++) {
		           String number1 = null;
				char ch = number1.charAt(i);
		           arr1[i] = Character.getNumericValue(ch);
		       }
		       int temp1 = arr1[0];
		       arr1[0]=arr1[2];
		       arr1[2]=temp1;
		       temp1 = arr1[1];
		       arr1[1]=arr1[3];
		       arr1[3]=temp1;
		       for(int i=0;i<4;i++) {
		           int digit = arr1[i];
		           switch(digit) {
		               case 0:
		                   arr1[i] = 3;
		                   break;
		               case 1:
		                   arr1[i] = 4;
		                   break;
		               case 2:
		                   arr1[i] = 5;
		                   break;
		               case 3:
		                   arr1[i] = 6;
		                   break;
		               case 4:
		                   arr1[i] = 7;
		                   break;
		               case 5:
		                   arr1[i] = 8;
		                   break;
		               case 6:
		                   arr1[i] = 9;
		                   break;
		               case 7:
		                   arr1[i] = 0;
		                   break;
		               case 8:
		                   arr1[i] = 1;
		                   break;
		               case 9:
		                   arr1[i] = 2;
		                   break;
		           }
		       }
		       int newNumber1 = 0 ;
		       for(int i=0;i<4;i++)
		           newNumber1 = newNumber1 * 10 + arr1[i];
		       String output1 = Integer.toString(newNumber1);
		       if(arr1[0]==0)
		           output1 = "0"+output1;
		       return output1;  
	}

		private static String encrypt(String number) {
		       int arr[] = new int[4];
		       for(int i=0;i<4;i++) {
		           char ch = number.charAt(i);
		           arr[i] = Character.getNumericValue(ch);
		       }
		       for(int i=0;i<4;i++) {
		           int temp = arr[i] ;
		           temp += 7 ;
		           temp = temp % 10 ;
		           arr[i] = temp ;
		       }
		       int temp = arr[0];
		       arr[0] = arr[2];
		       arr[2]= temp ;
		       temp = arr[1];
		       arr[1] =arr[3];
		       arr[3] = temp ;
		       int newNumber = 0 ;
		       for(int i=0;i<4;i++)
		           newNumber = newNumber * 10 + arr[i];
		       String output = Integer.toString(newNumber);
		       if(arr[0]==0)
		           output = "0"+output;
		       return output;
	}
}
