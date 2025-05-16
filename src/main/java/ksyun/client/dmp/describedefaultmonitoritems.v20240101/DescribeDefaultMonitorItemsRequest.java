package ksyun.client.dmp.describedefaultmonitoritems.v20240101;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

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