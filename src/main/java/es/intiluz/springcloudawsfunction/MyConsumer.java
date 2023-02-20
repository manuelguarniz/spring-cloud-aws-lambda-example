package es.intiluz.springcloudawsfunction;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;

import java.util.function.Consumer;

@Log4j2
@Component
public class MyConsumer implements Consumer<String> {
    @Override
    public void accept(String s) {
       log.info("Retrieved: " + s);
    }
}
