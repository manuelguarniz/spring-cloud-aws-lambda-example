package es.intiluz.springcloudawsfunction;

import es.intiluz.springcloudawsfunction.entity.Student;
import es.intiluz.springcloudawsfunction.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

@SpringBootApplication
public class SpringCloudAwsFunctionApplication {

    @Autowired
    private StudentRepository studentRepository;

    @Bean
    public Supplier<List<Student>> students() {
        return () -> studentRepository.studentList();
    }

    @Bean
    public Function<String, List<Student>> findByName() {
        return (input) -> studentRepository.studentList()
                .stream()
                .filter(e -> e.getName().equals(input)).collect(Collectors.toList());
    }

    @Bean
    public MyConsumer myConsumerBean() {
        return new MyConsumer();
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudAwsFunctionApplication.class, args);
    }

}
