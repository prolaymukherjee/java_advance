package vai;

import java.io.NotActiveException;
import java.util.Scanner;

import javax.print.attribute.standard.RequestingUserName;

import org.omg.CORBA.PUBLIC_MEMBER;

public class EEvv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner arafth=new Scanner(System.in);
		
			System.out.println("Please Enter Your numbe:");
		
		int a=arafth.nextInt();
		
		if(a%2==0){
			System.out.println(a+"This is number even numbeer" );
		}
		else
			System.out.println(a+"This is odd number"); 

	}
	
}
