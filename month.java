import java.util.Scanner;


public class month {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n;		
		Scanner s =new Scanner(System.in);
		System.out.print("Enter Month No: ");
		n = s.nextInt();
		
		   switch(n)
		   {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
			       System.out.println("Month have 31 days \n");
			       break;
			case 2:
			       System.out.println("2nd month is a february and have 28 days \n");
			       System.out.println("in leap year The Feb Have 29 days\n");
			       break;
			case 4:
			case 6:
			case 9:
			case 11:
			       System.out.println("Month have 30 days \n");
			       break;
		default:
			       System.out.println("invalid Month number \n try again ....\n");
			       break;
		      }


	}

}
