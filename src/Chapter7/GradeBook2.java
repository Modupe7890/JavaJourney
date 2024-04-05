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

    public String getCourseName() {
        return courseName;
    }
    public void processGrades(){
        outputGrades();
        System.out.printf("%n%s %d%n%s %d%n%n",
                "Lowest grade in the grade book is", getMinimum(),
                "Highest grade in the grade book is", getMaximum());
        outputBarChart();
    }
    public int getMinimum(){
            int lowGrade = grades [0][0];
            for (int[] studentGrades : grades){
                for (int grade : studentGrades){
                    if(grade < lowGrade){
                        lowGrade = grade;
                    }
                }
            }
        return lowGrade;
    }
    public int getMaximum(){
        int highGrade = grades [0][0];
        for (int[] studentGrades : grades){
            for (int grade : studentGrades){
                if(grade > highGrade){
                    highGrade = grade;
                }
            }
        }
        return highGrade;
    }

    public double getAverage(int[] setOfGrades) {
        int total = 0;
        for(int grade : setOfGrades) {
            total = +grade;
        }
        return (double) total / setOfGrades.length;
    }
    public void outputBarChart(){

    }
}
