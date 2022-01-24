
public class TrainingCourse {
	
	private int courseId;
	private String courseName;
	private String programmingLanguage;
	
	public TrainingCourse(int courseId, String courseName, String programmingLanguage) {
		
		this.courseId = courseId; 
		this.courseName = courseName;
		this.programmingLanguage = programmingLanguage;
		
	}

	public int getCourseId() {
		return courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public String getProgrammingLanguage() {
		return programmingLanguage;
	}

}
