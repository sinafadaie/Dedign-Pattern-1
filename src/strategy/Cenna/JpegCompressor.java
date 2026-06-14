package strategy.Cenna;

public class JpegCompressor implements ImageCompressor{
    @Override
    public void compress() {
        System.out.println("JPEG compressor applied");
    }
}
