package com.cg.bootcamp.healthcare.Services;

import java.util.List;

import com.cg.bootcamp.healthcare.Entities.Diagnostic_Center;

public interface Diagnostic_Center_Services {
	public Diagnostic_Center addCenter(Diagnostic_Center center);
	public List<Diagnostic_Center> showCenters();
	public void removeCenter(String centerID);
	public Diagnostic_Center updateCenter(Diagnostic_Center center);
}
