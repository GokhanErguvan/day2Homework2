package homeWork2_2;

public class MyCourse {

	public MyCourse() {
		System.out.println("empty Constructor part");
		
	}
	
	public MyCourse(String name,int completedLevel,int date) {
		
		this();  //To empty part
		this.name=name;
		this.completedLevel=completedLevel;
		this.date=date;
		
	}
	
	
	
	String name;
	int completedLevel;
	int date;
	
}
