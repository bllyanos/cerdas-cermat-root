package projectcc;

import java.sql.Connection;
import java.sql.DriverManager;

public class Koneksi {
    Connection kon;

    public Koneksi(){
        getKoneksi();
    }

    public Connection getKoneksi(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            kon = DriverManager.getConnection("jdbc:mysql://localhost/cerdas_cermat","root","");
            System.out.println("Koneksi Berhasil");
            return kon;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
