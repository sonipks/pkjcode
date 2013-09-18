package com.pks.gms.domain;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.persistence.UniqueConstraint;

/**
 * Category Entity
 *
 * @author Pankaj Soni
 */
@Entity
@Table(name = "category", uniqueConstraints = {@UniqueConstraint(columnNames = {"category"})})
@NamedQueries({@NamedQuery(name = "Category.findAll", query = "SELECT c FROM Category c"), @NamedQuery(name = "Category.findByCid", query = "SELECT c FROM Category c WHERE c.cid = :cid"), @NamedQuery(name = "Category.findByCategory", query = "SELECT c FROM Category c WHERE c.category = :category")})
public class Category implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "cid", nullable = false)
    private Long cid;
    @Column(name = "category", length = 25)
    private String category;
    @OneToMany(mappedBy = "cid", fetch = FetchType.LAZY)
    private List<Transaction> transactions;

    public Category() {
    }

    public Category(Long cid) {
        this.cid = cid;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        String oldCategory = this.category;
        this.category = category;
        changeSupport.firePropertyChange("category", oldCategory, category);
    }

    public Long getCid() {
        return cid;
    }

    public void setCid(Long cid) {
        Long oldCid = this.cid;
        this.cid = cid;
        changeSupport.firePropertyChange("cid", oldCid, cid);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cid != null ? cid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Category)) {
            return false;
        }
        Category other = (Category) object;
        if ((this.cid == null && other.cid != null) || (this.cid != null && !this.cid.equals(other.cid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Category[cid=" + cid + ", " + category + "]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
}
