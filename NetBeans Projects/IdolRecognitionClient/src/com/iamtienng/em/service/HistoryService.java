/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iamtienng.em.service;

import com.iamtienng.em.model.History;
import java.util.List;

/**
 *
 * @author iamtienng
 */
public interface HistoryService {

    public List<History> getList();

    public boolean deleteHistory(String token);

}
