package strategy.Cenna;

public class ImageStorage {

    public void store(String fileName, ImageCompressor imageCompressor, ImageFilter filter ){
      filter.filter();
        imageCompressor.compress();
    }
}
