package ksyun.client.aicp.describebatchinferencejobs.v20240612;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeBatchInferenceJobsRequest
* @Description 请求参数
*/
@Data
public class DescribeBatchInferenceJobsRequest{
    /**页码，从1开始，默认是1*/
    @KsYunField(name="Marker")
    private Integer Marker;

    /**页长，默认和最大都是100*/
    @KsYunField(name="MaxResults")
    private Integer MaxResults;

    /**任务名称模糊查询条件*/
    @KsYunField(name="JobNameKeyword")
    private String JobNameKeyword;

    /**按状态过滤查询
init、queuing、running、terminated、completed、failed、timeout*/
    @KsYunField(name="Status",type=1)
    private List<String> StatusList;

    /***/
    @KsYunField(name="BatchId")
    private String BatchId;

}
