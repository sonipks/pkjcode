// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.pks.inm.domain;

import com.pks.inm.domain.Incident;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Version;

privileged aspect Incident_Roo_Jpa_Entity {
    
    declare @type: Incident: @Entity;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long Incident.id;
    
    @Version
    @Column(name = "version")
    private Integer Incident.version;
    
    public Long Incident.getId() {
        return this.id;
    }
    
    public void Incident.setId(Long id) {
        this.id = id;
    }
    
    public Integer Incident.getVersion() {
        return this.version;
    }
    
    public void Incident.setVersion(Integer version) {
        this.version = version;
    }
    
}
