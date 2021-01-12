package builder.samples;

import lombok.Builder;
import lombok.ToString;

/**
 * User: ubayram
 * Date: 12.01.2021
 * Time: 16:52
 */
@Builder
@ToString
public class Student {
    private Long id;
    private String name;
    private String surname;
    private Integer age;
}
