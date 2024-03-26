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
    // find maximum grade
    public int getMaximum(){
        int highGrade = grades[0];
        for (int grade : grades){
            if (grade > highGrade){
                highGrade = grade;
            }
        }
        return highGrade;
    }
    // determine average grade Test
    public double getAverage(){
        int total = 0;
        for (int grade : grades){
            total += grade;
        }
        return (double) total/grades.length;
    }
    // output barchart displaying grade distribution
    public void outputBarchart(){
        System.out.println("Grade distribution:");
        // stores frequency od grades in each range of 10 grades
        int [] frequency = new int[11];
        for (int grade : grades){
            ++frequency[grade/10];

            for (int count =0; count < frequency.length; count++){
                if (count == 10){
                    System.out.printf("%5d: ", 100);
                }
            }
        }
    }
}
