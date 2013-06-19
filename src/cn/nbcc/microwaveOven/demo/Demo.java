package cn.nbcc.microwaveOven.demo;

public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Student s = new Student();
		Teacher t = new Teacher();
		Dog dog =new Dog();
		
		Bell b = new Bell();
		b.addBellListener(s);
		b.addBellListener(t);
		b.addBellListener(dog);
		
		b.removeBellListener(s);
		b.removeBellListener(t);
		
		b.ring();

	}

}
