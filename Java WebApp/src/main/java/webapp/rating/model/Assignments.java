package webapp.rating.model;

public class Assignments {

	public String studentName;
	public String subject;
	public String assignmentCategory;
	public int points;
	public String date;



	public Assignments(String studentName, String subject, String assignmentCategory, String date, int points) {
		this.studentName = studentName;
		this.subject = subject;
		this.assignmentCategory = assignmentCategory;
		this.date = date;
		this.points = points;

	}

	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getAssignmentCategory() {
		return assignmentCategory;
	}

	public void setAssignmentCategory(String assignmentCategory) {
		this.assignmentCategory = assignmentCategory;
	}


}
