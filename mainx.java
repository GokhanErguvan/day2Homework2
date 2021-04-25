package homeWork2_2;

public class mainx {

	public static void main(String[] args) {
	
				
				MyCourse myCourse1= new MyCourse();
				myCourse1.name  = "Java + React";
				myCourse1.completedLevel = 32;
				myCourse1.date = 21;
				
				
				MyCourse myCourse2 = new MyCourse("C#",16,20);
				
				
				MyCourse[] MyCourses= {myCourse1,myCourse2};
				
				for(MyCourse mycourse:MyCourses) {
					
					System.out.println(mycourse.completedLevel);
				}
				
				
				
			
				
			
	}

}
