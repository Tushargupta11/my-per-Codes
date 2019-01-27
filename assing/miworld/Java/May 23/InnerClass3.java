class Person
{
 void eat(){

}
}
public class InnerClass3
{
 public static void main(String args[]) 
 {
  Person p=new Person(){
  void eat() {
System.out.println("Nice Fruits..");
}
  };
  p.eat();
 }
}