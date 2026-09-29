public class Bentuk {
    // Encapsulation: atribut private, diakses lewat getter/setter
    private String warna;

    public Bentuk(String warna) {
        this.warna = warna;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public void printInfo() {
        System.out.println("Bentuk berwarna " + warna);
    }
}
