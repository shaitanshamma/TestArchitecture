package lesson4;

public class Main {
    public static void main(String[] args) {
        StickerCreator simpleSticker = new SimpleSticker("режем по контуру");
        StickerCreator compositeSticker = new CompositeSticker().add(
                new SimpleSticker("печать изображения"),
                new SimpleSticker("ламинация заготовки"),
                new SimpleSticker("резка по контуру"),
                new SimpleSticker("нанесение дополнительного клея"),
                new SimpleSticker("выборка"));
        simpleSticker.create();
        compositeSticker.create();
    }
}
