class CulpepperObj extends  AnimatedObject {
  private int x;
  private int y; 
  private int textX;
  private int textY;

  public CulpepperObj()
  {
    x = (int)random(width);
    y = (int)random(height);

    textX = 0;
    textY = height;
  }
  public void display()
  {

    fill(random(0, 255), random(0, 255), random(0, 255)); //eye
    ellipse(x, y, 100, 74);
    stroke(0, 0, 0);  
    strokeWeight(5);
    fill(random(0, 255), random(0, 255), random(0, 255));
    ellipse(x, y+1, 60, 45);
    fill(random(0, 255), random(0, 255), random(0, 255));
    ellipse(x, y+2, 15, 10); 

    textSize(5);
    text("FINNA WOKE!!!!", textX+= width/200, textY -= height/200);
  }
  public boolean inTank(int x, int y )
  {
    if (x>=1000 || x<=0)
    {
      return false;
    }
    if (y>=600 || y<=0)
    {
      return false;
    }
    return true;
  }
  public boolean inTankText(int x, int y)
  {
    if (textX>=1000 || textX<=0)
    {
      return false;
    }
    if (textY>=600 || textY<=0)
    {
      return false;
    }
    return true;
  }
  public void move()
  {
    if (inTank(x, y) == true)
    {
      x+=random(1000);
      y+=random(600);
    }
    if (inTank(x, y) == false)
    {
      x=(int)random(width);
      y=(int)random(height);
    }
    if(inTankText(textX,textY) == false)
    {
       textX=0;
       textY=height;
    }
  }

  public int getX()
  {
    return (int)x;
  }

  public int getY()
  {
    return (int)y;
  }
}