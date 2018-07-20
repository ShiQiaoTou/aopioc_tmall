package com.aopioc.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * @ClassName Label
 * @Description TODO
 * @Author Q_先生
 * @Date 2018/7/19 18:08
 **/
@Entity
@Table(name = "label")
public class Label implements Serializable {

    @Id
    private String id;

    private String labelname;

    private String state;

    /**
     * 使用数量
     */
    private Long count;

    private Long funs;

    /**
     * 是否推荐
     */
    private String recommend;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLabelname() {
        return labelname;
    }

    public void setLabelname(String labelname) {
        this.labelname = labelname;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public Long getFuns() {
        return funs;
    }

    public void setFuns(Long funs) {
        this.funs = funs;
    }

    public String getRecommend() {
        return recommend;
    }

    public void setRecommend(String recommend) {
        this.recommend = recommend;
    }
}
