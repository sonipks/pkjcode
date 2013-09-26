// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.pks.jtest.web.converter;

import com.pks.jtest.domain.Product;
import com.pks.jtest.web.converter.ProductConverter;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

privileged aspect ProductConverter_Roo_Converter {
    
    declare parents: ProductConverter implements Converter;
    
    declare @type: ProductConverter: @FacesConverter("com.pks.jtest.web.converter.ProductConverter");
    
    public Object ProductConverter.getAsObject(FacesContext context, UIComponent component, String value) {
        if (value == null || value.length() == 0) {
            return null;
        }
        Long id = Long.parseLong(value);
        return Product.findProduct(id);
    }
    
    public String ProductConverter.getAsString(FacesContext context, UIComponent component, Object value) {
        return value instanceof Product ? ((Product) value).getId().toString() : "";
    }
    
}
