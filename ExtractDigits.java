import java.util.Scanner;
class ExtractDigits{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
String strobj=sc.nextLine(),res="";
int j=strobj.length()-1;
for (int i=0;i<=j;i++){
if(strobj.charAt(i)>='0' && strobj.charAt(i)<='9'){
System.out.print(strobj.charAt(i));
res+=strobj.charAt(i);
}
}
System.out.print("\n"+res);
}
}