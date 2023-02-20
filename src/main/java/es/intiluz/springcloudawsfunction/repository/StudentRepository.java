package es.intiluz.springcloudawsfunction.repository;

import es.intiluz.springcloudawsfunction.entity.Student;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
public class StudentRepository {
    public List<Student> studentList() {
        return Arrays.asList(
                new Student(1, "Manuel", 27),
                new Student(2, "Elmer", 26),
                new Student(3, "Esteban", 25)
        );
    }
}
