package cricket.team;

import java.util.*;
import java.util.stream.Collectors;

class Details {

    public int id;
    public String name;
    public int matchesPlayed;
    public int totalRuns;
    public int wicketsTaken;
    public String playerType;


    public Details() {

    }

    public Details(int id, String name, int matchesPlayed, int totalRuns, int wicketsTaken, String playerType) {
        this.id = id;
        this.name = name;
        this.matchesPlayed = matchesPlayed;
        this.totalRuns = totalRuns;
        this.wicketsTaken = wicketsTaken;
        this.playerType = playerType;
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

    public void displayAllPlayers(List<Details> data) {
        Collections.sort(data, new ScoreComparator());
        Iterator<Details> itr = data.iterator();
        System.out.println("Id Name Matches_Played Total_Runs Wickets_Taken Player_Type ");
        while (itr.hasNext()) {
            Details db = itr.next();
            System.out.println(db.getId() + " " + db.getName() + " " + db.getMatchesPlayed() + " " + db.getTotalRuns() + " " + db.getWicketsTaken() + " " + db.getPlayerType());
        }
    }

    public void displayFinalPlayers(List<Details> data) {

        Collections.sort(data, new ScoreComparator());
        ArrayList<Details> final_list = new ArrayList<>(11);
        int count = 0;
        for (Details p : data) {
            if (count == 11) {
                break;
            }
            final_list.add(p);
            count++;
        }
        Collections.sort(final_list, new NameComparator());
        Iterator<Details> itr1 = final_list.iterator();
        System.out.println("Id Name Matches_Played Total_Runs Wickets_Taken Player_Type ");
        while (itr1.hasNext()) {
            Details db = itr1.next();
            System.out.println(db.getId() + " " + db.getName() + " " + db.getMatchesPlayed() + " " + db.getTotalRuns() + " " + db.getWicketsTaken() + " " + db.getPlayerType());
        }
    }

    public void updatePlayerByName(Map<String, Details> info) throws PlayerNotFoundException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Player name to be updated.");
        String playerName = sc.nextLine();


        Details playerDetails = info.get(playerName);
        //System.out.println(player);
        if (playerDetails == null) {
            PlayerNotFoundException pe = new PlayerNotFoundException("Player with same name not found.");
            throw (pe);
        }

        info.remove(playerName);

        System.out.println("Enter updated id of the player.");
        playerDetails.setId(sc.nextInt());
        sc.nextLine();
        System.out.println("Enter the updated player name.");
        playerDetails.setName(sc.nextLine());
        System.out.println("Enter the  updated number of matches played.");
        playerDetails.setMatchesPlayed(sc.nextInt());
        System.out.println("Enter the updated number of runs scored.");
        playerDetails.setTotalRuns(sc.nextInt());
        System.out.println("Enter the updated number of wickets taken.");
        playerDetails.setWicketsTaken(sc.nextInt());
        System.out.println("Enter updated type of player: ");
        playerDetails.setPlayerType(sc.next());
        info.put(playerDetails.getName(), playerDetails);
    }

    public void addPlayers(List<Details> data, int n) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        int bowlersCount = 0;
        int wicketKeeperCount = 0;
        while (true) {

            Details d = new Details();
            System.out.println("Enter player id");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter player name");
            String name = sc.nextLine();
            System.out.println("Enter total runs scored");
            int tot_runs = sc.nextInt();
            System.out.println("Enter matches played");
            int matches = sc.nextInt();
            System.out.println("Enter wickets taken");
            int wickets_taken = sc.nextInt();
            System.out.println("Enter player type");
            String player_type = sc.next().toLowerCase();
            if (player_type.equals("bowler")) {
                bowlersCount++;
            } else if (player_type.equals("wicketkeeper")) {
                wicketKeeperCount++;
            }

            d.setId(id);
            d.setName(name);
            d.setTotalRuns(tot_runs);
            d.setMatchesPlayed(matches);
            d.setWicketsTaken(wickets_taken);
            d.setPlayerType(player_type);

            data.add(d);
            i++;
            if (i == n) {
                if (bowlersCount < 3 || wicketKeeperCount < 1) {
                    if (bowlersCount < 3) {
                        System.out.println("No. of bowlers = " + bowlersCount);
                        System.out.println("bowlers not sufficient,Minimun 3 are required");
                    } else {
                        System.out.println("wicket keepers not suffiecient,Minimum 1 is required");
                        System.out.println("No. of wicketkeepers = " + wicketKeeperCount);
                    }
                    data.clear();
                    i = 0;
                    continue;
                } else {
                    break;
                }
            }

        }

    }
    public void setPlayers(List<Details> data,Map<String,Details> info)
    {

        Details player1 = new Details(1, "Shikhar Dhawan", 5, 250, 7, "Batsman");
        Details player2 = new Details(2, "Virat Kohli", 8, 500, 4, "Batsman");
        Details player3 = new Details(3, "Ravindra Jadeja", 9, 750, 9, "All-Rounder");
        Details player4 = new Details(4, "Mohammed Shami", 5, 20, 10, "Bowler");
        Details player5 = new Details(5, "Manish Pandey", 8, 650, 4, "Bowler");
        Details player6 = new Details(6, "Jasprit Bumrah", 5, 500, 8, "Bowler");
        Details player7 = new Details(19, "Mayank Agarwal", 8, 800, 14, "Batsman");
        Details player8 = new Details(8, "Shreyas Iyer", 25, 900, 4, "Batsman");
        Details player9 = new Details(9, "Yuzvendra Chahal", 5, 700, 14, "Bowler");
        Details player10 = new Details(10, "KL Rahul", 14, 1000, 5, "Wicket-Keeper");
        Details player11 = new Details(11, "Hardik Pandya", 15, 15000, 5, "Batsman");
        Details player12 = new Details(12, "Kuldeep Yadav", 85, 45000, 58, "Bowler");
        Details player13 = new Details(13, "Shardul Thakur", 9, 5400, 54, "Bowler");
        Details player14 = new Details(14, "Navdeep Saini", 14, 500, 40, "Bowler");
        Details player15 = new Details(15, "Shubman Gill", 15, 5400, 10, "Batsman");
        Details player16 = new Details(16, "Ajinkya Rahane", 19, 5400, 5, "Batsman");
        Details player17 = new Details(17, "Ravichandran Ashwin", 15, 560, 25, "Bowler");
        Details player18 = new Details(18, "Umesh Yadav", 15, 568, 24, "Bowler");
        Details player19 = new Details(7, "Dhoni", 51, 5800, 20, "Wicket-Keeper");
        Details player20 = new Details(20, "Hanuma Vihari", 58, 45010, 15, "Batsman");
        data.add(player1);
        data.add(player2);
        data.add(player3);
        data.add(player4);
        data.add(player5);
        data.add(player6);
        data.add(player7);
        data.add(player8);
        data.add(player9);
        data.add(player10);
        data.add(player11);
        data.add(player12);
        data.add(player13);
        data.add(player14);
        data.add(player15);
        data.add(player16);
        data.add(player17);
        data.add(player18);
        data.add(player19);
        data.add(player20);
        info.put(player1.getName(), player1);
        info.put(player2.getName(), player2);
        info.put(player3.getName(), player3);
        info.put(player4.getName(), player4);
        info.put(player5.getName(), player5);
        info.put(player6.getName(), player6);
        info.put(player7.getName(), player7);
        info.put(player8.getName(), player8);
        info.put(player9.getName(), player9);
        info.put(player10.getName(), player10);
        info.put(player11.getName(), player11);
        info.put(player12.getName(), player12);
        info.put(player13.getName(), player13);
        info.put(player14.getName(), player14);
        info.put(player15.getName(), player15);
        info.put(player16.getName(), player16);
        info.put(player17.getName(), player17);
        info.put(player18.getName(), player18);
        info.put(player19.getName(), player19);
        info.put(player20.getName(), player20);
        displayAllPlayers(data);
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
        Scanner sc = new Scanner(System.in);
        List<Details> data = new ArrayList<Details>();
        Map<String, Details> info = new HashMap<>();
        Details details = new Details();
        int i;
        while (true) {
            System.out.println(" 1: Display All The Players \n 2: Update The Player Information By Name \n 3: Display Final Team \n 4: Add players\n 5:Exit");
            System.out.println("Enter your choice : ");
            i = sc.nextInt();
            switch (i) {
                case 1:
                    details.setPlayers(data,info);
                    break;
                case 2:
                    details.updatePlayerByName(info);
                    break;
                case 3:
                    details.displayFinalPlayers(data);
                    break;
                case 4:
                    System.out.println("Enter the number of players you are adding");
                    int j= sc.nextInt();
                    details.addPlayers(data, j);
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }

    }

}

