
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

public class User extends Person{
    private long userId;
    private String userName;
    private String password;
    private String role;
}
