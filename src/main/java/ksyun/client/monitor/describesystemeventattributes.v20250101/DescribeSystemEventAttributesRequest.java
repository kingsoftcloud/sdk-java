package ksyun.client.monitor.describesystemeventattributes.v20250101;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeSystemEventAttributesRequest
* @Description 请求参数
*/
@Data
public class DescribeSystemEventAttributesRequest{
    /**开始时间。

> **Tips：** 请注意时间格式为Unix时间戳（毫秒），从1970年1月1日开始所经过的毫秒数。*/
    @KsYunField(name="StartTime")
    private Integer StartTime;

    /**结束时间。

> **Tips：** 请注意时间格式为Unix时间戳（毫秒），从1970年1月1日开始所经过的毫秒数。*/
    @KsYunField(name="EndTime")
    private Integer EndTime;

    /**表示一类云产品，指定命名空间。*/
    @KsYunField(name="Namespace")
    private String Namespace;

    /**事件类型。

> **说明：**
> 关于事件类型的取值，可参考：[云产品事件列表](https://docs.ksyun.com/directories/3753?type=1)*/
    @KsYunField(name="EventType")
    private String EventType;

    /**事件名称。

> **说明：**
> 关于事件类型的取值，可参考：[云产品事件列表](https://docs.ksyun.com/directories/3753?type=1)


> **Tips：** 支持同时查询多个事件，多个事件之间用逗号分隔，最多可查询10个事件。*/
    @KsYunField(name="EventName")
    private String EventName;

    /**事件级别。

有效值：
- Critical：严重
- Warn(Warning)：警告
- Info：信息
*/
    @KsYunField(name="Level")
    private String Level;

    /**事件状态。

> **说明：**
> 关于事件类型的取值，可参考：[云产品事件列表](https://docs.ksyun.com/directories/3753?type=1)*/
    @KsYunField(name="Status")
    private String Status;

    /**搜索事件内容包含的关键字。

取值：
- 如果您待搜索事件的内容中包括 a 和 b，可以搜索a and b。
- 如果您待搜索事件的内容中包括 a 或 b，可以搜索a or b。*/
    @KsYunField(name="SearchKeywords")
    private String SearchKeywords;

    /**页码。

取值范围：1~10000。*/
    @KsYunField(name="PageIndex")
    private Integer PageIndex;

    /**每页显示记录条数。

取值范围：1~100。*/
    @KsYunField(name="PageSize")
    private Integer PageSize;

}
