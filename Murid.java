public class Murid {
        public static void main(String[] args) {
            System.out.println("Data Murid");
            Murid smk = new Murid();
            smk.tampilkanInfo();
            System.out.println("Usia Murid: " + smk.Usia(2007));
        }
    
        public void tampilkanInfo() {
            String nama="Gerrald"; 
            String jurusan="Informatika";
            System.out.println("Nama Murid: " + nama);
            System.out.println("Jurusan: " + jurusan);
        }
    
        public int Usia(int tahunLahir) {
            int usia=2024-tahunLahir;
            return usia;
        }
    }
    

