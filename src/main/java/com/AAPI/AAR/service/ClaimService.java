package com.AAPI.AAR.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.AAPI.AAR.Model.Claim;
import com.AAPI.AAR.repository.ClaimRepository;

import java.util.List;

@Service
@Transactional
public class ClaimService {

    @Autowired
    private ClaimRepository claimRepository;
    public List<Claim> listAllClaims() {
        return claimRepository.findAll();
    }

    public Claim getClaim(Integer DOCUMENTID) {
        return claimRepository.findById(DOCUMENTID).get();
    }

}
