package com.cg.bootcamp.healthcare.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.bootcamp.healthcare.Entities.Diagnostic_Center;
import com.cg.bootcamp.healthcare.Services.Diagnostic_Center_Services;

@RestController
public class Diagnostic_Center_Controller {
	
	@Autowired
	Diagnostic_Center_Services centerService;
	
	@PostMapping("/api/DiagnosticCenter/addCenter/")
	public ResponseEntity<HttpStatus> addCenter(@RequestBody Diagnostic_Center center)
	{
		try {
			this.centerService.addCenter(center);
			return new ResponseEntity<>(HttpStatus.OK);
		}
		
		catch(Exception e)
		{
			return new ResponseEntity<>(HttpStatus.METHOD_NOT_ALLOWED);
		}
	}
	
	
	@GetMapping("/api/DiagnosticCenter/showCenter/")
	public List<Diagnostic_Center> showCenters()
	{
		return this.centerService.showCenters();
	}
	
	@PutMapping("/api/DiagnosticCenter/updateCenter")
	public Diagnostic_Center updateCenter(Diagnostic_Center center)
	{
		return this.centerService.updateCenter(center);
	}
	
	@DeleteMapping("/api/DiagnosticCenter/removeCenter/{centerID}")
	public ResponseEntity<HttpStatus> removeCenter(@PathVariable String centerID)
	{
		try {
			this.centerService.removeCenter(centerID);
			return new ResponseEntity<>(HttpStatus.OK);
		}
		
		catch(Exception e)
		{
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}




