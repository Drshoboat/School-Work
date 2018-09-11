public class GrayScaleFilter implements Filter
{
    public void filter(PixelImage pi) {
        Pixel[][] data = pi.getData();
        
        for (int col = 0; col < data[0].length; col++) {
            for (int row = 0; row < data.length; row++) {
               int grey = data[row][col].getRed()+ data[row][col].getGreen()+ data[row][col].getBlue();
               int average = grey/3;
               data[row][col].setRed(average);
               data[row][col].setGreen(average);
               data[row][col].setBlue(average);
               
               
               
                 
            }
        }

        pi.setData(data);
    }
}
