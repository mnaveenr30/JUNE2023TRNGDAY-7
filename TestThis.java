class Student{
int rollno;
String name;
float fee;
Student(int rollno,String name,float fee){
this.rollno=rollno;
this.name=name;
this.fee=fee;
}
void display(){System.out.println(rollno+"\t"+name+"\t"+fee);}
}
class TestThis{
public static void main(String args[]){
Student S1=new Student(111,"ankit",5000f);
Student S2=new Student(222,"sumit",6000f);
S1.display();
S2.display();
}
}