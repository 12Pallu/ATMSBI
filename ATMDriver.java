import java.util.Scanner;

class ATMDriver
{
static Scanner scan = new Scanner(System.in); 
public static void main(String[] args)
	{

Bank cl= new Bank("Gaurav More", 1011, 500, 5896);
ATMSBI a= new ATMSBIChild(); 
boolean b= true;

while (b)
{

   System.out.println("Enter 1 for withdraw \nEnter 2 for deposit"); 
   int option= scan.nextInt();

    switch (option)
	{

     case 1:

     a.withdraw(cl);

     break;

     case 2:

      a.deposit(cl);

      break;

      case 3:

      a.checkBalance (cl);

       break;

      case 4:

      a.changePin(cl);

        break;
      case 5:

      a.details(cl);

       break;

       default:

        System.out.println("Choose correct option");
	    }
 
        System.out.println("Do you want to continue the operaton then Press 0"+"press any other key for exit"); 
        int v=scan.nextInt();
		if (v !=1)
		{
			b=false;
		}
}
}




}