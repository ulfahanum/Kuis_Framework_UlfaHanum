/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kuis1102.Kuis1102.entity;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.criteria.Fetch;

/**
 *
 * @author PC-11-320
 */
@Entity
@Table(name = "cv_1102")
public class cv_1102 implements Serializable {

    @Id
    @Column(length = 255, nullable = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 100, nullable = false, unique = true)
    private String nama_lengkap;
    @Column(length = 255, nullable = true)
    private String ttl;
    @Column(length = 255, nullable = true)
    private String jk;
    @Column(length = 255, nullable = true)
    private String domisili;
    @Column(length = 255, nullable = true)
    private String agama;
    @Column(length = 255, nullable = true)
    private String status;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="id_nilai")
    private nilai_1102 owner;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNama() {
        return nama_lengkap;
    }

    public void setNama(String nama_lengkap) {
        this.nama_lengkap = nama_lengkap;
    }

    public String getTtl() {
        return ttl;
    }

    public void setTtl(String ttl) {
        this.ttl = ttl;
    }

    public String getJk() {
        return jk;
    }

    public void setJk(String jk) {
        this.jk = jk;
    }

    public String getDomisili() {
        return domisili;
    }

    public void setDomisili(String domisili) {
        this.domisili = domisili;
    }

    public String getAgama() {
        return agama;
    }

    public void setAgama(String agama) {
        this.agama = agama;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getNama_lengkap() {
        return nama_lengkap;
    }

    public void setNama_lengkap(String nama_lengkap) {
        this.nama_lengkap = nama_lengkap;
    }
}
