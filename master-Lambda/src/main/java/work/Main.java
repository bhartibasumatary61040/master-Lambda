package work;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("My system strts..");
		
//	MyInter myInter = new MyInterImpl();
//	myInter.sayHello();
		
//		MyInter i = new MyInter() {
//			
//			@Override
//			public void sayHello() {
//            System.out.println("Thhis is my first anonymous class");				
//			}
//		};
//		
//		i.sayHello();
//		
//		MyInter i2 = new MyInter() {
//			
//			@Override
//			public void sayHello() {
//				System.out.println("This is my 2nd anonymous class");
//				
//			}
//		};
//		i2.sayHello();
		
		//using our interface with the help of lambda
		
		MyInter i =()->{
			System.out.println("This is first time i am using lambda");
		};
		i.sayHello();
		
		MyInter i2 = ()-> System.out.println("This is my 2nd lambda");
		i2.sayHello();
		
		
		SumInter sumInter = ( a, b)->  a+b;
		
		System.out.println(sumInter.sum(2, 6));
		System.out.println(sumInter.sum(4, 7));
		
		LengthInter lengthInter = str -> str.length();
		System.out.println(lengthInter.getLength("Jojo Bharti"));
		
		

	}

}
