package test;

class TestOuter{
	private int data = 10;
	void display(){
		class Inner{
			void msg(){
				System.out.println(data);
			}
		}
		Inner in = new Inner();
		in.msg();
	}
	public static void main(String[] args) {
		TestOuter obj = new TestOuter();
		obj.display();
	}
}