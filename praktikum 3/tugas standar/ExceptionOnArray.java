//Nama :  Abisatya Hastarangga Pradana
//NIM  : 24060122120004
//Tgl  : 6 Mar 2024
//Membuat ExceptionOnArray
public class ExceptionOnArray {
    public static void main(String[] args) {
        Integer[] arrayInteger = new Integer[4];
        try{
            arrayInteger[2] = 11;
            arrayInteger[4] = 10;
        }catch(ArrayIndexOutOfBoundsException exception){
            exception.printStackTrace();
        }finally{
            System.out.println("clean up code ...");
        }
    }
}
