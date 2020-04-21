package lesson3;

public class Main {
    public static void main(String[] args) {
        Sticker sticker = new Sticker.Builder("KPMF").glueBrand("3M").build();
        Sticker sticker2 = new Sticker.Builder("KPMF")
                .glueBrand("3M")
                .laminationBrand("Kpmf")
                .cutCountour("0.3 mm")
                .build();
        sticker.info();
        sticker2.info();
    }
}
