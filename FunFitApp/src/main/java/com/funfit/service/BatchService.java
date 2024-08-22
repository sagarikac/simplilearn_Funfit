package com.funfit.service;

import java.util.List;

import com.funfit.model.Batch;
import com.funfit.dao.BatchDao;

public class BatchService {

	BatchDao bd = new BatchDao();
		
		public String storeBatch(Batch batch) {
			 if(bd.storeBatch(batch)>0) {
				return "batch details stored successfully";
			}else {
				return "batch details didn't store";
			}
		}
		
		public String deleteBatch(int bid) {
			if(bd.deleteBatch(bid)>0) {
				return "batch deleted successfully";
			}else {
				return "batch not present";
			}
		}
		
		public String updateBatch(Batch batch) {
			if(bd.updateBatch(batch)>0) {
				return "batch updated successfully";
			}else {
				return "batch not present";
			}
		}
		
		public List<Batch> findAllBatches() {
			return bd.findAllBatches();
		}
		
		
	
}
