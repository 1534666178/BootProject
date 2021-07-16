package www.hope.springbootmy.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Email;
import java.util.Date;
import java.util.List;
import java.util.Map;
@Component
@ToString
@Getter
@Setter
@Validated
@ConfigurationProperties(prefix = "person")//告诉springboot将本类中配置的每一个属性的值,映射到这个组件中
//只有这个组件是容器中的组件才能使用,所以要加component注解
public class Person {
    private String name;
    private int age;
    private  String gender;
    private Boolean happy;
    private Date birthday;
    private Map<String,Object> maps;
    private List<Object> lists;
    private Dog dog;
}
