// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.pks.inm.web;

import com.pks.inm.domain.Assignee;
import com.pks.inm.domain.Incident;
import com.pks.inm.domain.Product;
import com.pks.inm.domain.Status;
import com.pks.inm.web.ApplicationConversionServiceFactoryBean;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.core.convert.converter.Converter;
import org.springframework.format.FormatterRegistry;

privileged aspect ApplicationConversionServiceFactoryBean_Roo_ConversionService {
    
    declare @type: ApplicationConversionServiceFactoryBean: @Configurable;
    
    public Converter<Assignee, String> ApplicationConversionServiceFactoryBean.getAssigneeToStringConverter() {
        return new org.springframework.core.convert.converter.Converter<com.pks.inm.domain.Assignee, java.lang.String>() {
            public String convert(Assignee assignee) {
                return new StringBuilder().append(assignee.getUsername()).append(' ').append(assignee.getPassword()).toString();
            }
        };
    }
    
    public Converter<Long, Assignee> ApplicationConversionServiceFactoryBean.getIdToAssigneeConverter() {
        return new org.springframework.core.convert.converter.Converter<java.lang.Long, com.pks.inm.domain.Assignee>() {
            public com.pks.inm.domain.Assignee convert(java.lang.Long id) {
                return Assignee.findAssignee(id);
            }
        };
    }
    
    public Converter<String, Assignee> ApplicationConversionServiceFactoryBean.getStringToAssigneeConverter() {
        return new org.springframework.core.convert.converter.Converter<java.lang.String, com.pks.inm.domain.Assignee>() {
            public com.pks.inm.domain.Assignee convert(String id) {
                return getObject().convert(getObject().convert(id, Long.class), Assignee.class);
            }
        };
    }
    
    public Converter<Incident, String> ApplicationConversionServiceFactoryBean.getIncidentToStringConverter() {
        return new org.springframework.core.convert.converter.Converter<com.pks.inm.domain.Incident, java.lang.String>() {
            public String convert(Incident incident) {
                return new StringBuilder().append(incident.getIncidentID()).append(' ').append(incident.getReportedDate()).append(' ').append(incident.getSummary()).append(' ').append(incident.getDetailedDesc()).toString();
            }
        };
    }
    
    public Converter<Long, Incident> ApplicationConversionServiceFactoryBean.getIdToIncidentConverter() {
        return new org.springframework.core.convert.converter.Converter<java.lang.Long, com.pks.inm.domain.Incident>() {
            public com.pks.inm.domain.Incident convert(java.lang.Long id) {
                return Incident.findIncident(id);
            }
        };
    }
    
    public Converter<String, Incident> ApplicationConversionServiceFactoryBean.getStringToIncidentConverter() {
        return new org.springframework.core.convert.converter.Converter<java.lang.String, com.pks.inm.domain.Incident>() {
            public com.pks.inm.domain.Incident convert(String id) {
                return getObject().convert(getObject().convert(id, Long.class), Incident.class);
            }
        };
    }
    
    public Converter<Product, String> ApplicationConversionServiceFactoryBean.getProductToStringConverter() {
        return new org.springframework.core.convert.converter.Converter<com.pks.inm.domain.Product, java.lang.String>() {
            public String convert(Product product) {
                return new StringBuilder().append(product.getName()).toString();
            }
        };
    }
    
    public Converter<Long, Product> ApplicationConversionServiceFactoryBean.getIdToProductConverter() {
        return new org.springframework.core.convert.converter.Converter<java.lang.Long, com.pks.inm.domain.Product>() {
            public com.pks.inm.domain.Product convert(java.lang.Long id) {
                return Product.findProduct(id);
            }
        };
    }
    
    public Converter<String, Product> ApplicationConversionServiceFactoryBean.getStringToProductConverter() {
        return new org.springframework.core.convert.converter.Converter<java.lang.String, com.pks.inm.domain.Product>() {
            public com.pks.inm.domain.Product convert(String id) {
                return getObject().convert(getObject().convert(id, Long.class), Product.class);
            }
        };
    }
    
    public Converter<Status, String> ApplicationConversionServiceFactoryBean.getStatusToStringConverter() {
        return new org.springframework.core.convert.converter.Converter<com.pks.inm.domain.Status, java.lang.String>() {
            public String convert(Status status) {
                return new StringBuilder().append(status.getStatus()).toString();
            }
        };
    }
    
    public Converter<Long, Status> ApplicationConversionServiceFactoryBean.getIdToStatusConverter() {
        return new org.springframework.core.convert.converter.Converter<java.lang.Long, com.pks.inm.domain.Status>() {
            public com.pks.inm.domain.Status convert(java.lang.Long id) {
                return Status.findStatus(id);
            }
        };
    }
    
    public Converter<String, Status> ApplicationConversionServiceFactoryBean.getStringToStatusConverter() {
        return new org.springframework.core.convert.converter.Converter<java.lang.String, com.pks.inm.domain.Status>() {
            public com.pks.inm.domain.Status convert(String id) {
                return getObject().convert(getObject().convert(id, Long.class), Status.class);
            }
        };
    }
    
    public void ApplicationConversionServiceFactoryBean.installLabelConverters(FormatterRegistry registry) {
        registry.addConverter(getAssigneeToStringConverter());
        registry.addConverter(getIdToAssigneeConverter());
        registry.addConverter(getStringToAssigneeConverter());
        registry.addConverter(getIncidentToStringConverter());
        registry.addConverter(getIdToIncidentConverter());
        registry.addConverter(getStringToIncidentConverter());
        registry.addConverter(getProductToStringConverter());
        registry.addConverter(getIdToProductConverter());
        registry.addConverter(getStringToProductConverter());
        registry.addConverter(getStatusToStringConverter());
        registry.addConverter(getIdToStatusConverter());
        registry.addConverter(getStringToStatusConverter());
    }
    
    public void ApplicationConversionServiceFactoryBean.afterPropertiesSet() {
        super.afterPropertiesSet();
        installLabelConverters(getObject());
    }
    
}
