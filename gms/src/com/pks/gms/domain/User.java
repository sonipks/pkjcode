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
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * User Entity
 *
 * @author Pankaj Soni
 */
@Entity
@Table(name = "user", uniqueConstraints = {@UniqueConstraint(columnNames = {"username"})})
@NamedQueries({@NamedQuery(name = "User.findAll", query = "SELECT u FROM User u"), @NamedQuery(name = "User.findByUid", query = "SELECT u FROM User u WHERE u.uid = :uid"), @NamedQuery(name = "User.findByAssignedRole", query = "SELECT u FROM User u WHERE u.assignedRole = :assignedRole"), @NamedQuery(name = "User.findByPassword", query = "SELECT u FROM User u WHERE u.password = :password"), @NamedQuery(name = "User.findByUsername", query = "SELECT u FROM User u WHERE u.username = :username")})
public class User implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "uid", nullable = false)
    private Long uid;
    @Column(name = "assignedRole", length = 25)
    private String assignedRole;
    @Basic(optional = false)
    @Column(name = "password", length = 255)
    private String password;
    @Basic(optional = false)
    @Column(name = "username", nullable = false, length = 25)
    private String username;
    @OneToMany(mappedBy = "uid", fetch = FetchType.LAZY)
    private List<Transaction> transactions;
    @Transient
    private static final Logger LOGGER = LoggerFactory.getLogger(User.class);

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }

    public String getAssignedRole() {
        return assignedRole;
    }

    public void setAssignedRole(String assignedRole) {
        String oldAssignedRole = this.assignedRole;
        this.assignedRole = assignedRole;
        changeSupport.firePropertyChange("assignedRole", oldAssignedRole, assignedRole);
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        String oldPassword = this.password;
        this.password = password;
        changeSupport.firePropertyChange("password", oldPassword, password);
    }

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        Long oldUid = this.uid;
        this.uid = uid;
        changeSupport.firePropertyChange("uid", oldUid, uid);
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        String oldUsername = this.username;
        this.username = username;
        changeSupport.firePropertyChange("username", oldUsername, username);
    }

    @Override
    public String toString() {
        if (LOGGER.isDebugEnabled()) {
            LOGGER.debug("User[uid=" + uid + "," + username + "]");
        }
        return username;
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
}
