package com.daxian.repository;

import com.daxian.bean.RelationShip;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

/**
 * @Author: daxian
 * @Date: 2021/8/28 8:33 下午
 */
@Repository
public interface RelationShipRepository extends Neo4jRepository<RelationShip, Long> {
}
