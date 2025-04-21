package oops;

public class Students {
int id;
static String name;
public static int marks;

Students(int id){
	this.id=id;
}

public static void display() {
	System.out.println("it is student desplay");
}

public void show() {
	
	System.out.println("it is show method"+ id);
}


}

