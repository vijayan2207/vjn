package employee;

import enums.ContractType;
import enums.Department;
import enums.UserType;

public class Teacher extends Employee {
    private String subject;

    public void TeacherDetails(String name, String id, long contact, String address, float salary, String qualification, String designation, Department department) {
        setEmployeeFields(name, id, contact, address, salary, qualification, designation, department, isActive);
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public UserType getUserType() {
        return UserType.TEACHER;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public boolean activeTeachers(String name)
    {
        if((name.equalsIgnoreCase("Robert")) || (name.equalsIgnoreCase("Utkarsh")) || (name.equalsIgnoreCase("Annie")) || (name.equalsIgnoreCase("Vijay")) || (name.equalsIgnoreCase("Sam")))
        {
            isActive = true;
            System.out.println(name.toUpperCase()+" "+"Teacher is active in our system");
        }
        else
        {
            isActive = false;
            System.out.println(name.toUpperCase()+" "+"Teacher is not active in our system");
        }
        return isActive;
    }

    public void specializedSubject(String name)
    {
        if(this.isActive()) {
            switch (getName().toUpperCase()) {
                case "ROBERT" -> setSubject("Physics");
                case "VIJAY" -> setSubject("Maths");
                case "SAM" -> setSubject("Chemistry");
                case "UTKARSH" -> setSubject("Computer Science");
                default -> {
                    setSubject("no subject");
                }
        }

        }
    }
}

