package www.hope.springbootmy.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import www.hope.springbootmy.domain.Person;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HelloController {
    @Autowired
    private Person person;
    @RequestMapping("/hello")
    public Map hello() throws JsonProcessingException {
//        ObjectMapper objectMapper = new ObjectMapper();
//        String s = objectMapper.writeValueAsString(dog);
//        return s;
        Map<String,Object> map = new HashMap();
        map.put("name", "张三");
        map.put("age", 14);
        map.put("gender", "男");
        return map;
    }
}
