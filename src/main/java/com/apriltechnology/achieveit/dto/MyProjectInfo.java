package com.apriltechnology.achieveit.dto;

/**
 * @Description 查询我创建的项目信息
 * @Author fjm
 * @Date 2020/4/4
 */
public class MyProjectInfo {

    private Integer pageSize;

    private Integer pageNum;

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }
}
