package projectcc;

public class Ujian {
    private Soal soal;
    private int noSaatIni;

    public Ujian(char kodeSoal){
        soal = new Soal(kodeSoal);
        noSaatIni = 0;
    }



    //Getter & Setter
    public int getNoSaatIni() {
        return noSaatIni;
    }

    public void setNoSaatIni(int noSaatIni) {
        this.noSaatIni = noSaatIni;
    }

    public Soal getSoal() {
        return soal;
    }

    public void setSoal(Soal soal) {
        this.soal = soal;
    }
}
