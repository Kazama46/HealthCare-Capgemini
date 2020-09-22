package com.cg.bootcamp.healthcare.Services;

import java.util.ArrayList;
import java.util.List;
// TODO Auto-generated method stub
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.bootcamp.healthcare.Entities.Appointment;
import com.cg.bootcamp.healthcare.Entities.Diagnostic_Center;
import com.cg.bootcamp.healthcare.Entities.Test;
import com.cg.bootcamp.healthcare.Repository.Diagnostic_Center_Dao;

@Service
public class Diagnostic_Center_ServicesImpl implements Diagnostic_Center_Services {
	
	@Autowired
	Diagnostic_Center_Dao centerDao;
	
	@Override
	public Diagnostic_Center addCenter(Diagnostic_Center center) {
		//list.add(center);
		centerDao.save(center);
		return center;
	}

	@Override
	public List<Diagnostic_Center> showCenters() {
		// TODO Auto-generated method stub
		
		return centerDao.findAll();
	}

	@Override
	public void  removeCenter(String centerID) {
			//	list = this.list.stream().filter(e -> e.getCenterID() != centerID).collect(Collectors.toList());
		centerDao.deleteById(centerID);
	}

	@Override
	public Diagnostic_Center updateCenter(Diagnostic_Center center) {
		// TODO Auto-generated method stub
//		list.forEach(e ->{
//			if(e.getCenterID() == center.getCenterID())
//			{
//				e.setCenterName(center.getCenterName());
//				e.setListofTests(center.getListofTests());
//				e.setAppointmentList(center.getAppointmentList());
//			}
//		});
//		return null;
		
		
		return centerDao.save(center);
	}

}

