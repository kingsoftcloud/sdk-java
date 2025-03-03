package ksyun.client.dmp.describedefaultmonitoritems.v20240101;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DescribeDefaultMonitorItemsRequest
 * @Description 请求参数
 */
@Data
public class DescribeDefaultMonitorItemsRequest {
    /**
     * 监控大盘类型。可选值为：MySQL，Redis（严格区分大小写）。
     */
    @KsYunField(name = "PanelType")
    private String PanelType;

}