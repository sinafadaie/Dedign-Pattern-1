package strategy;



public class ImageStorage  {
    private String compressor;
    private String filter;

    public ImageStorage(String filter, String compressor) {
        this.filter = filter;
        this.compressor = compressor;
    }
    public void store(String fileName){
        if (compressor == "jpeg"){
            System.out.println("use jpeg algorithm to compress");   //simulate calling method
        } else if (compressor == "png") {
            System.out.println("use png algorithm to compress");
        }

        if (filter == "B&W"){
            System.out.println("Applying B&W filter");
        } else if (filter == "high-contrast") {
            System.out.println("Applying high contrast filter");
        }
    }
}
