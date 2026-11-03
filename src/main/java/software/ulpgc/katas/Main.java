package software.ulpgc.katas;

import software.ulpgc.katas.io.adapters.FileEmployeeReader;
import software.ulpgc.katas.model.Employee;

import java.io.IOException;
import java.nio.file.Path;
import java.util.List;

public class Main {

    static void main() throws IOException {

        List<Employee> employees = new FileEmployeeReader(Path.of("employees.tsv")).load();
        for (Employee employee : employees) {
            System.out.println(employee);
        }

    }

}
