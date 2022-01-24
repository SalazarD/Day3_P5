import java.util.ArrayList;
import java.util.HashSet;

public class TrainingDemo {

	public static void main(String[] args) {
		
		ArrayList<TrainingCourse> courses = new ArrayList<TrainingCourse>();
		courses.add(new TrainingCourse(1, "Learn C", "C"));
		courses.add(new TrainingCourse(1, "Learn Java", "Java"));
		courses.add(new TrainingCourse(1, "Learn Python", "Python"));
		
		HashSet<String> languages = getProgrammingLanguages(courses);
		for (String language: languages) {
		System.out.println(language);
		}
		
	}
	
	public static HashSet<String> getProgrammingLanguages(ArrayList<TrainingCourse> courses){
		HashSet<String> languages = new HashSet<String>();
		for (int i=0; i < courses.size(); i++) {
			TrainingCourse course = courses.get(i);
			languages.add(course.getProgrammingLanguage());
			}
			return languages;
			}
		
		
	
	
}
