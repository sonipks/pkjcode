/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pks.gms.domain;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author VAIO
 */
@Entity
@Table(name = "transaction")
@NamedQueries({@NamedQuery(name = "Transaction.findAll", query = "SELECT t FROM Transaction t"), @NamedQuery(name = "Transaction.findById", query = "SELECT t FROM Transaction t WHERE t.id = :id"), @NamedQuery(name = "Transaction.findByAmount", query = "SELECT t FROM Transaction t WHERE t.amount = :amount"), @NamedQuery(name = "Transaction.findByComments", query = "SELECT t FROM Transaction t WHERE t.comments = :comments"), @NamedQuery(name = "Transaction.findByCreditDebit", query = "SELECT t FROM Transaction t WHERE t.creditDebit = :creditDebit"), @NamedQuery(name = "Transaction.findByEntryDate", query = "SELECT t FROM Transaction t WHERE t.entryDate = :entryDate"), @NamedQuery(name = "Transaction.findByTranDate", query = "SELECT t FROM Transaction t WHERE t.tranDate = :tranDate")})
public class Transaction implements Serializable {
   private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name = "amount")
    private BigInteger amount;
    @Column(name = "comments", length = 255)
    private String comments;
    @Column(name = "creditDebit", length = 1)
    private String creditDebit;
    @Column(name = "entryDate")
    @Temporal(TemporalType.DATE)
    private Date entryDate;
    @Column(name = "tranDate")
    @Temporal(TemporalType.DATE)
    private Date tranDate;
    @JoinColumn(name = "cid", referencedColumnName = "cid")
    @ManyToOne
    private Category cid;
    @JoinColumn(name = "uid", referencedColumnName = "uid")
    @ManyToOne
    private User uid;

    public Transaction() {
    }

    public Transaction(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigInteger getAmount() {
        return amount;
    }

    public void setAmount(BigInteger amount) {
        this.amount = amount;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getCreditDebit() {
        return creditDebit;
    }

    public void setCreditDebit(String creditDebit) {
        this.creditDebit = creditDebit;
    }

    public Date getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(Date entryDate) {
        this.entryDate = entryDate;
    }

    public Date getTranDate() {
        return tranDate;
    }

    public void setTranDate(Date tranDate) {
        this.tranDate = tranDate;
    }

    public Category getCid() {
        return cid;
    }

    public void setCid(Category cid) {
        this.cid = cid;
    }

    public User getUid() {
        return uid;
    }

    public void setUid(User uid) {
        this.uid = uid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Transaction)) {
            return false;
        }
        Transaction other = (Transaction) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.pks.gms.domain.Transaction[id=" + id + "]";
    }

}
