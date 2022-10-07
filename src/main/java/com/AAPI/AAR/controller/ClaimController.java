package com.AAPI.AAR.controller;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.AAPI.AAR.Model.Claim;
import com.AAPI.AAR.service.ClaimService;



@RestController
@RequestMapping(value="/claims")
public class ClaimController {
	    @Autowired
	    ClaimService claimsService;

	    @GetMapping("")
	    public List<Claim> list() {
	        return claimsService.listAllClaims();
	    }

	    @GetMapping("/{DOCUMENTID}")
	    public ResponseEntity<Claim> get(@PathVariable Integer DOCUMENTID) {
	        try {
	            Claim claim = claimsService.getClaim(DOCUMENTID);
	            return new ResponseEntity<Claim>(claim, HttpStatus.OK);
	        } catch (NoSuchElementException e) {
	            return new ResponseEntity<Claim>(HttpStatus.NOT_FOUND);
	        }
	    }
}
