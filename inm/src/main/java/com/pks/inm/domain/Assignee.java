package com.pks.inm.domain;

import javax.persistence.Enumerated;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;

@RooJavaBean
@RooToString
@RooJpaActiveRecord
public class Assignee {

    @NotNull
    @Size(min = 4, max = 9)
    private String username;

    @NotNull
    @Size(min = 4, max = 20)
    private String password;

    @Enumerated
    private Roles assignedRole;
}
