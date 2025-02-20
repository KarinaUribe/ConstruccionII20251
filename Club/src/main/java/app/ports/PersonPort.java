package app.ports;
import app.domain.models.Person;

/**
 *
 * @author USUARIO
 */
public interface PersonPort {
    public boolean existPerson(long document);
    public void savePerson(Person person);
    public Person findByDocument(long document);

}
