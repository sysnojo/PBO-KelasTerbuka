// class tanpa constructor / class polos
class Polos {
    String dataString;
    int dataInteger;
}

// class dengan constructor
class Mahasiswa {
    String nama;
    String NIM;
    String jurusan;

    Mahasiswa(String inputNama, String inputNIM, String inputJurusan) {
        nama = inputNama;
        NIM = inputNIM;
        jurusan = inputJurusan;

        System.out.println(nama);
        System.out.println(NIM);
        System.out.println(jurusan);
    }
}

public class Main {
    public static void main(String[] args) {
        Mahasiswa mahasiswa1 = new Mahasiswa("John", "2022071034", "Informatika");
        Mahasiswa mahasiswa2 = new Mahasiswa("Franco", "202208333", "Teknik Nuklir");
    }
}
