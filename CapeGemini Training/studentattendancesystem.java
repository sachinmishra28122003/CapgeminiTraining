import java.util.ArrayList;

public class studentattendancesystem {

    static ArrayList<String> students = new ArrayList<>();
    static ArrayList<String> attendance = new ArrayList<>();
    static ArrayList<Integer> marks = new ArrayList<>();

    // register student
    static void register(String name) {
        students.add(name);
        attendance.add("Absent");
        marks.add(0);
    }

    // login
    static int login(String name) {
        return students.indexOf(name);
    }

    // join class
    static void joinClass(int id) {
        attendance.set(id, "Present");
    }

    // leave class
    static void leaveClass(int id) {
        attendance.set(id, "Absent");
    }

    // add marks
    static void addMarks(int id, int m) {
        marks.set(id, m);
    }

    public static void main(String[] args) {

        register("Amit");
        register("Riya");

        int amitId = login("Amit");

        joinClass(amitId);
        addMarks(amitId, 80);

        System.out.println("Name: " + students.get(amitId));
        System.out.println("Attendance: " + attendance.get(amitId));
        System.out.println("Marks: " + marks.get(amitId));

        leaveClass(amitId);
        System.out.println("Attendance after leaving: " + attendance.get(amitId));
    }
}