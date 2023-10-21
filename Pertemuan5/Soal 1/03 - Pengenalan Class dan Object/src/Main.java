// membuat class sebagai template
class Mahasiswa {
    String nama;
    String NIM;
    String jurusan;
    double IPK;
    int umur;
}

public class Main {
    public static void main(String[] args) throws Exception {
        // instansiasi / membuat object
        Mahasiswa mahasiswa1 = new Mahasiswa();
        mahasiswa1.nama = "ucup";
        mahasiswa1.NIM = "13305041";
        mahasiswa1.jurusan = "teknik perteknikan";
        mahasiswa1.IPK = 4.0;
        mahasiswa1.umur = 17;

        System.out.println(mahasiswa1.nama);
        System.out.println(mahasiswa1.NIM);
        System.out.println(mahasiswa1.jurusan);
        System.out.println(mahasiswa1.IPK);
        System.out.println(mahasiswa1.umur);

        // instansiasi / membuat object
        Mahasiswa mahasiswa2 = new Mahasiswa();
        mahasiswa2.nama = "John";
        mahasiswa2.NIM = "2022071034";
        mahasiswa2.jurusan = "Teknik Informatika";
        mahasiswa2.IPK = 4.0;
        mahasiswa2.umur = 19;

        System.out.println(mahasiswa2.nama);
        System.out.println(mahasiswa2.NIM);
        System.out.println(mahasiswa2.jurusan);
        System.out.println(mahasiswa2.IPK);
        System.out.println(mahasiswa2.umur);
    }
}
