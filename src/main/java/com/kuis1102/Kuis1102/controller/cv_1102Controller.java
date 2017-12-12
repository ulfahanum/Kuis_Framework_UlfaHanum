/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kuis1102.Kuis1102.controller;

import com.kuis1102.Kuis1102.entity.cv_1102;
import com.kuis1102.Kuis1102.service.cv_1102Service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author PC-11-320
 */
@RestController
@RequestMapping("/cv_1102")
public class cv_1102Controller {

    @Autowired
    private cv_1102Service cv_1102Service;

    @RequestMapping(method = RequestMethod.POST)
    public cv_1102 insert(@RequestBody cv_1102 cv_1102) {
        return cv_1102Service.insert(cv_1102);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public cv_1102 update(@RequestBody cv_1102 cv_1102) {
        return cv_1102Service.update(cv_1102);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public boolean delete(@PathVariable("id") Long id) {
        return cv_1102Service.delete(id);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public cv_1102 getById(@PathVariable("id") Long id) {
        return cv_1102Service.getById(id);
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<cv_1102> getAll() {
        return cv_1102Service.getAll();
    }
}
