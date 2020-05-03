package co.cesarmeneses.dp.creationals.factorymethod;

public class DecodeImage {

    private String image;

    public DecodeImage(String image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return image + ": is decoded";
    }
}
