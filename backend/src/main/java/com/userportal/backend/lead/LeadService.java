package com.userportal.backend.lead;


import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class LeadService
{
    private final LeadRepository leadRepository;

    public LeadService( LeadRepository leadRepository )
    {
        this.leadRepository = leadRepository;
    }


    public Lead saveLead( Lead lead )
    {
        return leadRepository.save( lead );
    }


    public List< Lead > getAllLeads()
    {
        return leadRepository.findAll();
    }

}
