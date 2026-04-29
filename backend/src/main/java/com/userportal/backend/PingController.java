package com.userportal.backend;


/**
 * =================================================================
 *                      IMPORT/DEPENDENCIES
 * -----------------------------------------------------------------
 * @author Khalil A. Niser
 * @project userportal
 * @created 2026/04/27
 * =================================================================
 */
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PingController
{

    @GetMapping( "/api/secure/ping" )
    public String ping()
    {
        return "Backend is alive!";
    }
}
