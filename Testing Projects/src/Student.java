
public class Student {
	private int score;
	private double quizzes;
	private String name;

	public Student(String name, int score) {
		this.score = score;
		this.name = name;
		this.quizzes = 0;
	}

	public Student(String name) {
		this.score = 0;
		this.name = name;
		this.quizzes = 0;
	}

	public Student(int score) {
		this.score = score;
		this.name = "";
		this.quizzes = 0;
	}

	public Student() {
		this.score = 0;
		this.name = "";
		this.quizzes = 0;
	}
	
	public String getName() {
		return name;
	}
	
	public double getTotalScore() {
		return score;
	}
	
	public double getAverageScore() {
		return quizzes != 0 ? score / quizzes : 0;
	}
	
	public void addQuiz(int score) {
		this.score += score;
		this.quizzes++;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}
