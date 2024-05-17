/*Nama: Abisatya Hastarangga P
 * NIM: 24060122120004
 * TGL: 17-05-2024
 */
import java.io.*;
class Person implements Serializable{
    private String name;
    public Person(String n){
        name = n;
    }
    public String getName(){
        return name;
    }
}
public class SerializePerson {
    public static void main(String[] args) {
        Person person = new Person("Panji");
    try {
        FileOutputStream f= new FileOutputStream("person.ser");
        ObjectOutputStream s= new ObjectOutputStream(f);
        s.writeObject(person);
        System.out.println("selesai menulis objek person");
        s.close();
    } catch (IOException e) {
        e.printStackTrace();
    }}
}
