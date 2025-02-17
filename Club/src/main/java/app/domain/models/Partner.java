
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
    private Date dateCreate;
}
