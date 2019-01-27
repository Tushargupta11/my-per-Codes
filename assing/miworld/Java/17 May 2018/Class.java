
class Faculty
{
                int id;
                String name;
                void display()
                {
                 System.out.println("Faculty id : "+id);
                 System.out.println("Faculty Name : "+name);
                }
  public static void main(String args[])
  { 
     
     Faculty f1=new Faculty();
     Faculty f2=new Faculty();
     f1.id=1; 
     f1.name="Arpit";
     f2.id=2; 
     f2.name="APpedia";
     f1.display();
     f2.display();

 
  }
}