package co.cesarmeneses.dp.creationals.factorymethod;

public class JpegReader implements ImageReader {

    private DecodeImage decodeImage;

    public JpegReader(String image) {
        this.decodeImage = new DecodeImage(image);
    }

    @Override
    public DecodeImage getDecodeImage() {
        return decodeImage;
    }
}
