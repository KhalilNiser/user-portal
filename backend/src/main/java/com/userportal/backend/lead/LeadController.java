package com.userportal.backend.lead;


/**
 * ============================================================
 *                      IMPORTS/DEPENDENCIES
 * ============================================================
 */
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping( "/api/leads" )
// Temporary for dev
@CrossOrigin( origins = "*")
public class LeadController
{

    private final LeadService leadService;


    /**
     * ============================================================
     *                      CONSTRUCTOR
     * ============================================================
     * @param leadService
     */
    public LeadController( LeadService leadService )
    {
        this.leadService = leadService;
    }


    @PostMapping
    public Lead createLead( @RequestBody Lead lead )
    {
        return leadService.saveLead( lead );
    }


    @GetMapping
    public List< Lead > getAllLeads()
    {
        return leadService.getAllLeads();
    }

}
