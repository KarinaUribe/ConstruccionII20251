package app.ports;

import app.domain.models.Partner;
import app.domain.models.User;

/**
 *
 * @author USUARIO
 */
public interface UserPort {
    public boolean existUserName(String userName);
    public void saveUser(Partner partner);
    public User findByPersonId(long personId);

}
