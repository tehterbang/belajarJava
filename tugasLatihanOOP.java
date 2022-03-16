class pangan{
    //data
    String makanan;
    String minuman;

    pangan(String food, String beverages){
        makanan = food;
        minuman = beverages;
    }

    void show(){
        System.out.println("makanannya: " + makanan);
        System.out.println("minumannya: " + minuman);
    }

    void setNamamakanan(String food, String beverages){
        makanan = food;
        minuman = beverages;
    }

    String getMakanan(){
        return makanan;
    }
    String getMinuman(){
        return minuman;
    }

    String tanya(String makanapa){
        return makanapa + "pake makanan ini " + makanan;
    }
}

public class tugasLatihanOOP {
    public static void main(String[] args) {
        pangan menu1 = new pangan("mie goreng", "es teh");
        pangan menu3 = new pangan("nasi goreng", "teh anget");
        menu1.show();
        menu3.show();
        System.out.println(menu3.getMinuman());
        System.out.println(menu1.getMakanan());
        String katakata = menu3.tanya("Hari ini makannya ");
        System.out.println(katakata);
    }
}
