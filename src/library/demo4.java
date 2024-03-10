package library;

public class demo4 {
public static void main(String[] args) {
	String s1 ="level";
	String rev="";
	for(int i=s1.length()-1;i>=0;i--)
	{
		rev=rev+s1.charAt(i);
	}
	if(s1.equals(rev))
	{
		System.out.println("the number is palindrom");
	}else {
		System.out.println("the number is not palindrom");
	}
}
}


