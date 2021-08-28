package com.daxian.service;

import com.daxian.bean.Student;

import java.util.List;

/**
 * @Author: daxian
 * @Date: 2021/8/28 8:19 下午
 */
public interface StudentService {
    void createNode(Student student);
    /**
     * 查询所有节点
     * @return
     */
    List<Student> getAllStudentNode();

    /**
     * 查询所有节点的所有关系
     * @return
     */
    List<Student> getAllStudentNodeRelation();

    /**
     * 创建2节点的关系 上下关系
     * @param superUserId
     * @param lowerUserId
     * @param time
     * @return
     */
    List<Student> addStudentNodeReseller(long superUserId, long lowerUserId, long time);
    /**
     * 根据id查询单个节点
     * @param userId
     * @return
     */
    Student findByUserId(long userId);

    /**
     * 根据userId查询节点直属 2级关系
     * @param userId
     * @return
     */
    List<Student> findAllDirectlyByUserId(long userId);

    /**
     * 根据userId 查询该节点的所有关系
     * @param userId
     * @return
     */
    List<Student> findAllStudentByUserId(long userId);

    /**
     * 根据userId 修改节点 属性
     * @param userId
     * @param name
     * @return
     */
    Student updateStudentNode(long userId, long name);


    /**
     * 删除节点关系
     * @param superUserId
     * @param lowerUserId
     */
    void deleteStudentNodeRelation(long superUserId, long lowerUserId);

}
