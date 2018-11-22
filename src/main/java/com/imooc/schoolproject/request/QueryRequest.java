package com.imooc.schoolproject.request;

/**
 * @Author zhangliwei
 * @Date 2018/9/2 下午5:49
 */
public class QueryRequest {
    
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
