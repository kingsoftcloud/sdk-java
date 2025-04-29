package ksyun.client.monitor.describealarmreceives.v20210101;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeAlarmReceivesRequest
* @Description 请求参数
*/
@Data
public class DescribeAlarmReceivesRequest{
    /**告警策略ID，详见[查询告警策略](https://docs.ksyun.com/documents/40346)*/
    @KsYunField(name="PolicyId")
    private Integer PolicyId;

}