package lesson5.chain.template;

public class Main {
    public static void main(String[] args) {
        CreateSticker sticker1 = new SimpleSticker();
        CreateSticker sticker2 = new StickerWithLamination();
        sticker1.create();
        System.out.println("--------");
        sticker2.create();

    }
}
