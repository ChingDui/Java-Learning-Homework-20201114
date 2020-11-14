package homework3;

public class Sample3_4 {
	public static void main(String[] args) {
		Car4 car1;
		car1 = new Car4();
		
		car1.num = 1234;
		car1.gas = 20.5;
		
		Car4 car2 ;
		car2 = new Car4();
		car2.num = 2345;
		car2.gas = 30.5;
		
		System.out.println("car1車號是"+car1.num);
		System.out.println("car1汽油量是"+car1.gas);

		System.out.println("car2車號是"+car2.num);
		System.out.println("car2汽油量是"+car2.gas);
	}
}
class Car4
{
	int num;
	double gas;
	
	void show()
	{

		System.out.println("車號是"+this.num);
		System.out.println("汽油量是"+this.gas);
	}
}