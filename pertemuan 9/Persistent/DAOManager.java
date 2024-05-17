/*Nama: Abisatya Hastarangga P
 * NIM: 24060122120004
 * TGL: 17-05-2024
 */
public class DAOManager {
    private PersonDAO personDAO;

    public void setPersonDAO(PersonDAO person){
        personDAO = person;
    }
    public PersonDAO getPersonDAO(){
        return personDAO;
    }
}
