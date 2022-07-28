//package com.EndUser.users.model;
//
//import com.sun.istack.NotNull;
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.Table;
//
//@Data
//@Entity
//@NoArgsConstructor
//@AllArgsConstructor
//@Table(name = "user")
//public class EndUserEntity extends BaseEntity{
//    @Id
//    @Column(name = "id", nullable = false)
//    private Long id;
//
//    @NotNull
//    private String firstName;
//
//    @NotNull
//    private String lastName;
//
//    @NotNull
//    @Column(unique = true)
//    private String email;
//
//    @NotNull
//    private String password;
//
//}
