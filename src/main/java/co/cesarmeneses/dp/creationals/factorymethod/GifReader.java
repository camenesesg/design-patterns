package co.cesarmeneses.dp.creationals.factorymethod;

public class GifReader implements ImageReader {

    private DecodeImage decodeImage;

    public GifReader(String image) {
        this.decodeImage = new DecodeImage(image);
    }

    @Override
    public DecodeImage getDecodeImage() {
        return decodeImage;
    }
}
