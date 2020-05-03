package co.cesarmeneses.dp.creationals.factorymethod;

public class FactoryMethodDemo {

    public static void main(String[] args) {
        DecodeImage decodeImage;
        ImageReader reader = null;
        String image = args[0];
        String format = image.substring(image.indexOf('.') + 1, (image.length()));
        if (format.equals("gif")) {
            reader = new GifReader(image);
        }
        if (format.equals("jpeg")) {
            reader = new JpegReader(image);
        }
        assert reader != null;
        decodeImage = reader.getDecodeImage();
        System.out.println(decodeImage);
    }
}
