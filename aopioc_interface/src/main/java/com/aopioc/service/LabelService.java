package com.aopioc.service;

import com.aopioc.entity.Label;

import java.util.List;

/**
 * @ClassName LabelService
 * @Description TODO
 * @Author Q_先生
 * @Date 2018/7/19 18:05
 **/
public interface LabelService {

    List<Label> findAll();

    Label findById(String id);

    void add(Label label);

    void update(Label label);

    void deleteById(String id);
}
