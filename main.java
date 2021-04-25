package homeWork2_1;

public class main {

	public static void main(String[] args) {
		
		Courses course1= new Courses("software developer course1","C#",0);   
		
		Courses course2= new Courses();
		course2.name="software developer course2";
		course2.programmingLanguages="Java";
		course2.price=1500;
		
		Courses course3= new Courses("Basic Software Education","Phyton",2000);
		
		Courses[] courses= {course1,course2,course3};
		
		for(Courses course:courses) {
			
			System.out.println(course.price
					);
			
		}
		
		CoursesManager coursesManager= new CoursesManager();
		coursesManager.endAndContinue(course1);
		coursesManager.endAndContinue(course2);
		
		
		
		CoursesManager2 coursesManeger2= new CoursesManager2();
		coursesManeger2.previousLesson(course3);
		coursesManeger2.previousLesson(course2);
		coursesManeger2.previousLesson(course1);
		
		
	}

}
