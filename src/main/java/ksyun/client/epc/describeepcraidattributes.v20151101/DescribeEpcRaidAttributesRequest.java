package ksyun.client.epc.describeepcraidattributes.v20151101;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname DescribeEpcRaidAttributesRequest
 * @Description 请求参数
 */
@Data
public class DescribeEpcRaidAttributesRequest {
    /**
     * 筛选Filter
     */
    @KsYunField(name = "Filter")
    private List<FilterDto> FilterList;

    @Data
    @ToString
    public static class FilterDto {
        /**
         * 有效值：
         * - host-type，裸金属服务器类型
         */
        @KsYunField(name = "Name")
        private String Name;
        /***/
        @KsYunField(name = "Value")
        private List<String> ValueList;
    }

    /**
     * 单次调用可返回的最大条目数量
     */
    @KsYunField(name = "MaxResults")
    private Integer MaxResults;

    /**
     * 获取另一页返回结果的 token.
     */
    @KsYunField(name = "NextToken")
    private String NextToken;

}