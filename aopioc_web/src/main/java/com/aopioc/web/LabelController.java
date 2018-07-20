package com.aopioc.web;

import com.alibaba.dubbo.config.annotation.Reference;
import com.aopioc.entity.Label;
import com.aopioc.entity.Result;
import com.aopioc.entity.StatusCode;
import com.aopioc.service.LabelService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ClassName LabelController
 * @Description TODO
 * @Author Q_先生
 * @Date 2018/7/20 9:55
 **/
@RestController
@RequestMapping("/app/label")
public class LabelController {

    @Reference(version = "1.0.0")
    private LabelService labelService;

    @GetMapping
    private Result findAll() {
        List<Label> list = labelService.findAll();
        return new Result(true, StatusCode.OK, "查询成功", list);
    }
}
