package oops;

class Student2 {

	public void allmethods() {
		Students.display();
		Students cb = new Students(10);
		cb.show();
	}

	public static void simply() {
		System.out.println("simplay");
	}

	public static void main(String[] args) {
		Student2 st = new Student2();
		st.allmethods();
		simply();
	}

}
