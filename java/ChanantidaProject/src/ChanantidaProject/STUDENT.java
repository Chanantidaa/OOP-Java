package ChanantidaProject;

public class STUDENT {

	public String id;
	public String name; 
	public double gpa;

	public void setID(String ID) {
		id = ID;
	}
	public void setName(String n) {
	name = n;
	}
	public void setGPA(Double GPA) {
	gpa = GPA;
	}
	public void showDetail () {
	System.out.println("ID: "+id);
	System.out.println("NAME: "+name);
	System.out.println("GPA: "+gpa);
}
}
