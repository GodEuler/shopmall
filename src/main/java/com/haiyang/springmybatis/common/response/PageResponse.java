package com.haiyang.springmybatis.common.response;

import com.github.pagehelper.PageInfo;
import lombok.Data;

import java.util.List;

@Data
public class PageResponse<T> extends BaseResponse {
    private static final String SUCCESS_CODE = "200";
    private static final String DEFAULT_SUCCESS_MSG="success";

    private int currentPage;
    private int currentRowCount;
    private int pageSize;
    private int totalPage;
    private long totalCount;

    public PageResponse(Boolean success, String message, String code, Object data) {
        super(success, message, code, data);
    }

    public static<T> PageResponse pageResponse(String message, PageInfo<T> pageInfo){
        PageResponse<List<T>> listPageResponse = new PageResponse<>(true, message, DEFAULT_SUCCESS_MSG, pageInfo.getList());
        listPageResponse.setCurrentPage(pageInfo.getPageNum());
        listPageResponse.setPageSize(pageInfo.getPageSize());
        listPageResponse.setTotalCount(pageInfo.getTotal());
        listPageResponse.setTotalPage(pageInfo.getPages());
        listPageResponse.setCurrentRowCount(pageInfo.getSize());
        return listPageResponse;
    }







}
