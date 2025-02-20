
package app.domain.models;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import java.util.Date;

/**
 *
 * @author USUARIO
 */
@Getter
@Setter
@NoArgsConstructor
public class Partner extends User {
    private long partnerId;
    private double funds; 
    private String type;
    private Timestamp dateCreate;
    private double totalAmountPayed;
    
    public Partner(long personId, long document, String name, long cellPhone, long userId, String userName,
			String password, String role, long partnerId, double amount, String type, Timestamp dateCreated) {
		super(personId, document, name, cellPhone, userId, userName, password, role);
		this.partnerId = partnerId;
		this.amount = amount;
		this.type = type;
		this.dateCreated = dateCreated;
	}
}
