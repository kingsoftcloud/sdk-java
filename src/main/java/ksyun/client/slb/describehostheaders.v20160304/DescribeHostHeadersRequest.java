package ksyun.client.slb.describehostheaders.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeHostHeadersRequest
* @Description 请求参数
*/
@Data
public class DescribeHostHeadersRequest{
    /**多个域名的ID*/
    @KsYunField(name="HostHeaderId",type=2)
    private List<String> HostHeaderIdList;

    /**筛选Filter*/
    @KsYunField(name="Filter",type=2)
    private List<FilterDto1> FilterList;

    @Data
    @ToString
    public static class FilterDto1 {
        /**有效值： 
- listener-id，监听器的ID*/
        @KsYunField(name="Name")
        private String Name;

        /***/
        @KsYunField(name="Value",type=2)
        private List<String> ValueList;

    }

    /**单次调用可返回的最大条目数量*/
    @KsYunField(name="MaxResults")
    private Integer MaxResults;

    /**获取另一页返回结果的 token.*/
    @KsYunField(name="NextToken")
    private String NextToken;

}
