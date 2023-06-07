class A{
A(){System.out.println("hello a");}
A(int x){
this();
System.out.println(x);
}
}
class B{
B(){System.out.println("hello b");}
}

class TestThis5{
public static void main(String args[]){
new A(10);
new B();
}
}