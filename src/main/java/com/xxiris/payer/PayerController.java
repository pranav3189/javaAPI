package com.xxiris.payer;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xxiris.payer.model.Payer;
import com.xxiris.payer.repository.payerRepository;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/Payer")
public class PayerController {

	 @Autowired
	    private payerRepository payerRepository;

	    @GetMapping("/getAllPayer")
	    public List <Payer> getAllEmployees() {
	    	
	        return payerRepository.findAll();
	    }
	   
	    @PostMapping("/savePayer")
	    public Payer createEmployee( @RequestBody Payer payer) {
	    	try {
	    		payer=payerRepository.save(payer);
	    	}
	    	catch(Exception e) {
	    		e.printStackTrace();
	    	}
	    	
	    	return payer;
	    }
	
	    
	    @DeleteMapping("/deletePayer/{id}")
	    public Map < String, Boolean > deleteEmployee(@PathVariable(value = "id") Integer payerId)
	    {
	    	Payer payer=payerRepository.findById(payerId).orElse(null); 
	    	payerRepository.delete(payer);
	        Map < String, Boolean > response = new HashMap < > ();
	        response.put("deleted", Boolean.TRUE);
	        return response;
	    }
	    
	    
	    
	    @PatchMapping("/updatePayer/{id}")
	    public ResponseEntity < Payer > updateEmployee(@PathVariable(value = "id") Integer payerId,
	        @RequestBody Payer payer) {
	    	Payer newPayer=payerRepository.findById(payerId).orElse(null);
	    	newPayer.setBin(payer.getBin());
	    	newPayer.setPcn(payer.getPcn());
	    	newPayer.setpGroup(payer.getpGroup());
	    	newPayer.setRemark(payer.getRemark());
	        Payer  updatedPayer=payerRepository.save(newPayer);
	        return ResponseEntity.ok(updatedPayer);
	    }
	
	
}
