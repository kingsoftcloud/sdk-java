package ksyun.client.slb.describehealthchecks.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeHealthChecksRequest
* @Description 请求参数
*/
@Data
public class DescribeHealthChecksRequest{
    /**多个健康检查的ID*/
    @KsYunField(name = "HealthCheckId", type = 1)
    private List<String> HealthCheckIdList;

    /**筛选Filter*/
    @KsYunField(name = "Filter", type = 1)
    private List<FilterDto> FilterList;

    @Data
    @ToString
    public static class FilterDto {
        /**有效值： 
- listener-id，监听器的ID*/
        @KsYunField(name="Name")
        private String Name;

        /***/
        @KsYunField(name = "Value", type = 1)
        private List<String> ValueList;

    }

    /**单次调用可返回的最大条目数量*/
    @KsYunField(name="Limit")
    private Integer Limit;

    /**获取另一页返回结果的 token.*/
    @KsYunField(name="Marker")
    private String Marker;

}
