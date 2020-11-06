package employee;

import enums.ContractType;
import enums.Department;
import enums.UserType;

public class Admin extends Employee {

    public Admin(String name, String id, long contact, String address, float salary, String qualification, String designation, Department department, String subject) {
        setEmployeeFields(name, id, contact, address, salary, qualification, designation, department, true);
    }

    @Override
    public UserType getUserType() {
        return UserType.ADMIN;
    }
}
