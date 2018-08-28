void setup()
{
  size(1280,720);
  background(50,205,50);
  noFill();
  drawRect(1,1,1278,718);
  textSize(82);
  fill(255,5,255);
  drawText("This class is finna woke",150,300);
  noFill();
  
}
void drawRect(int x, int y, int sz1, int sz2)
{
  rect (x,y,sz1,sz2);
  if(x<50)
  {
    drawRect(x+7,y+7,sz1-25,sz2-25);
  }

}
void drawText(String lit, int x1,int y1)
{
   text(lit, x1,y1);
   if(y1 < 500)
   {
     
    drawText(lit, x1,y1+25);
   
   }
  
}