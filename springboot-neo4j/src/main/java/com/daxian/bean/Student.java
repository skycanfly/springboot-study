package com.daxian.bean;

import lombok.Data;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.Index;
import org.neo4j.ogm.annotation.NodeEntity;

/**
 * @Author: daxian
 * @Date: 2021/8/28 8:15 下午
 */
@Data
@NodeEntity
public class Student {
    @Id
    @GeneratedValue
    private Long id;

    @Index
    private long userId;
    private String name;
    private long age;
}
