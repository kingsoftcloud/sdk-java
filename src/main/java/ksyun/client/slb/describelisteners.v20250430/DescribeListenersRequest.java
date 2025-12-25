package ksyun.client.slb.describelisteners.v20250430;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeListenersRequest
* @Description 请求参数
*/
@Data
public class DescribeListenersRequest{
    /**多个监听器的ID*/
    @KsYunField(name = "ListenerId", type = 1)
    private List<String> ListenerIdList;

    /**筛选Filter*/
    @KsYunField(name = "Filter", type = 1)
    private List<FilterDto> FilterList;

    @Data
    @ToString
    public static class FilterDto {
        /**有效值：
- load-balancer-id，复制均衡的ID*/
        @KsYunField(name="Name")
        private String Name;

        /***/
        @KsYunField(name = "Value", type = 1)
        private List<String> ValueList;

    }

    /**单次调用可返回的最大条目数量*/
    @KsYunField(name="MaxResults")
    private Integer MaxResults;

    /**获取另一页返回结果的 token.*/
    @KsYunField(name="NextToken")
    private String NextToken;

}
