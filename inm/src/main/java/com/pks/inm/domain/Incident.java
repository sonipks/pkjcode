package com.pks.inm.domain;

import java.util.Date;
import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;

@RooJavaBean
@RooToString
@RooJpaActiveRecord(finders = { "findIncidentsByResolvedDateIsNull", "findIncidentsByAssignee", "findIncidentsByIncidentIDEquals", "findIncidentsByIncidentIDIsNotNull", "findIncidentsByIncidentIDIsNull", "findIncidentsByIncidentIDLike", "findIncidentsByPriority", "findIncidentsByReportedDateBetween", "findIncidentsByReportedDateEquals", "findIncidentsByReportedDateGreaterThanEquals", "findIncidentsByResolutionIsNull", "findIncidentsByResolutionLike", "findIncidentsByResolvedDateBetween", "findIncidentsByResolvedDateEquals", "findIncidentsByResolvedDateGreaterThanEquals", "findIncidentsByResolvedDateIsNotNull", "findIncidentsByResolvedDateLessThanEquals", "findIncidentsByStatus", "findIncidentsByProduct" })
public class Incident {

    private String incidentID;

    @NotNull
    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(style = "M-")
    private Date reportedDate;

    @NotNull
    private String summary;

    private String detailedDesc;

    private String workDetail;

    @ManyToOne
    private Product product;

    @NotNull
    @ManyToOne
    private Status priority;

    @ManyToOne
    private Status urgency;

    @ManyToOne
    private Status impact;

    @ManyToOne
    private Assignee assignee;

    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(style = "M-")
    private Date resolvedDate;

    private String resolution;

    @Enumerated
    private IncStatus status;
}
