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
        
public class Guest extends User{
    private long guestId;
    private boolean status;
    private Partner partner;
    
	public Guest(long personId, long document, String name, long cellPhone, long userId, String userName,
			String password, String role, long guestId, Partner partner, boolean status) {
		super(personId, document, name, cellPhone, userId, userName, password, role);
		this.guestId = guestId;
		this.partner = partner;
		this.status = status;
	}

}
