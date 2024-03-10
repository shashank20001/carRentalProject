package library;
import java.util.Scanner;

public class mainclass {

	public static void main(String[] args) {
		String regusrName = new String("manager");
		String repassword = new String("admin@123");
		// read username and password from keyword compare with resistered username and password
		// if both are matching print login if not print login failed
		Scanner s1 = new Scanner(System.in);
		System.out.println("enter the user");
		String enteredusername = s1.next();
		System.out.println("enter the password");
		String enterpassword = s1.next();
		if(regusrName.equals(enteredusername)&& repassword.equals(enterpassword)) {
			System.out.println("login success");
		}
		else
		{
			System.out.println("login failed");
		}
	}
}
