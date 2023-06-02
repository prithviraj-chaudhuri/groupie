package com.open.groupie.models.db;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "sys_group")
public class Group {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    @OneToMany(mappedBy = "group")
    private List<Membership> members;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Membership> getMembers() {
        return members;
    }

    public void setMembers(List<Membership> members) {
        this.members = members;
    }

    @Override
    public String toString() {
        return "Group [id=" + id + ", name=" + name + ", members=" + members + "]";
    }

}
