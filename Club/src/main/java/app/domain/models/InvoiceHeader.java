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
    private Date createdDate; 
    private double amount;
}

