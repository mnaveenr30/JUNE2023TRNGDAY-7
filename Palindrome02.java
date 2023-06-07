import java.util.Scanner;
class Palindrome02{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
String strobj=sc.nextLine(),res="",test="";
int ascii;

//converting into lower case

for (int i=0;i<=strobj.length()-1;i++){
if(strobj.charAt(i)>='A' && strobj.charAt(i)<='Z'){
ascii=strobj.charAt(i);
ascii=ascii+32;
res=res+(char)ascii;
}
else if(strobj.charAt(i)>='a' && strobj.charAt(i)<='z'){
res=res+strobj.charAt(i);
}
else res=res+strobj.charAt(i);
}
System.out.println(res);

res="";

//converting into upper case

for (int i=0;i<=strobj.length()-1;i++){
if(strobj.charAt(i)>='A' && strobj.charAt(i)<='Z'){
res=res+strobj.charAt(i);
}
else if(strobj.charAt(i)>='a' && strobj.charAt(i)<='z'){
ascii=strobj.charAt(i);
ascii=ascii-32;
res=res+(char)ascii;
}
else res=res+strobj.charAt(i);
}
System.out.println(res);



for(int i=res.length()-1;i>=0;i--){
test=test+res.charAt(i);
}
if(res.equals(test)) System.out.println(test+" \tis a palindrome");
else System.out.println(test+" \tis Not a palindrome");

}
}
