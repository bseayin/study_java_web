package com.xsz.repository;

import com.xsz.entity.ResourceData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ResourceRepository extends JpaRepository<ResourceData,Integer> {


}
