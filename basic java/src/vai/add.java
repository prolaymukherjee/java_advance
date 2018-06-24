package vai;

import org.omg.CORBA.PUBLIC_MEMBER;

public class add {
	
	public  int add(int a,int b){
		return a+b;
	}

	public static void main(String[] args) {
		
		add add =new add();
		
		System.out.println("The addition is:"+add.add(10,20));
		
	}

}
