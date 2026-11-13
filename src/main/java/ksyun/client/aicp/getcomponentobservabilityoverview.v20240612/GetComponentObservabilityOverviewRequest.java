package ksyun.client.aicp.getcomponentobservabilityoverview.v20240612;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname GetComponentObservabilityOverviewRequest
* @Description 请求参数
*/
@Data
public class GetComponentObservabilityOverviewRequest{
    /***/
    @KsYunField(name="ComponentType")
    private String ComponentType;

    /***/
    @KsYunField(name="StartTime")
    private Integer StartTime;

    /***/
    @KsYunField(name="EndTime")
    private Integer EndTime;

    /***/
    @KsYunField(name="IntervalSeconds")
    private Integer IntervalSeconds;

}
