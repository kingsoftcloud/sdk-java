package ksyun.client.dmp.describeinstancelist.v20240101;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DescribeInstanceListRequest
 * @Description 请求参数
 */
@Data
public class DescribeInstanceListRequest {
    /**
     * 指定实例ID查询。
     */
    @KsYunField(name = "InstanceId")
    private String InstanceId;

    /**
     * 指定数据库类型进行筛选。
     */
    @KsYunField(name = "DatabaseType")
    private String DatabaseType;

    /**
     * 指定实例机房进行筛选。
     */
    @KsYunField(name = "InstanceRegion")
    private String InstanceRegion;

    /**
     * 指定监控大盘类型查找。
     */
    @KsYunField(name = "InstanceName")
    private String InstanceName;

    /**
     * 指定实例Ip进行查找。
     */
    @KsYunField(name = "Ip")
    private String Ip;

    /**
     * 支持按实例ID，实例名称，Ip地址模糊查找。
     */
    @KsYunField(name = "Search")
    private String Search;

    /**
     * 页数，从1开始，默认为1。
     */
    @KsYunField(name = "Page")
    private Integer Page;

    /**
     * 每页返回数据条目数。默认为10。
     */
    @KsYunField(name = "PageSize")
    private Integer PageSize;

}