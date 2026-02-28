import java.util.*;
import java.io.*;
public class StudentsAdd {
    public static HashMap<Integer, String> Students = new HashMap<>();
    public static void menu() {
        System.out.println("-----------------!!! MENU !!!-----------------");
        System.out.println("1.Add Students :");
        System.out.println("2.Get Marks : ");
        System.out.println("3.Get DATA : ");
        System.out.println("4.Save data : ");
        System.out.println("----------------------------------------------");
        System.out.println("Select Your Choice : ");
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            menu();
            int i = sc.nextInt();
            switch (i) {
                case 1:// ADDING NEW STUDENT
                    System.out.print("Enter  MARKS  : ");
                    String name = sc.next();
                    System.out.print("Enter  Roll : ");
                    int roll = sc.nextInt();

                    // checking the same roll number exist

                    if(Students.containsKey(roll)) {
                        System.out.println("Student with same roll number already exist");
                    }
                    else {
                        Students.put(roll, name);
                        System.out.println("Student added Successfully");
                    }
                    break;

                case 2: // GETTING NAME
                    System.out.print("Enter roll Number of the Student : ");
                    int tempRoll = sc.nextInt();

                    // checking if student exist or not

                    if(Students.containsKey(tempRoll)) {
                        System.out.println("Roll No : "
                                + tempRoll
                                +" Marks : "
                                + Students.get(tempRoll));
                    }
                    else {
                        System.out.println("Student Does Not Exist !!!");
                    }
                    break;

                case 3:
                    try{
                        FileInputStream fis = new FileInputStream("Student.bin");
                        ObjectInputStream ois = new ObjectInputStream(fis);
                        Object obj = ois.readObject();
                        if(obj instanceof HashMap<?,?> ){
                            Students = (HashMap<Integer, String>) obj;
                        }
                        else {
                            throw new Exception();
                        }
                        System.out.println("Data Fetched Successfully !!");
                    }catch (Exception e) {
                        System.out.println("Some Error Occurred while fetching data");
                    }

                    break;

                case 4:
                    try{
                        FileOutputStream fos = new FileOutputStream("Student.bin");
                        ObjectOutputStream oos = new ObjectOutputStream(fos);
                        oos.writeObject(Students);
                        System.out.println("Saved Successfully!!");
                    }catch (IOException e)  {
                        System.out.println("Some Error!! Occurred in Saving");
                    }
                    break;
                default:
                    System.out.println("Wrong Input");
            }
        }

    }
}