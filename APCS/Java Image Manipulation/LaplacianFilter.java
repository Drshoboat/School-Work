public class LaplacianFilter implements Filter
{
    public void filter(PixelImage pi) {
        Pixel[][] data = pi.getData();

        for (int col = 0; col < data[0].length; col++) {
            for (int row = 0; row < data.length; row++) {



            }
        }

        pi.setData(data);
    }
}