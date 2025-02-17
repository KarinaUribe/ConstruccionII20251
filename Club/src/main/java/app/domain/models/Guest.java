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

}
