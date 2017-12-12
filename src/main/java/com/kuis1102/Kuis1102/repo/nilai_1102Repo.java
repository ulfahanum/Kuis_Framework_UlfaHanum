/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kuis1102.Kuis1102.repo;

import com.kuis1102.Kuis1102.entity.nilai_1102;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author PC-11-320
 */
public interface nilai_1102Repo extends CrudRepository<nilai_1102, Long> {

    @Query("select c from nilai_1102 c")
    public List<nilai_1102> findAllnilai_1102();
}
