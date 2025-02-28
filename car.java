class car
{
String brand;
int year;
void display()
{
System.out.println("brand: "+brand);
System.out.println("year: "+year);
}
public static void main(String[]args)
{
car c1=new car();
car c2=new car();
c1.brand="volvo";
c1.year=1999;
c2.brand="bmw";
c2.year=2002;
c1.display();
c2.display();
}
}

