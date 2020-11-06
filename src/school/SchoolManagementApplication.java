import enums.Department;
import enums.UserType;
import user.Student;
import employee.Teacher;

import java.util.Scanner;
import java.util.HashMap;

public class SchoolManagementApplication {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the User Type: 1-Teacher, 2-Student, 3-Support, 4-Admin");

        String userType = scn.nextLine();

        switch (userType) {
            case "1" -> {
                System.out.println(UserType.TEACHER + " name: ");
                String name = scn.nextLine();
                Teacher teacherDetails = new Teacher();
                if (teacherDetails.activeTeachers(name)) {
                    System.out.println(UserType.TEACHER + " ID: ");
                    String id = scn.next();
                    System.out.println(UserType.TEACHER + " Phone: ");
                    long contact = scn.nextLong();
                    System.out.println(UserType.TEACHER + " City: ");
                    String address = scn.next();
                    System.out.println(UserType.TEACHER + " Qualification: ");
                    String qualification = scn.next();
                    System.out.println(UserType.TEACHER + " Designation: ");
                    String designation = scn.next();
                    System.out.println(UserType.TEACHER + " Salary: ");
                    float salary = scn.nextFloat();

                    teacherDetails.TeacherDetails(name, id, contact, address, salary, qualification, designation, Department.ACADEMIC);
                    teacherDetails.specializedSubject(name); //To check what subject that the teacher handles
                    System.out.println(name.toUpperCase() + " " + "Teacher is specialized in" + " " + teacherDetails.getSubject());
                }
            }
            case "2" -> {

                System.out.println("Enter: 1-Report Card, 2-Failed Student");

                int sdtReport = scn.nextInt();

                switch (sdtReport) {
                    case 1 -> {
                        {
                            HashMap<String, Student> map = new HashMap<>();
                            map = init();

                            System.out.println("Student's Report Card:");
                            System.out.println("-----------------------------------------------------");
                            System.out.println("ID" + "      " + "Name" + "      " + "Grade" + "      " + "Section" + "      " + "% of Marks");
                            System.out.println("-----------------------------------------------------");

                            for (String s : map.keySet()) {

                                System.out.println(s + "     " + map.get(s).getName() + "        " + map.get(s).getGrade() + "          " + map.get(s).getSection() + "             " + map.get(s).getPercentage());
                            }
                            System.out.println("-----------------------------------------------------");
                        }

                    }
                    case 2 -> System.out.println("ELSE");
                    default -> System.out.println("You entered incorrect option");
                }

                    /*Map<String, Integer> map = new HashMap<>();
                Map<Student, Integer> studentIntegerMap = new HashMap<>();
                studentIntegerMap.put(student1, 23);
               // studentIntegerMap.put(student2, 54);

                student1.evaluate(30);
                student1.evaluate(90);*/
            }
            case "3" -> System.out.println(UserType.SUPPORT);
            case "4" -> System.out.println(UserType.ADMIN);
            default -> System.out.println("You had entered incorrect option");
        }
    }

    private static HashMap<String, Student> init() {
        HashMap<String, Student> map = new HashMap<>();

        Student s1 = new Student("Ram", "001", 900000, "Rajaji Nagar", 11, "A", 40);
        Student s2 = new Student("Sam", "002", 800000, "Kasturi Nagar", 11, "A", 80);
        Student s3 = new Student("Som", "006", 700000, "Kalyan Nagar", 11, "B", 39);
        Student s4 = new Student("Pam", "004", 500000, "Ram Nagar", 11, "C", 55);
        Student s5 = new Student("Jam", "005", 100000, "Jaya Nagar", 11, "E", 35);
        Student s6 = new Student("Yam", "010", 200000, "Bhima Nagar", 11, "D", 89);
        Student s7 = new Student("Mam", "008", 400000, "Jeevan Nagar", 11, "E", 73);

        map.put(s6.getId(), s6);
        map.put(s1.getId(), s1);
        map.put(s2.getId(), s2);
        map.put(s3.getId(), s3);
        map.put(s5.getId(), s5);
        map.put(s7.getId(), s7);
        map.put(s4.getId(), s4);

        return map;
    }
}
