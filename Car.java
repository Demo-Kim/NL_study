package NL_02;

public class Car {
			String name;
			int v;
			int location = 0;
			int Driving_time;
			
			Car() {
				
			}
			
			Car(String name, int v, int location){
			this.name = name;
			this.v = v;
			this.location = location;
			}
		
			
			@Override
			public String toString() {
				return "Car [name=" + name + ", velocity=" + v + ", location=" + location + "]";
			}


			void Drive(int t) {
				this.Driving_time = t;
				System.out.println("�ڵ����� ���� ��ġ = " + location);
				location = location + Driving_time * v ;
				System.out.println("�ڵ����� ���� ��ġ = " + location);
			}
			
			
	
}
