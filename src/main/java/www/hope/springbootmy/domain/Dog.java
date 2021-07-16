package www.hope.springbootmy.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
@ToString
public class Dog {
    private String name;
    private int age;
}
