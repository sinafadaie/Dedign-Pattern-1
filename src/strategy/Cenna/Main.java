package strategy.Cenna;

//we do multiple process
//on single file
public class Main {
    public static void main(String[] args){
        ImageStorage imageStorage = new ImageStorage();
        imageStorage.store("x file", new PngCompressor(), new BWFilter());
        imageStorage.store("x file", new PngCompressor(), new ContrastFilter());
    }
}
