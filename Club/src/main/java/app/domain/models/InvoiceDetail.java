
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
    private String description;
}
