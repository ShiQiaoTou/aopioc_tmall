package com.aopioc.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.aopioc.entity.Label;
import com.aopioc.repository.LabelRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @ClassName LabelServiceImpl
 * @Description TODO
 * @Author Q_先生
 * @Date 2018/7/19 18:01
 **/
@Service(version = "1.0.0")
public class LabelServiceImpl implements LabelService {

    @Autowired
    private LabelRepository labelRepository;

    @Override
    public List<Label> findAll() {
        return labelRepository.findAll();
    }

    @Override
    public Label findById(String id) {
        return null;
    }

    @Override
    public void add(Label label) {

    }

    @Override
    public void update(Label label) {

    }

    @Override
    public void deleteById(String id) {

    }
}
