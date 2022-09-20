package com;

import java.util.Comparator;

class PlayerDetails {
	 public int id;
	    public String name;
	    public int matchesPlayed;
	    public int totalRuns;
	    public int wicketsTaken;
	    public String playerType;


	    public PlayerDetails()
	    {

	    }
	    public PlayerDetails(int id,String name,int matchesPlayed,int totalRuns,int wicketsTaken,String playerType)
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
				 
}
class ScoreComparator implements Comparator<PlayerDetails>
{
	@Override
	public int compare(PlayerDetails o1, PlayerDetails o2) {
		int avg1 = (o1.getTotalRuns()/o1.getMatchesPlayed());
        int avg2=(o2.getTotalRuns()/ o2.getMatchesPlayed());
        return avg2-avg1;
	}
}


class NameComparator implements Comparator<PlayerDetails>
{
    
	@Override
	public int compare(PlayerDetails o1, PlayerDetails o2) {
		 return o1.getName().compareTo(o2.getName());
	}
}
