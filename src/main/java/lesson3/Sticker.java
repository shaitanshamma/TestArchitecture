package lesson3;

public class Sticker {
    private final String filmBrand;
    private final String cutCountour;
    private final String glueBrand;
    private final String laminationBrand;

    public Sticker(Builder builder) {
        this.filmBrand = builder.filmBrand;
        this.cutCountour = builder.cutCountour;
        this.glueBrand = builder.glueBrand;
        this.laminationBrand = builder.laminationBrand;
    }

    public static class Builder {
        public String filmBrand;
        public String cutCountour = "none";
        public String glueBrand = "none";
        public String laminationBrand = "none";

        public Builder(String filmBrand) {
            this.filmBrand = filmBrand;
        }

        public Builder cutCountour(String name) {
            cutCountour = name;
            return this;
        }

        public Builder glueBrand(String name) {
            glueBrand = name;
            return this;
        }

        public Builder laminationBrand(String name) {
            laminationBrand = name;
            return this;
        }

        public Sticker build() {
            return new Sticker(this);
        }
    }

    public void info() {
        System.out.println("Sticker contains:" + "\n" + "film Brand - " + filmBrand + "\n" +
                "cutCountour - " + cutCountour + "\n" +
                "glueBrand - " + glueBrand + "\n" +
                "laminationBrand - " + laminationBrand);
        System.out.println("********************");
    }
}
