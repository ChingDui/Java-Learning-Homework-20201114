package homework3;

public class Sample3_4_1 {
	public static void main(String[] args) {
		Car4_1 car1;
		car1 = new Car4_1();
		
		car1.num = 1234;
		car1.gas = 20.5;
		
		car1.show();
		car1.show();
	}
}
class Car4_1
{
	int num;
	double gas;
	
	void show()
	{

		System.out.println("車號是"+this.num);
		System.out.println("汽油量是"+this.gas);
	}
}