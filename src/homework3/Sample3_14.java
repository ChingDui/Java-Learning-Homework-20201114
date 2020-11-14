package homework3;

public class Sample3_14 {
	public static void main(String[] args) {
		Car14 car1;
		car1 = new Car14();
		car1.show();
		
		Car14 car2;
		car2 = new Car14(1234, 25.0);
		car2.show();
		
	}
}

class Car14 {
	private int num;
	private double gas;

	public Car14(){
		num = 0;
		gas = 0.0;
		System.out.println("產生了車子");
	}
	
	public Car14(int n , double g)
	{
		this();
		num = n;
		gas = g;
		System.out.println("生成了車號為"+ num + "汽油量為"+ gas);
		
	}
	public void show() {
		System.out.println("車號是" + this.num);
		System.out.println("汽油量是" + this.gas);
	}
}
