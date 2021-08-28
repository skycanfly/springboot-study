package com.daxian.bean;

import lombok.Builder;
import lombok.Data;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Property;

/**
 * @Author: daxian
 * @Date: 2021/8/28 8:31 下午
 */
@NodeEntity(label = "dept")
@Data
@Builder
public class Dept {
    @Id
    @GeneratedValue
    private Long id;

    @Property(name = "deptName")
    private String deptName;
}
