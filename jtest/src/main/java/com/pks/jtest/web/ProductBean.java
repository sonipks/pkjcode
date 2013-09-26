package com.pks.jtest.web;

import com.pks.jtest.domain.Product;
import org.springframework.roo.addon.jsf.managedbean.RooJsfManagedBean;
import org.springframework.roo.addon.serializable.RooSerializable;

@RooSerializable
@RooJsfManagedBean(entity = Product.class, beanName = "productBean")
public class ProductBean {
}
