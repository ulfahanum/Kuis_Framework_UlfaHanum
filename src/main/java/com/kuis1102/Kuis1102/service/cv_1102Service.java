/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kuis1102.Kuis1102.service;

import com.kuis1102.Kuis1102.entity.cv_1102;
import com.kuis1102.Kuis1102.repo.cv_1102Repo;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author PC-11-320
 */
@Service("cv_1102Service")
@Transactional
public class cv_1102Service {

    @Autowired
    private cv_1102Repo repo;

    public cv_1102 insert(cv_1102 cv_1102) {
        return repo.save(cv_1102);
    }

    public cv_1102 update(cv_1102 cv_1102) {
        return repo.save(cv_1102);
    }

    public boolean delete(Long id) {
        repo.delete(id);
        return true;
    }

    public cv_1102 getById(Long id){
        return repo.findOne(id);
    }
    
    public List<cv_1102> getAll(){
        return repo.findAllcv_1102();
    }
}
