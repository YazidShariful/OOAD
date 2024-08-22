import java.util.ArrayList;

public class SubjectList {
    public static void main(String[] args) {
        ArrayList<Subject> subs = new ArrayList<Subject>();

        // Adding subjects to the list
        subs.add(new Subject("MATH101", 'A'));
        subs.add(new Subject("PHY101", 'B'));
        subs.add(new Subject("CHEM101", 'C'));

        // Display all subjects
        for (Subject sub : subs) {
            System.out.println(sub);
        }

        // Remove the third element
        subs.remove(2);

        // Display all subjects after removal
        System.out.println("After removing the third element:");
        for (Subject sub : subs) {
            System.out.println(sub);
        }
    }
}
