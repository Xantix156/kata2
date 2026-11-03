package software.ulpgc.katas;

import software.ulpgc.katas.io.adapters.FileEmployeeReader;
import software.ulpgc.katas.io.adapters.UrlEmployeeReader;
import software.ulpgc.katas.model.Employee;

import java.io.IOException;
import java.net.URL;
import java.nio.file.Path;
import java.util.List;

public class Main {

    static void main() throws IOException {

        URL url = new URL("https://raw.githubusercontent.com/sachin365123/CSV-files-for-Data-Science-and-Machine-Learning/refs/heads/main/Employee%20Dataset%20-%20TSV.txt");

        List<Employee> employees = new UrlEmployeeReader(url).load();
        for (Employee employee : employees) {
            System.out.println(employee);
        }

    }

}
