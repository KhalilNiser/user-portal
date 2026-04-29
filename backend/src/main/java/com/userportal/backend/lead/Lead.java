package com.userportal.backend.lead;


import jakarta.persistence.*;
import java.time.LocalDateTime;


@Entity
@Table( name = "leads" )
public class Lead
{
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private Long id;

    private String name;
    private String email;
    private String phone;
    private String projectType;

    @Column( length = 2000 )
    private String message;

    private LocalDateTime createdAt;


    /**
     * ============================================================
     *                      NO_ARGUMENTS_CONSTRUCTOR
     * ============================================================
     */
    public Lead()
    {

    }


    /**
     * ============================================================
     *                          CONSTRUCTOR
     * ============================================================
     * @param id
     * @param name
     * @param email
     * @param phone
     * @param projectType
     * @param message
     * @param createdAt
     * ============================================================
     */
    public Lead( Long id, String name, String email, String phone,
        String projectType, String message, LocalDateTime createdAt )
    {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.projectType = projectType;
        this.message = message;
        this.createdAt = createdAt;
    }

    @PrePersist
    protected void onCreate()
    {
        this.createdAt = LocalDateTime.now();
    }


    /**
     * ============================================================
     *                  GETTERS/SETTERS
     * ============================================================
     */

    //                      GETTERS
    /**
     *
     * @return
     */
    public Long getId()
    {
        return id;
    }

    /**
     *
     * @return
     */
    public String getName()
    {
        return name;
    }

    /**
     *
     * @return
     */
    public String getEmail()
    {
        return email;
    }

    public String getPhone()
    {
        return phone;
    }

    /**
     *
     * @return
     */
    public String getProjectType()
    {
        return projectType;
    }

    /**
     *
     * @return
     */
    public String getMessage()
    {
        return message;
    }

    /**
     *
     * @return
     */
    public LocalDateTime getCreatedAt()
    {
        return createdAt;
    }


    //                  SETTERS
    /**
     *
     * @param id
     */
    public void setId( Long id )
    {
        this.id = id;
    }

    /**
     *
     * @param name
     */
    public void setName( String name )
    {
        this.name = name;
    }

    /**
     *
     * @param email
     */
    public void setEmail( String email )
    {
        this.email = email;
    }

    /**
     *
     * @param phone
     */
    public void setPhone( String phone )
    {
        this.phone = phone;
    }

    /**
     *
     * @param projectType
     */
    public void setProjectType( String projectType )
    {
        this.projectType = projectType;
    }

    /**
     *
     * @param message
     */
    public void setMessage( String message )
    {
        this.message = message;
    }

    /**
     *
     * @param createdAt
     */
    public void setCreatedAt( LocalDateTime createdAt )
    {
        this.createdAt = createdAt;
    }

}
