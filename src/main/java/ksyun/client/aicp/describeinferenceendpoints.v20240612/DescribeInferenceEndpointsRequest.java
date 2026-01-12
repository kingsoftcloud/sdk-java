package ksyun.client.aicp.describeinferenceendpoints.v20240612;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeInferenceEndpointsRequest
* @Description 请求参数
*/
@Data
public class DescribeInferenceEndpointsRequest{
    /**推理接入点 ID列表，范围为1-100*/
    @KsYunField(name="EndpointId",type=1)
    private List<String> EndpointIdList;

    /***/
    @KsYunField(name="EndpointName")
    private String EndpointName;

    /***/
    @KsYunField(name="Marker")
    private Integer Marker;

    /***/
    @KsYunField(name="MaxResults")
    private Integer MaxResults;

    /***/
    @KsYunField(name="ProjectId",type=1)
    private List<String> ProjectIdList;

    /**条件过滤，支持按照state状态和project过滤*/
    @KsYunField(name="Filter",type=2)
    private List<FilterDto> FilterList;

    @Data
    @ToString
    public static class FilterDto {
        /***/
        @KsYunField(name="Name")
        private String Name;

        /***/
        @KsYunField(name="Value",type=1)
        private List<String> ValueList;

    }

}
