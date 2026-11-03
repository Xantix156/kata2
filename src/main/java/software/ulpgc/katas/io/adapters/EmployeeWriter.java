package software.ulpgc.katas.io.adapters;

import software.ulpgc.katas.model.Employee;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.List;

public class EmployeeWriter {

    public void write(List<Employee> employees, OutputStream output) throws IOException {
        Writer writer = new OutputStreamWriter(output);
        for (Employee employee : employees) {
            writer.write(employee + System.lineSeparator());
        }
        writer.flush();
    }
}
