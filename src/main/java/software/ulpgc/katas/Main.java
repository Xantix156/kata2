package software.ulpgc.katas;

import software.ulpgc.katas.io.adapters.UrlEmployeeReader;
import software.ulpgc.katas.io.adapters.FileEmployeeReader;
import software.ulpgc.katas.io.adapters.EmployeeWriter;
import software.ulpgc.katas.model.Employee;

import java.io.*;
import java.net.URL;
import java.nio.file.Path;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        URL url = new URL("https://raw.githubusercontent.com/sachin365123/CSV-files-for-Data-Science-and-Machine-Learning/refs/heads/main/Employee%20Dataset%20-%20TSV.txt");
        EmployeeWriter writer = new EmployeeWriter();
        List<Employee> employees = new UrlEmployeeReader(url).load();
        writer.write(employees, System.out);

        List<Employee> localEmployees = new FileEmployeeReader(Path.of("employees.tsv")).load();
        try (OutputStream output = new FileOutputStream("employees-output.txt")) {
            writer.write(localEmployees, output);
        }
    }
}
