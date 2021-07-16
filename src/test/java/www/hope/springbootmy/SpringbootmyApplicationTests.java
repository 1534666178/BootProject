package www.hope.springbootmy;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import www.hope.springbootmy.domain.Dog;
import www.hope.springbootmy.domain.Person;

@SpringBootTest
class SpringbootmyApplicationTests {
    @Autowired
    private Dog dog;

    @Autowired
    private Person person;

    @Test
    void contextLoads() throws JsonProcessingException {

        System.out.println(person);
    }

}
