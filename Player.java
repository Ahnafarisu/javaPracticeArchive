public class Player
{
  public int run = 0; 
  public static int teamrun = 0; 
  //static- universal variable 
  //it doesnt belong to any object


  public void hit_four(){
    run = run + 4;
    teamrun = teamrun + 4;
  }

  public void hit_six(){
    run = run + 6;
    teamrun = teamrun + 6;
  }



}