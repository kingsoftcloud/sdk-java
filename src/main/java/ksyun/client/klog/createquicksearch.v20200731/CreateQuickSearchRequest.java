package ksyun.client.klog.createquicksearch.v20200731;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname CreateQuickSearchRequest
* @Description 请求参数
*/
@Data
public class CreateQuickSearchRequest{
    /**工程名称*/
    @KsYunField(name="ProjectName")
    private String ProjectName;

    /**日志池名称*/
    @KsYunField(name="LogPoolName")
    private String LogPoolName;

    /**快速查询名称*/
    @KsYunField(name="QuickSearchName")
    private String QuickSearchName;

    /**快速查询的备注*/
    @KsYunField(name="Description")
    private String Description;

    /**查询数据的时间范围*/
    @KsYunField(name="TimeRange")
    private String TimeRange;

    /**查询语句*/
    @KsYunField(name="Query")
    private String Query;


}