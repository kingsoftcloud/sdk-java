package ksyun.client.aicp.querymemorycollectionmetrics.v20251114;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname QueryMemoryCollectionMetricsRequest
* @Description 请求参数
*/
@Data
public class QueryMemoryCollectionMetricsRequest{
    /**记忆库ID*/
    @KsYunField(name="MemoryCollectionId")
    private String MemoryCollectionId;

    /**开始时间，unix秒级时间戳*/
    @KsYunField(name="StartTime")
    private Long StartTime;

    /**结束时间，unix秒级时间戳*/
    @KsYunField(name="EndTime")
    private Long EndTime;

}
