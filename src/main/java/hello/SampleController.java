package hello;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by wrokita on 18/06/2017.
 */
@RestController
public class SampleController {

    @RequestMapping("/hello")
    public String index() {
        List<String> names = new ArrayList();
        names.add("Waldek123");
        names.add("Stefan");
        names.add("Zbigniew");
        names.add("Piotr");

        Collections.sort(names,(n1, n2) -> n2.compareTo(n1));
        StringBuilder allNames = new StringBuilder();
        names.stream().forEach((item) -> allNames.append(item));

        return allNames.toString();
    }

}
