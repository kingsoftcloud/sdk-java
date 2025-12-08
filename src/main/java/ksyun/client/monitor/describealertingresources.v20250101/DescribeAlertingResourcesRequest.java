package ksyun.client.monitor.describealertingresources.v20250101;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeAlertingResourcesRequest
* @Description 请求参数
*/
@Data
public class DescribeAlertingResourcesRequest{
    /**指定命名空间。*/
    @KsYunField(name="Namespace")
    private String Namespace;

    /**起始时间。

> 时间格式：`Unix` 时间戳

> **注意：** StartTime 时间戳要小于30天，目前只能支持查30以内的数据。*/
    @KsYunField(name="StartTime")
    private Integer StartTime;

    /**结束时间。

> 时间格式：`Unix` 时间戳*/
    @KsYunField(name="EndTime")
    private Integer EndTime;

}
