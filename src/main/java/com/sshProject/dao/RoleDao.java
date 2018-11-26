package com.sshProject.dao;
import com.sshProject.entity.Employee;
import java.util.ArrayList;
public interface RoleDao {
    boolean addMoudle(int employeeIndex,int moudleIndex);

    boolean removeMoudle(int userId,String oldVal,String newVal);

    boolean addEmployee(Employee employee);

    boolean deleteEmployee(int employeeIndex);

    ArrayList<Employee> getEmployee();
}
