package homeWork2_1;

public class Courses {
	
	public Courses() {
		
		System.out.println("Constructor Kismi.Class çalýþtýðýnda otomatik  calisir");
		
		
	}
	
	public Courses(String name,String programmingLanguage,int price) {
		this();                  //non-parameter contructor will work.
		this.name=name;
		this.programmingLanguages=programmingLanguage;
		this.price=price;
		
	}
	
	String name;
	String programmingLanguages;
	int price;
}
