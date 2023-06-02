package com.open.groupie.models.db;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "sys_user")
public class User {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @Column(name = "uid")
    private String uid;

    @OneToMany(mappedBy = "user")
    private List<Membership> groups;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public List<Membership> getGroups() {
        return groups;
    }

    public void setGroups(List<Membership> groups) {
        this.groups = groups;
    }

    @Override
    public String toString() {
        return "User [id=" + id + ", uid=" + uid + ", groups=" + groups + "]";
    }

}
