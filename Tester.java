import java.util.ArrayList;

public class Tester {

    public static void main(String args[]){
        // student arraylist
        ArrayList<Student> students = new ArrayList<Student>();
        // 5 students
        students.add(new Student("Elle Woods", 90, 95, 98, 96, 93));
        students.add(new Student("Warren Huntington", 50, 46, 67, 77, 68));
        students.add(new Student("Vivian Kensington", 99, 98, 97, 96, 95));
        students.add(new Student("Enid Hoopes", 87, 77, 92, 91, 90));
        students.add(new Student("David Kidney", 99, 99, 98, 99, 97));

        // print table
        printTable(students);

        // replace name
        replaceName(students, "David Kidney", "Emmett Richmond");

        // replace grade
        replaceGrade(students, "Elle Woods", 4, 99);

        // replace name and grade
        replaceNameAndQuiz(students, "Vivian Kensington", "Bruiser Woods", 40, 22, 38, 62, 55);

        // add student
        System.out.println("test");
        addStudent(students, "Warren Huntington", "Chutney Windam", 70, 77, 75, 62, 47);

        // delete student
        deleteStudent(students, "Enid Hoopes");
    }


    // traverse through arraylist and print each student in a table 
    public static void printTable(ArrayList<Student> itemList){
        System.out.println("Starting Gradebook:");
        System.out.println("-----------------------------------------");
        System.out.printf("%s %11s %3s %3s %3s %3s \n", "Student name", "Q1", "Q2", "Q3", "Q4", "Q5");

        for(Student s : itemList){
            System.out.println(s.toString());
        }
    }

    // replace a student's name with a new one.
    public static void replaceName(ArrayList<Student> itemList, String find, String replacement){
        for(Student s : itemList){
            if(s.getName().equals(find)){
                s.setName(replacement);
            }
        }

        System.out.println("\n" + "<<Replacing " + find + " with " + replacement + ">>" + "\n");

        printTable(itemList);
    }

    // replace a student's quiz grade with a new one
    public static void replaceGrade(ArrayList<Student> itemList, String find, int num, int score){
        for(Student s : itemList){
            if(s.getName().equals(find)){
                s.setQuiz(num, score);
            }
        }
        if(find.substring(find.length() -1).equals("s")){
            System.out.println("\n" + "<<Replacing " + find + "' quiz " + num + " grade with " + score + ">>" + "\n");
        }
        else System.out.println("\n" + "<<Replacing " + find + "'s quiz " + num + " grade with " + score + ">>" + "\n");
        

        printTable(itemList);
    }

    // replace a student with another one
    public static void replaceNameAndQuiz(ArrayList<Student> itemList, String find, String replacement, int quiz1, int quiz2, int quiz3, int quiz4, int quiz5){

            for(Student s : itemList){
                if(s.getName().equals(find)){
                    s.setName(replacement);
                    s.setQuiz(1, quiz1);
                    s.setQuiz(2, quiz2);
                    s.setQuiz(3, quiz3);
                    s.setQuiz(4, quiz4);
                    s.setQuiz(5, quiz5);
                }
            }
    
            System.out.println("\n" + "<<Replacing student " + find + " with student " + replacement + ">>" + "\n");
    
            printTable(itemList);
    }

    // insert a new student before another student 
    public static void addStudent(ArrayList<Student> itemList, String find, String student, int quiz1, int quiz2, int quiz3, int quiz4, int quiz5){
        int index = 0;
        for(int i = 0; i < itemList.size(); i++){
            if(itemList.get(i).getName().equals(find)){
                index = i;
            }
                
        }
        itemList.add(index, new Student(student, quiz1, quiz2, quiz3, quiz4, quiz5));

        System.out.println("\n" + "<<Adding " + student + " before " + find + ">>" + "\n");

        printTable(itemList);

    }

    // delete a student by name
    public static void deleteStudent(ArrayList<Student> itemList, String find){
        for(Student s : itemList){
            if(s.getName().equals(find)){
                itemList.remove(s);
            }
        }

        System.out.println("\n" + "<<Removing " + find + ">>" + "\n");

        printTable(itemList);
    }
}
