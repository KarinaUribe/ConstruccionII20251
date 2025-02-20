
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
    
    public User(long personId, long document, String name, long cellPhone, long userId, String userName,
			String password, String role) {
		super(personId, document, name, cellPhone);
		this.userId = userId;
		this.userName = userName;
		this.password = password;
		this.role = role;
	}
}
