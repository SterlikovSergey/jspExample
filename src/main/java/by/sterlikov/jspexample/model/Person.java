package by.sterlikov.jspexample.model;

import lombok.AllArgsConstructor;
import lombok.Data;


/*<dependency>
<groupId>org.projectlombok</groupId>
<artifactId>lombok</artifactId>
<version>1.18.28</version>
<scope>provided</scope>
</dependency> для @AllArgsConstructor
                    @Data

 */
@AllArgsConstructor
@Data

public class Person {
    private String name;
    private int age;


}
