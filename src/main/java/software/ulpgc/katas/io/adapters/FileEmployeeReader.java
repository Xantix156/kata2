package software.ulpgc.katas.io.adapters;

import software.ulpgc.katas.io.ports.EmployeeReader;
import software.ulpgc.katas.model.Employee;
import software.ulpgc.katas.model.Gender;

import java.io.*;
import java.nio.file.Path;
import java.util.List;

public class FileEmployeeReader implements EmployeeReader {
    private final Path path;

    public FileEmployeeReader(Path path) {
        this.path = path;
    }


    @Override
    public List<Employee> load() throws IOException {
        try (InputStream input = new FileInputStream(path.toFile());
             BufferedReader reader = new BufferedReader(new InputStreamReader(input))) {

            return reader.lines()
                    .skip(1)
                    .map(line -> employeeFrom(line))
                    .toList();
        }
    }

    private Employee employeeFrom(String line) {
        String[] fields = line.split("\t");
        return new Employee(fields[0], fields[5].isEmpty() ? null : Gender.valueOf(fields[5]));
    }
}
