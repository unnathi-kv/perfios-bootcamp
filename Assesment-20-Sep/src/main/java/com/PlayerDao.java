package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.swing.text.html.HTMLDocument.Iterator;

public class PlayerDao {
	public Statement getStatement() {
        Connection con = null;
        Statement st = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sampledb?autoReconnect=true&useSSL=false", "root", "password");
            st= con.createStatement();
            //return con;

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return st;
    }
	
	 public int savePlayer(PlayerDetails playerDetails) {
         String sql= null;
         try {
             sql = "insert into cricket values(" + playerDetails.getId() + ",'" + playerDetails.getName() + "','" + playerDetails.getMatchesPlayed() +
            		 "','" + playerDetails.getTotalRuns() +"','" + playerDetails.getWicketsTaken() +"','" + playerDetails.getPlayerType() + "')";
             //st = getConnection().createStatement();
             return getStatement().executeUpdate(sql);
         }
         catch (Exception e)
         {
             e.printStackTrace();
             return 0;

         }
         //return st.executeUpdate(sql);
 }
	 public int updatePlayer(PlayerDetails playerDetails) {
         try
         {
             String sql = "update cricket set id = '"+playerDetails.getId()+"',name='"+playerDetails.getName()+"',matchesPlayed='"
         +playerDetails.getMatchesPlayed()+"',totalRuns='"+playerDetails.getTotalRuns()+"',wicketsTaken='"+playerDetails.getWicketsTaken()+
         "',playerType='"+playerDetails.getPlayerType()+"' where id='"+playerDetails.getId()+"'" ;
             return getStatement().executeUpdate(sql);
         }
         catch (Exception e)
         {
             e.printStackTrace();
             return 0;
         }
 } 
	 public List<PlayerDetails> getAllPlayers()
	   {
	       List<PlayerDetails> playerList = new ArrayList<PlayerDetails>();
	      
	       try
	       {
	           String sql= "select * from cricket";
	           ResultSet rs = getStatement().executeQuery(sql);
	           while ((rs.next()))
	           {
	               PlayerDetails playerDetails=new PlayerDetails();
	               playerDetails.setId(rs.getInt(1));
	               playerDetails.setName(rs.getString(2));
	               playerDetails.setMatchesPlayed(rs.getInt(3));
	               playerDetails.setTotalRuns(rs.getInt(4));
	               playerDetails.setWicketsTaken(rs.getInt(5));
	               playerDetails.setPlayerType(rs.getString(6));
	               
	               playerList.add(playerDetails);
	           }
	       }
	       catch (Exception e)
	       {
	           e.printStackTrace();
	       }
	       return playerList;
	   } 
	 public List<PlayerDetails> displayFinalPlayers(List<PlayerDetails> data )
	    {

	        Collections.sort(data,new ScoreComparator());
	        ArrayList<PlayerDetails> final_list = new ArrayList<>(11);
	        int count =0;
	        for(PlayerDetails p:data){
	            if(count==11){
	                break;
	            }
	            final_list.add(p);
	            count++;
	        }
	        Collections.sort(final_list,new NameComparator());
	        return final_list;

	    }
}

