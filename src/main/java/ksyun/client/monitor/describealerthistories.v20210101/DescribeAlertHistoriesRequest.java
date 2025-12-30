package ksyun.client.monitor.describealerthistories.v20210101;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeAlertHistoriesRequest
* @Description 请求参数
*/
@Data
public class DescribeAlertHistoriesRequest{
    /**开始时间。

> 时间格式：Unix时间戳(秒)*/
    @KsYunField(name="StartTime")
    private Integer StartTime;

    /**结束时间。

> 时间格式：Unix时间戳(秒)*/
    @KsYunField(name="EndTime")
    private Integer EndTime;

    /**产品ID，详情 [获取产品列表](https://docs.ksyun.com/documents/42040?type=3)*/
    @KsYunField(name="ProductType")
    private Integer ProductType;

    /**指定策略ID查询。*/
    @KsYunField(name="PolicyId")
    private Integer PolicyId;

    /**指定告警资源ID。

> 不支持批量资源ID查询。*/
    @KsYunField(name="InstanceId")
    private String InstanceId;

    /**页数。*/
    @KsYunField(name="PageIndex")
    private Integer PageIndex;

    /**每页最多显示记录数。*/
    @KsYunField(name="PageSize")
    private Integer PageSize;

}
