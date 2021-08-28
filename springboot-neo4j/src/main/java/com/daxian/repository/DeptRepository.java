package com.daxian.repository;

import com.daxian.bean.Dept;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

/**
 * @Author: daxian
 * @Date: 2021/8/28 8:32 下午
 */
@Repository
public interface DeptRepository extends Neo4jRepository<Dept,Long> {
}
