/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kuis1102.Kuis1102.service;

import com.kuis1102.Kuis1102.entity.nilai_1102;
import com.kuis1102.Kuis1102.repo.nilai_1102Repo;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author PC-11-320
 */
@Service("nilai_1102Service")
@Transactional
public class nilai_1102Service {

    @Autowired
    private nilai_1102Repo repo;

    public nilai_1102 insert(nilai_1102 nilai_1102) {
        return repo.save(nilai_1102);
    }

    public nilai_1102 update(nilai_1102 nilai_1102) {
        return repo.save(nilai_1102);
    }

    public boolean delete(Long id) {
        repo.delete(id);
        return true;
    }

    public nilai_1102 getById(Long id) {
        return repo.findOne(id);
    }

    public List<nilai_1102> getAll() {
        return repo.findAllnilai_1102();
    }

}
