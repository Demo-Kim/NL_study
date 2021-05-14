package NL_02;

public class test {
	public static void main(String[] args) {
		Car car1 = new Car("뛰뛰", 60, 0);	
		Car car2 = new Car("빵빵", 40, 0);
		System.out.println(car1.toString());
		System.out.println(car2.toString());
		car1.Drive(3);
		car2.Drive(5);
	}
}
