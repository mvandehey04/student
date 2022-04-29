/**
 * Purpose:  
 * @author Madeline Vande Hey
 * @version 3/16/22
 */
public class Student{
    private String name;
    private int quiz1;
    private int quiz2;
    private int quiz3;
    private int quiz4;
    private int quiz5;

    public Student(String name, int quiz1, int quiz2, int quiz3, int quiz4, int quiz5){
        this.name = name;
        this.quiz1 = quiz1;
        this.quiz2 = quiz2;
        this.quiz3 = quiz3;
        this.quiz4 = quiz4;
        this.quiz5 = quiz5;
    }

    // takes in a quiz number as input and returns the quiz value
    public int returnQuiz(int num){
        if(num == 1) return quiz1;
        if(num == 2) return quiz2;
        if(num == 3) return quiz3;
        if(num == 4) return quiz4;
        if(num == 5) return quiz5;
        else return 0;
    }

    // sets a quiz score based on inpute of quiz number and new quiz score
    public void setQuiz(int num, int score){
        if(num == 1) quiz1 = score;
        if(num == 2) quiz2 = score;
        if(num == 3) quiz3 = score;
        if(num == 4) quiz4 = score;
        if(num == 5) quiz5 = score;
    }

    // get the name of a student
    public String getName(){
        return name;
    }

    // set the name of a student
    public void setName(String newName){
        name = newName;
    }

    // prints the name of the student along with the quiz scores
    public String toString(){
        return String.format("%-21s %-3d %-3d %-3d %-3d %d",name, quiz1, quiz2, quiz3, quiz4, quiz5);
    }
}