package app.domain.models;

import lombok.Setter;
import lombok.Getter;
import lombok.NoArgsConstructor;
/**
 *
 * @author USUARIO
 */
@Setter
@Getter
@NoArgsConstructor

public class Person {
    private long personId;
    private String name;
    private long document;
    private long cellPhone;

}
