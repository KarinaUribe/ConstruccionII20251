
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

public class InvoiceDetail {
    private long invoiceDetailId;
    private InvoiceHeader invoiceheader;
    private double amount;
    private int item;
    private String description;
    
    public InvoiceDetail(long invoiceDetailId, InvoiceHeader inoviceHeader, int item, String description,
			double amount) {
		super();
		this.invoiceDetailId = invoiceDetailId;
		this.inoviceHeader = inoviceHeader;
		this.item = item;
		this.description = description;
		this.amount = amount;
	}
}
