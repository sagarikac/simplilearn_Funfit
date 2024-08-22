package com.funfit.service;

import java.util.List;

import com.funfit.model.Participant;
import com.funfit.dao.ParticipantDao;

public class ParticipantService {


	ParticipantDao pd = new ParticipantDao();
		
		public String storeParticipant(Participant participant) {
			 if(pd.storeParticipant(participant)>0) {
				return "participant details stored successfully";
			}else {
				return "participant details didn't store";
			}
		}
		
		public String deleteParticipant(int pid) {
			if(pd.deleteParticipant(pid)>0) {
				return "participant deleted successfully";
			}else {
				return "participant not present";
			}
		}
		
		public String updateParticipant(Participant participant) {
			if(pd.updateParticipant(participant)>0) {
				return "participant updated successfully";
			}else {
				return "participant not present";
			}
		}
		
		public List<Participant> findAllParticipants() {
			return pd.findAllParticipants();
		}
		
	
	
}
