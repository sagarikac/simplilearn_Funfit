package com.funfit.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.funfit.model.Participant;
import com.funfit.resource.DbResource;
public class ParticipantDao {


		public int storeParticipant(Participant participant) {
			try {
				Connection con = DbResource.getDbConnection();
				PreparedStatement pstmt = con.prepareStatement("insert into participant values(?,?,?,?)");
				pstmt.setInt(1, participant.getPid());
				pstmt.setString(2, participant.getPname());
				pstmt.setInt(3, participant.getAge());
				pstmt.setInt(4, participant.getBid());
				return pstmt.executeUpdate();
			} catch (Exception e) {
				System.err.println(e);
				return 0;
			}
		}
		
		public int deleteParticipant(int pid) {
			try {
				Connection con = DbResource.getDbConnection();
				PreparedStatement pstmt = con.prepareStatement("delete from participant where pid = ?");
				pstmt.setInt(1, pid);
				return pstmt.executeUpdate();
			} catch (Exception e) {
				System.err.println(e);
				return 0;
			}
		}
		
		public int updateParticipant(Participant participant) {
			try {
				Connection con = DbResource.getDbConnection();
				PreparedStatement pstmt = con.prepareStatement("update participant set pname=? , age = ? , bid=? where pid=?");
				pstmt.setString(1, participant.getPname());
				pstmt.setInt(2, participant.getAge());
				pstmt.setInt(3, participant.getBid());
				pstmt.setInt(4, participant.getPid());
				return pstmt.executeUpdate();
			} catch (Exception e) {
				System.err.println(e);
				return 0;
			}
		}
		
		public List<Participant> findAllParticipants() {
		List<Participant> listofparticipants = new ArrayList<Participant>();
			try {
				Connection con = DbResource.getDbConnection();
				PreparedStatement pstmt = con.prepareStatement("select * from participant");
				ResultSet rs = pstmt.executeQuery();
				while(rs.next()) {
					Participant p = new Participant();
					p.setPid(rs.getInt(1));
					p.setPname(rs.getString(2));
					p.setAge(rs.getInt(3));
					p.setBid(rs.getInt(4));
					listofparticipants.add(p);
				}
			} catch (Exception e) {
				System.err.println(e);
			}
			return listofparticipants;
		}
		
}
	
	

