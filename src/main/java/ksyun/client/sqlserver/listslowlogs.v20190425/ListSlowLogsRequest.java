package ksyun.client.sqlserver.listslowlogs.v20190425;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname ListSlowLogsRequest
* @Description 请求参数
*/
@Data
public class ListSlowLogsRequest{
    /**实例ID*/
    @KsYunField(name="DBInstanceIdentifier")
    private String DBInstanceIdentifier;

    /**查询时间*/
    @KsYunField(name="Time")
    private String Time;

    /**排序字段

```json
支持多个字段，中间以英文逗号隔开。若不传则默认以慢日志收集时间倒叙排序。
```*/
    @KsYunField(name="OrderBy")
    private String OrderBy;

}
