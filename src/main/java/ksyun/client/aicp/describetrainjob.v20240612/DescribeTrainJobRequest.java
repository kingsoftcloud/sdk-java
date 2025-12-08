package ksyun.client.aicp.describetrainjob.v20240612;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeTrainJobRequest
* @Description 请求参数
*/
@Data
public class DescribeTrainJobRequest{
    /**训练任务Id,多个TrainJobId.1=xx& TrainJobId.2=xx */
    @KsYunField(name="TrainJobId",type=2)
    private List<String> TrainJobIdList;

    /***/
    @KsYunField(name="Filter",type=2)
    private List<FilterDto> FilterList;

    @Data
    @ToString
    public static class FilterDto {
        /**可选值：status */
        @KsYunField(name="Name")
        private String Name;

        /***/
        @KsYunField(name="Value",type=2)
        private List<String> ValueList;

    }

    /**分页参数*/
    @KsYunField(name="Marker")
    private Integer Marker;

    /**返回最大值，默认1000*/
    @KsYunField(name="MaxResults")
    private Integer MaxResults;

}
