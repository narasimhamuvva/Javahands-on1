import java.util.Scanner;
public class Switchclass {
	public void display(int cardnumber)
	{
switch(cardnumber)
{
case 1:
	System.out.println("you have selected card 1");
	break;
case 2:
	System.out.println("you have selected card 2");
	break;
case 3:
	System.out.println("you have selected card 3");
	break;
case 4:
	System.out.println("you have selected card 4");
	break;
case 5:
	System.out.println("you have selected card 5");
	break;
case 6:
	System.out.println("you have selected card 6");
	break;
case 7:
	System.out.println("you have selected card 7");
	break;
case 8:
	System.out.println("you have selected card 8");
	break;
case 9:
	System.out.println("you have selected card 9");
	break;
case 10:
	System.out.println("you have selected card 10");
	break;
	
}
}

	
	
public static void main(String args[])
{
	Switchclass s=new Switchclass();
	Scanner sc = new Scanner(System.in);
	int cardnumber;
    System.out.println("choose one card from 1 to 10 ");
	cardnumber= sc.nextInt();
	s.display(cardnumber);
}
}
