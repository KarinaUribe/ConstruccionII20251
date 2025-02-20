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
public class InvoiceHeader {
    private long invoiceId;
    private Person person;
    private Partner partner; 
    private boolean status;
    private Date dateCreated; 
    private double amount;
    
    public InvoiceHeader(long invoiceHeaderId, Person person, Partner partner, Date dateCreated, double amount,
			boolean status) {
		super();
		this.invoiceHeaderId = invoiceHeaderId;
		this.person = person;
		this.partner = partner;
		this.dateCreated = dateCreated;
		this.amount = amount;
		this.status = status;
	}
}

