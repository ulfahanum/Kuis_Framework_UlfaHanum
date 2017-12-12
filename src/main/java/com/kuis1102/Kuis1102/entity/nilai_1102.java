/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kuis1102.Kuis1102.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author PC-11-320
 */
@Entity
@Table(name = "nilai_1102")
public class nilai_1102 implements Serializable {

    @Id
    @Column(length = 255, nullable = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_nilai;
    @Column(length = 100, nullable = false, unique = true)
    private String nilai;
    @Column(length = 255, nullable = true)
    private String keterangan;
    @OneToMany(mappedBy = "owner")
    private List<cv_1102> cv_1102;

    public Long getId() {
        return id_nilai;
    }

    public void setId(Long id) {
        this.id_nilai = id_nilai;
    }

    public String getNilai() {
        return nilai;
    }

    public void setNilai(String nilai) {
        this.nilai = nilai;
    }

    public String getKet() {
        return keterangan;
    }

    public void setKet(String keterangan) {
        this.keterangan = keterangan;
    }
}
