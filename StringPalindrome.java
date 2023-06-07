import java.util.Scanner;
class StringPalindrome{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
String str=sc.nextLine(),res="";
for(int i=str.length()-1;i>=0;i--){
res=res+str.charAt(i);
}
System.out.println(res);
if(res.equals(str)) System.out.println(res+" \tis a palindrome using equals() method");
else System.out.println(res+" \tis Not a palindrome using equals() method");

if(res.equalsIgnoreCase(str)) System.out.println(res+" \tis a palindrome using equalsignore() methode");
else System.out.println(res+" \tis Not a palindrome using equalsignorecase() metho");//it ignore case sensitive

str=str.toLowerCase();
res=res.toLowerCase();


if(res.equals(str)) System.out.println(res+" \tis a palindrome using toLowerCase() method");
else System.out.println(res+" \tis Not a palindrome using toLowerCase() method");

str=str.toUpperCase();
res=res.toUpperCase();


if(res.equals(str)) System.out.println(res+" \tis a palindrome using toUpperCase() method");
else System.out.println(res+" \tis Not a palindrome using toUpperCase() method");


}
}