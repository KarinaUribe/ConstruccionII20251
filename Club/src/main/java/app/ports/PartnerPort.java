package app.ports;

import app.domain.models.Partner;
import java.util.List;

/**
 *
 * @author USUARIO
 */
public interface PartnerPort {
    private void savePartner(Partner partner);
    
    public Partner findByUserId(long userId);
    public int countVip();
    public List<Partner> getByStatusPending();
    public void updateStatusToRegular();
    public void updateStatus(Partner get);

}
