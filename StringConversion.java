import java.util.Scanner;
class StringConversion{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
String str=sc.nextLine(),str1,str2;
str1=str.toLowerCase();
str2=str.toUpperCase();
System.out.println("String converted into lower case is\t"+str1);
System.out.println("String converted upper lower case is\t"+str2);
}
}