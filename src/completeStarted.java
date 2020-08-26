import java.util.Scanner;

public class completeStarted {
    public static void main(String[] args) {

        //The profile labels he chooses for each member of the family are: Full Name, Age, Relation to Cedric.

        Scanner keybd = new Scanner(System.in);
        String memberName;
        int age;
        String relation;

        System.out.println("Full Name: ");
        memberName = keybd.nextLine();

        System.out.println("Age: ");
        age = keybd.nextInt();
        keybd.nextLine();
        System.out.println("Relation to Cedric: ");
//        This line is really messed up somehow:
        relation = keybd.nextLine();
        System.out.println(memberName + ", age " + age + ", is Cedric's " + relation);

    }
}
