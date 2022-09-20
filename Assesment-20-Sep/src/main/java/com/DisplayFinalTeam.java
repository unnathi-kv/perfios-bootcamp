package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/DisplayFinalTeam")
public class DisplayFinalTeam extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");	
		 PrintWriter out = response.getWriter();
		 PlayerDao playerDao = new PlayerDao();
			List<PlayerDetails> list = playerDao.getAllPlayers();
			List<PlayerDetails> finalList=playerDao.displayFinalPlayers(list);
			  out.println("""
		        		<style type="text/css">
		        		   body
		        		{ font-family: 'poppins', sans-serif;
		        		font-size: .84em;
		        		color: #ad7fa8;
		        		line-height: 1.4em;
		        		background: #222222;
		        		width: 900px;
		        		margin: 10px auto 0px auto;}
		        		    
							table {
								background: white;
							}
							
							th, td {
								padding: 12px;
								text-align: center;
							}
							
							.nc {
								text-align: left;
							}
						</style>
		        		""");
		        
		        out.println("<header>");
		        out.println("<h2>Player List</h2>"); 
		        out.println("</header>");
		          
		        out.print("<table border='1' width='100%'");  
		        out.print("<tr><th>Sl No.</th><th>ID</th><th>Name</th><th>Matches Played</th><th>Total Runs Scored</th>"
		        		+ "<th>Wickets Taken</th><th>Player Type</th>"
		        		+ "</tr>");  
		        int slno = 1;
		        for(PlayerDetails p : finalList){  
		        	out.print("<tr><td>" + (slno++) + "</td><td>"+p.getId()+"</td><td class='nc'>"+p.getName()+"</td><td>"+p.getMatchesPlayed()+
		        	"</td><td>"+p.getTotalRuns()+"</td><td>"+p.getWicketsTaken()+"</td><td class='nc'>"+p.getPlayerType()+"</td></tr>");  
		        }  
		        out.print("</table>");  
		          
		        out.close();  
	}

}
