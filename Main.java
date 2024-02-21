//Nama :Abisatya Hastarangga Pradana
//NIM  :24060122120004
//Lab  :C1
    public class Main {
        static double counter;
        public static void main(String[] args){
            Titik t1 = new Titik (5, -9);
            Titik t2 = new Titik();
            Titik t3 = new Titik();
            
            t2.setAbsis(3);
            t2.setOrdinat(4);
            t3.setAbsis(132);
            t3.setOrdinat(5);
            
            System.out.println("t1 (" + t1.getAbsis() + ", " + t1.getOrdinat()+")");
            System.out.println("t2 (" + t2.getAbsis() + ", " + t2.getOrdinat()+")");
            System.out.println("t3 (" + t3.getAbsis() + ", " + t3.getOrdinat()+")");
            System.out.println("Jumlah objek titik yang telah dibuat: " + Titik.getCounterTitik());
            
        }
    }
	
