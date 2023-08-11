package ksyun.client.klog.listquicksearchs.v20200731;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname ListQuickSearchsRequest
* @Description 请求参数
*/
@Data
public class ListQuickSearchsRequest{
    /**工程名称*/
    @KsYunField(name="ProjectName")
    private String ProjectName;

    /**日志池名称*/
    @KsYunField(name="LogPoolName")
    private String LogPoolName;

    /**根据快速查询名称过滤列表，支持模糊搜索*/
    @KsYunField(name="Filter")
    private String Filter;

    /**页码，从0开始*/
    @KsYunField(name="Page")
    private Integer Page;

    /**每页返回最大条目，默认 500（最大值）*/
    @KsYunField(name="Size")
    private Integer Size;


}