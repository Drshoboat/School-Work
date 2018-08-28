public class GuassianBlurFilter implements Filter
{
    public void filter(PixelImage pi) {
        Pixel[][] data = pi.getData();
         


        for (int col = 0; col < data[0].length; col++) {
            for (int row = 0; row < data.length; row++) {
            int red1 = data[row][col]*4;
            int blue1 = data[row][col]*4;
            int green1 = data[row][col]*4;
            
            int red2 = data[row][col+1]*2;
            int blue2 = data[row][col+1]*2;
            int green2 = data[row][col+1]*2;
            
            int red3 = data[row][col-1]*2;
            int blue3 = data[row][col-1]*2;
            int green3 = data[row][col-1]*2;
            
            int red4 = data[row-1][col]*2;
            int blue4 = data[row-1][col]*2; 
            int green4 = data[row-1][col]*2;
            
            int red5 = data[row+1][col]*2; 
            int blue5 = data[row+1][col]*2;
            int green5 = data[row+1][col]*2;
               


            }
        }

        pi.setData(data);
    }
}
