package ksyun.client.dmp.describemonitorpanellist.v20240101;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname DescribeMonitorPanelListRequest
 * @Description 请求参数
 */
@Data
public class DescribeMonitorPanelListRequest {
    /**
     * 指定监控大盘ID进行筛选。多个监控大盘ID用“,”隔开。
     */
    @KsYunField(name = "PanelIds")
    private String PanelIds;

    /**
     * 指定监控大盘类型进行筛选。
     */
    @KsYunField(name = "PanelType")
    private String PanelType;

    /**
     * 页数，从1开始，默认为1。
     */
    @KsYunField(name = "Page")
    private Integer Page;

    /**
     * 每页最多返回数据条目数。默认为10。
     */
    @KsYunField(name = "PageSize")
    private Integer PageSize;

}