package com.example.spring.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity(name="role")
public class RoleEntity implements Serializable {
    private static final long serialVersionUID = 8106560824187969451L;

    @Id
    @GeneratedValue
    private long id;

    @Column(length=30, nullable=false)
    private String RoleId;

    @Column(length=20, nullable=false)
    private String NameRole;



    @OneToMany(fetch = FetchType.EAGER, cascade=CascadeType.ALL)
    private List<UserEntity> user;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getRoleId() {
        return RoleId;
    }

    public void setRoleId(String roleId) {
        RoleId = roleId;
    }

    public String getNameRole() {
        return NameRole;
    }

    public void setNameRole(String nameRole) {
        NameRole = nameRole;
    }

    public List<UserEntity> getUser() {
        return user;
    }

    public void setUser(List<UserEntity> user) {
        this.user = user;
    }
}
