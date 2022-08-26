package week3;

import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {
        ArrayList<String> skills = new ArrayList<String>();
        skills.add("Fouler");
        skills.add("Fantastic Keeper");
        Player playerone = new Player("Amir Shrestha", 25, 150, 89, "Goal Keeper", skills, 3200);
    
        skills.clear();
        skills.add("Poacher");
        Player ashish = new Player("Ashish Podel", 29, 150, 89, "Defender", skills, 3500);
    
        skills.clear();
        skills.add("Finisher");
        skills.add("Dribbling");
        Player Ronaldo = new Player("Cristino Rolando", 37, 185, 75, "Forward", skills, 5000);
    
        ArrayList<Player> players=new ArrayList<Player>();
        players.add(playerone);
        players.add(ashish);
        players.add(Ronaldo);

        Team team= new Team("Real Madrid", "1887", players);
        team.display();

        skills.clear();
        skills.add("Header");
        skills.add("Finisher");
        Player rathford = new Player("Rathford", 28, 170, 77, "Left Winger", skills, 350000);
        
        skills.clear();
        skills.add("clear");
        skills.add("Tackles");
        Player Varana= new Player("Varana", 30, 184, 77, "Defender", skills, 600000);
        
        ArrayList<Player> playerteam=new ArrayList<Player>();
        playerteam.add(rathford);
        playerteam.add(Varana);

        Team united = new Team("Manchester United", "1997", playerteam);
        united.display();
    }
}