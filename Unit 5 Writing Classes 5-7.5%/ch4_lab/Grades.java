// ****************************************************************
//   Grades.java
//
//   Use Student class to get test grades for two students
//   and compute averages
//          
// ****************************************************************
public class Grades
{
    public static void main(String[] args)
    {
		Student student1 = new Student("Mary");
		//create student2, "Mike"
		Student student2 = new Student("Mike");
		//input grades for Mary
		student1.inputGrades();
		//print average for Mary
		System.out.println(student1);
		System.out.println("The average score for "+student1.getName()+" is: "+student1.getAverage());

		//input grades for Mike
		student2.inputGrades();
		//print average for Mike
		System.out.println("The average score for "+student2.getName()+" is: "+student2.getAverage());
	}
}
