class Mahasiswa {
    // data member
    String nama = "nama asli";
    String NIM;

    // constructor: method khusus yang akan dipanggil saat object dibuat
    Mahasiswa(String nama, String NIM) {
        // // akan mengambil variabel pada local scope (selalu mengambil prioritas paling tinggi)
        // System.out.println(nama);
        // System.out.println(nama);
        // // refer to (nama) in global class scope
        // System.out.println(this.nama);
        this.nama = nama;
        this.NIM = NIM;
    }

    // method tanpa return dan tanpa parameter
    // keyword: default
    void show() {
        System.out.println("Nama : " + this.nama);
        System.out.println("NIM  : " + this.NIM);
    }

    // method tanpa return dan dengan parameter (setter)
    void setNama(String nama) {
        this.nama = nama;
    }

    // method dengan return dan tanpa paramter (getter/berhubungan dengan encapsulasi)
    String getNama() {
        return this.nama;
    }
    String getNIM() {
        return this.NIM;
    }

    // method dengan return dan dengan parameter
    String sayHi(String message) {
        return message + " juga, nama saya adalah" + this.nama; 
    }
}

public class Main {
    public static void main(String[] args) {
        Mahasiswa mahasiswa1 = new Mahasiswa("ucup", "13305041");
        // method
        mahasiswa1.show();
        mahasiswa1.setNama("Tutung");
        mahasiswa1.show();

        System.out.println(mahasiswa1.getNama());
        System.out.println(mahasiswa1.getNIM());

        String data = mahasiswa1.sayHi("ganteng");
        System.out.println(data);
 
    }
}