package app.ports;

import app.domain.models.InvoiceHeader;
import app.domain.models.Partner;
import app.domain.models.Person;
import java.util.List;


/**
 *
 * @author USUARIO
 */
public interface InvoiceHeaderPort {
    private list<InvoiceHeader> getAllInvoices();
    public List<InvoiceHeader> getInvoicesByPartner(Partner partner);
    public List<InvoiceHeader> getInvoicesByPerson(Person person);
    public double getTotalAmountPayed(Partner partner);

}
