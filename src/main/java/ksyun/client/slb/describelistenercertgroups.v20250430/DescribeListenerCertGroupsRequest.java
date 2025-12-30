package ksyun.client.slb.describelistenercertgroups.v20250430;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeListenerCertGroupsRequest
* @Description 请求参数
*/
@Data
public class DescribeListenerCertGroupsRequest{
    /**多个证书组的ID*/
    @KsYunField(name="ListenerCertGroupId",type=1)
    private List<String> ListenerCertGroupIdList;

    /**筛选Filter*/
    @KsYunField(name="Filter",type=1)
    private List<FilterDto> FilterList;

    @Data
    @ToString
    public static class FilterDto {
        /**有效值：
- listener-id，应用型监听器的ID*/
        @KsYunField(name="Name")
        private String Name;

        /***/
        @KsYunField(name="Value",type=1)
        private List<String> ValueList;

    }

    /**单次调用可返回的最大条目数量*/
    @KsYunField(name="MaxResults")
    private Integer MaxResults;

    /**获取另一页返回结果的 token.*/
    @KsYunField(name="NextToken")
    private String NextToken;

}
