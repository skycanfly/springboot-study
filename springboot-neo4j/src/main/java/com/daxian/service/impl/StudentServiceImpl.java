package com.daxian.service.impl;

import com.daxian.bean.Student;
import com.daxian.repository.StudentRepository;
import com.daxian.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: daxian
 * @Date: 2021/8/28 8:20 下午
 */
@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    StudentRepository repository;

    @Override
    public void createNode(Student student) {
        repository.save(student);
    }

    @Override
    public List<Student> getAllStudentNode() {
        return null;
    }

    @Override
    public List<Student> getAllStudentNodeRelation() {
        return null;
    }

    @Override
    public List<Student> addStudentNodeReseller(long superUserId, long lowerUserId, long time) {
        return null;
    }

    @Override
    public Student findByUserId(long userId) {
        return repository.findByUserId(userId);
    }

    @Override
    public List<Student> findAllDirectlyByUserId(long userId) {
        return null;
    }

    @Override
    public List<Student> findAllStudentByUserId(long userId) {
        return null;
    }

    @Override
    public Student updateStudentNode(long userId, long name) {
        return null;
    }

    @Override
    public void deleteStudentNodeRelation(long superUserId, long lowerUserId) {

    }
}
