public class Tester
{
    public static void main(String[] args)
    {
        Player Sakib = new Player();
        Player Tamim = new Player();
        Tamim.hit_four();
        Tamim.hit_four();
        Sakib.hit_six();
        System.out.println("Sakib's run: " + Sakib.run);
         System.out.println("Tamim's run: " + Tamim.run);
          System.out.println("Team run: " + Tamim.teamrun);
           System.out.println("Team run: " + Sakib.teamrun);
           
           //here when we are calling teamrun from the individual objects its passing the value from their own boundary
           //every time an object is created teamrun here will be resetted to zero
           //in that way we cannnot receive the overall teamrun.
           //For this type of case, we are introduced with static variable 
           
            System.out.println("Team run: " + Player.teamrun);     
            






    }

}