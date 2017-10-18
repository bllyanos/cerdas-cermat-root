/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectcc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author ASUS-PC
 */
public class ProjectCC {

    public static Koneksi kon = new Koneksi();

    public static void main(String[] args) {
        ResultSet rs;
        PreparedStatement ps;
        Connection con;
        try{
            con = kon.getKoneksi();
            String sql = "select * from soal_bs = S, paket_soal = P where(S.no_soal = P.no_soal)";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                System.out.printf("%s ",rs.getString(2));
                boolean jawaban;
                if(rs.getInt(3) == 0){
                    jawaban = true;
                }else{
                    jawaban = false;
                }
                System.out.printf(": %b \n",jawaban);
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }
    
}
