package com.daxian.bean;

import lombok.Builder;
import lombok.Data;
import org.neo4j.ogm.annotation.*;

/**
 * @Author: daxian
 * @Date: 2021/8/28 8:31 下午
 */
@RelationshipEntity(type = "relationShip")
@Data
@Builder
public class RelationShip {
    @Id
    @GeneratedValue
    private Long id;

    @StartNode
    private Dept parent;

    @EndNode
    private Dept child;
}
