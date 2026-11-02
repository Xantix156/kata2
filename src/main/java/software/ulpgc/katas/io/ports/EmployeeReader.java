package software.ulpgc.katas.io.ports;

import software.ulpgc.katas.model.Employee;

import java.util.List;

public interface EmployeeReader {
    List<Employee> load();
}
