/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kuis1102.Kuis1102.controller;

import com.kuis1102.Kuis1102.entity.nilai_1102;
import com.kuis1102.Kuis1102.service.nilai_1102Service;
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
@RequestMapping("/nilai_1102")
public class nilai_1102Controller {

    @Autowired
    private nilai_1102Service nilai_1102Service;

    @RequestMapping(method = RequestMethod.POST)
    public nilai_1102 insert(@RequestBody nilai_1102 nilai_1102) {
        return nilai_1102Service.insert(nilai_1102);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public nilai_1102 update(@RequestBody nilai_1102 nilai_1102) {
        return nilai_1102Service.update(nilai_1102);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public boolean delete(@PathVariable("id") Long id) {
        return nilai_1102Service.delete(id);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public nilai_1102 getById(@PathVariable("id") Long id) {
        return nilai_1102Service.getById(id);
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<nilai_1102> getAll() {
        return nilai_1102Service.getAll();
    }
}
