public class Kingpin extends AbstractGamePiece
{
   public Kingpin()
   {
      super("Kingpin","K",0);
   
   }
   public boolean hasEscaped()
   {
      return true;
   
   }
   public boolean isCaptured(GameBoard gameBoard)
   {
      return true;
      
   }

}