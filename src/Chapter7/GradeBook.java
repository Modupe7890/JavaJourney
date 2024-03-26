package Chapter7;

public class GradeBook {
    private String courseName;
    private int [] grades;

    // constructors
    public GradeBook(String courseName, int[] grades){
        this.courseName = courseName;
        this.grades = grades;
    }
    // method to set course name

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    // method to get coursename

    public String getCourseName() {
        return courseName;
    }
    public void processGrade(){
        outputGrades();
        System.out.printf("%nClass average is %.2f%n",getAverage());

        System.out.printf("Lowest grade is %d%nHighest grade is %d%n%n",getMinimum(),getMaximum());
        outputBarchart();
    }
    // find minimum grade
    public int getMinimum(){
        int lowGrade = grades[0];
        for(int grade : grades){
            if (grade < lowGrade){
                lowGrade = grade;
            }
        }
        return lowGrade;
    }
}
