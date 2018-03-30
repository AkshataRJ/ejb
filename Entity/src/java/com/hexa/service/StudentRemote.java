/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hexa.service;

import com.hexa.entity.Student;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author Hvuser
 */
@Remote
public interface StudentRemote {
    public List<Student>getStudents();
}
