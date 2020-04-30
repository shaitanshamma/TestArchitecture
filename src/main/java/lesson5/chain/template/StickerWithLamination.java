package lesson5.chain.template;

public class StickerWithLamination extends CreateSticker {

    @Override
    void print() {
        System.out.println("Печать изображения");
    }

    @Override
    void lamination() {
        System.out.println("Ламинация по печати");
    }

    @Override
    void cut() {
        System.out.println("Резка по контуру");
    }
}
