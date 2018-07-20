package com.aopioc.repository;

import com.aopioc.entity.Label;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @ClassName LabelRepository
 * @Description TODO
 * @Author Q_先生
 * @Date 2018/7/19 17:59
 **/
public interface LabelRepository extends JpaRepository<Label, String>, JpaSpecificationExecutor<Label> {
}
