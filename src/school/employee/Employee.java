package employee;

import enums.ContractType;
import enums.Department;
import user.User;

public abstract class Employee extends User {
    private float salary;
    private String qualification;
    private String designation;
    private Department department;
    public boolean isActive;

    public void setEmployeeFields(String name, String id, long contact, String address, float salary, String qualification, String designation, Department department, boolean isActive) {
        this.setName(name);
        this.setId(id);
        this.setContact(contact);
        this.setAddress(address);
        this.setSalary(salary);
        this.setQualification(qualification);
        this.setDesignation(designation);
        this.setDepartment(department);
        this.setActive(isActive);
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }
}
