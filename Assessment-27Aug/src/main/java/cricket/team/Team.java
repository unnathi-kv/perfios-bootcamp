package cricket.team;

import java.util.*;
import java.util.stream.Collectors;

class Details
{

    public int id;
    public String name;
    public int matchesPlayed;
    public int totalRuns;
    public int wicketsTaken;
    public String playerType;


    public Details()
    {

    }
    public Details(int id,String name,int matchesPlayed,int totalRuns,int wicketsTaken,String playerType)
    {
        this.id=id;
        this.name= name;
        this.matchesPlayed=matchesPlayed;
        this.totalRuns=totalRuns;
        this.wicketsTaken=wicketsTaken;
        this.playerType=playerType;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getMatchesPlayed() {
        return matchesPlayed;
    }

    public int getTotalRuns() {
        return totalRuns;
    }

    public int getWicketsTaken() {
        return wicketsTaken;
    }

    public String getPlayerType() {
        return playerType;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPlayerType(String playerType) {
        this.playerType = playerType;
    }

    public void setMatchesPlayed(int matchesPlayed) {
        this.matchesPlayed = matchesPlayed;
    }

    public void setTotalRuns(int totalRuns) {
        this.totalRuns = totalRuns;
    }

    public void setWicketsTaken(int wicketsTaken) {
        this.wicketsTaken = wicketsTaken;
    }
    public void displayAllPlayers(List<Details> data)
    {
        Collections.sort(data,new ScoreComparator());
        Iterator<Details> itr = data.iterator();
        System.out.println("Id Name Matches_Played Total_Runs Wickets_Taken Player_Type ");
        while(itr.hasNext())
        {
            Details db = itr.next();
            System.out.println(db.getId()+" "+db.getName()+" "+db.getMatchesPlayed()+" "+db.getTotalRuns()+" "+db.getWicketsTaken()+" "+db.getPlayerType());
        }
    }
    public void displayFinalPlayers(List<Details> data )
    {

        Collections.sort(data,new ScoreComparator());
        ArrayList<Details> final_list = new ArrayList<>(11);
        int count =0;
        for(Details p:data){
            if(count==11){
                break;
            }
            final_list.add(p);
            count++;
        }
        Collections.sort(final_list,new NameComparator());
        Iterator<Details> itr1 = final_list.iterator();
        System.out.println("Id Name Matches_Played Total_Runs Wickets_Taken Player_Type ");
        while(itr1.hasNext())
        {
            Details db = itr1.next();
            System.out.println(db.getId()+" "+db.getName()+" "+db.getMatchesPlayed()+" "+db.getTotalRuns()+" "+db.getWicketsTaken()+" "+db.getPlayerType());
        }
    }
    public void updatePlayerByName(Map<String,Details> info) throws PlayerNotFoundException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Player name to be updated.");
        String playerName = sc.nextLine();


        Details player = info.get(playerName);
        if(player == null){
            PlayerNotFoundException pe = new PlayerNotFoundException("Player with same name not found.");
            throw (pe);
        }

        info.remove(playerName);

        System.out.println("Enter updated id of the player.");
        player.setId(sc.nextInt());
        sc.nextLine();
        System.out.println("Enter the updated player name.");
        player.setName(sc.nextLine());
        System.out.println("Enter the  updated number of matches played.");
        player.setMatchesPlayed(sc.nextInt());
        System.out.println("Enter the updated number of runs scored.");
        player.setTotalRuns(sc.nextInt());
        System.out.println("Enter the updated number of wickets taken.");
        player.setWicketsTaken(sc.nextInt());
        System.out.println("Enter updated type of player-  1: Bowler , 2: Batsman , 3:Wicket-Keeper , 4: All-Rounder");
        switch (sc.nextInt()){
            case 1:
                player.setPlayerType("Bowler");
                break;
            case 2:
                player.setPlayerType("Batsman");
                break;
            case 3:
                player.setPlayerType("Wicket-Keeper");
                break;
            case 4:
                player.setPlayerType("All-Rounder");
                break;
            default:
                System.out.println("Player is set as batsman.");
                player.setPlayerType("Batsman");
                break;
        }

        info.put(player.getName(),player);
    }



}
class ScoreComparator implements Comparator<Details>
{
    @Override
    public int compare(Details details, Details t1) {
        int avg1 = (details.getTotalRuns()/details.getMatchesPlayed());
        int avg2=(t1.getTotalRuns()/ t1.getMatchesPlayed());
        return avg2-avg1;
    }
}


class NameComparator implements Comparator<Details>//to compare strings write new classes which implements Comparator interface.
{
    @Override
    public int compare(Details info, Details t1) {
        return info.getName().compareTo(t1.getName());
    }
}


public class Team {

    public static void main(String[] args) throws PlayerNotFoundException {
        Scanner sc= new Scanner(System.in);
        List<Details> data = new ArrayList<Details>();
        Map<String,Details> info = new HashMap<>();
        Details details = new Details();
        Details player1 = new Details(1,"Shikhar Dhawan",5,250,7,"Batsman");
        Details player2 = new Details(2,"Virat Kohli",8,500,4,"Batsman");
        Details player3 = new Details(3,"Ravindra Jadeja",9,750,9,"All-Rounder");
        Details player4 = new Details(4,"Mohammed Shami",5,20,10,"Bowler");
        Details player5 = new Details(5,"Manish Pandey",8,650,4,"Bowler");
        data.add(player1);
        data.add(player2);
        data.add(player3);
        data.add(player4);
        data.add(player5);
        info.put(player1.getName(),player1);
        info.put(player2.getName(),player2);
        info.put(player3.getName(),player3);
        info.put(player4.getName(),player4);
        info.put(player5.getName(),player5);
        int i;
        while(true){
            System.out.println(" 1: Display All The Players \n 2: Update The Player Information By Name \n 3: Display Final Team \n 4: Exit");
            System.out.println("Enter your choice : ");
            i= sc.nextInt();
            switch (i){
                case 1:
                    details.displayAllPlayers(data);
                    break;
                case 2:
                    details.updatePlayerByName(info);
                    break;
                case 3:
                    details.displayFinalPlayers(data);
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }

    }



}
