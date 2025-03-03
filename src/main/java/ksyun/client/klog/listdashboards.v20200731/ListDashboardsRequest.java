package ksyun.client.klog.listdashboards.v20200731;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname ListDashboardsRequest
 * @Description 请求参数
 */
@Data
public class ListDashboardsRequest {
    /**
     * 工程名称
     */
    @KsYunField(name = "ProjectName")
    private String ProjectName;

    /**
     * 返回的分页数，从0开始
     */
    @KsYunField(name = "Page")
    private Integer Page;

    /**
     * 每页返回最大条目，默认 500（最大值）
     */
    @KsYunField(name = "Size")
    private Integer Size;


}