package Chapter7;

public class GradeBook2 {
    private String courseName;
    private int[][] grades;
    public GradeBook2(String courseName, int[][] grades){
        this.courseName = courseName;
        this.grades = grades;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
}
