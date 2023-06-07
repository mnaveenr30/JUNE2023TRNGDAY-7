class C{
public void disp(){
System.out.println("Method of Class C");
}
}

class A extends C{
public void disp()
{
System.out.println("Method of Class A");
}
}
class B extends C{
public void disp(){
System.out.println("Method of Class B");
}
}

class TEST{
public void disp(){
System.out.println("Method of Class D");
}
public static void main(String args[]){
TEST obj= new TEST();
obj.disp();
}
}
