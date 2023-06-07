class Animal{
void eat(){System.out.println("eating....");}
}
class Dog extends Animal{
void bark(){System.out.println("barking....");}
}
class TestInheritance{
public static void main(String args[]){
Dog p=new Dog();
p.bark();
p.eat();
}
}