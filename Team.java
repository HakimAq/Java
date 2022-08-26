package week3;
import java.util.ArrayList;

public class Team{
    public String name;
    public String establishedDate;
    public ArrayList<Player> players;

    public Team(String name, String establishedDate, ArrayList<Player> players){
        this.name=name;
        this.establishedDate=establishedDate;
        this.players=players;
    }
    public void display(){
        System.out.println("The name of team is "+ name);
        System.out.println("The establishedDate of team is "+ establishedDate);
        for(Player player : players){
            player.display();

        }   
     }




    
}