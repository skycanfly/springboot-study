package com.daxian.controller;

import com.daxian.bean.Student;
import com.daxian.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: daxian
 * @Date: 2021/8/28 8:21 下午
 */
@RestController
@RequestMapping("/studentRelation")
public class StudentController {
    @Autowired
    StudentService service;

    @GetMapping("/test")
    public String test() {
        //创建节点
        Student student = new Student();
        student.setUserId(100005);
        student.setName("李七");
        student.setAge(23);
        service.createNode(student);

        Student st = service.findByUserId(100005);
        System.out.println("查询结果：" + st);
        return st.toString();
    }
}
