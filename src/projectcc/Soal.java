package projectcc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Soal {
    private String soal[][] = new String[10][2];

    public Soal(){
        ResultSet rs;
        PreparedStatement ps;
        Connection con;
        try{
            con = ProjectCC.kon.getKoneksi();
            String sql = "select * from soal_bs = S, paket_soal = P where(S.no_soal = P.no_soal)";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            int i = 0;
            while(rs.next() && i<10){
                soal[i][0] = rs.getString(2);
                boolean jawaban;
                if(rs.getInt(3) == 0){
                    jawaban = true;
                }else{
                    jawaban = false;
                }
                soal[i][1] = String.valueOf(jawaban);
                i++;
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public String getSoal(int noSoal){
        return soal[noSoal][0];
    }

    public boolean getJawaban(int noSoal){
        return Boolean.parseBoolean(soal[noSoal][1]);
    }

    public String getStringJawaban(int noSoal){
        return soal[noSoal][1];
    }
}
