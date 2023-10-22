package com.sunbeam;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		/*	**Add new Candidate**	*/
//		try(CandidateDao cdao=new CandidateDao()){
//			System.out.print("Enter the name:");
//			String name=sc.next();
//			System.out.print("Enter the party:");
//			String party=sc.next();
//			System.out.print("Enter the votes:");
//			int votes=sc.nextInt();
//			int cnt=cdao.saveCandidate(name, party, votes);
//		System.out.println(cnt + " rows inserted");
//		}catch (Exception e) {
//			e.printStackTrace();
//		}
		
		/*	**Update Candidate**	*/
//		try(CandidateDao cdao= new CandidateDao()){
//			System.out.print("Enter the id to be updated:");
//			int id=sc.nextInt();
//			System.out.print("Enter the name:");
//			String name=sc.next();
//			System.out.print("Enter the party:");
//			String party=sc.next();
//			int cnt=cdao.updateCandidate(id, name, party);
//			System.out.println(cnt + " rows updated");
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
		
		/*	**get partywise total votes**	*/
		try(CandidateDao cdao=new CandidateDao()){
			List<PartyVotes> list= cdao.getPartywiseVotes();
			list.forEach(c -> System.out.println(c));
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
