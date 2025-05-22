package ksyun.client.vpc.describenats.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname DescribeNatsRequest
 * @Description 请求参数
 */
@Data
public class DescribeNatsRequest {
    /**
     * 项目的ID
     */
    @KsYunField(name = "ProjectId")
    private List<String> ProjectIdList;

    /**
     * 多个Nat的ID
     */
    @KsYunField(name="NatId")
    private List<String> NatIdList;

    /**
     * 筛选Filter
     */
    @KsYunField(name="Filter")
    private List<FilterDto> FilterList;

    @Data
    @ToString
    public static class FilterDto {
        /**
         * 有效值：
         * - vpc-id，Vpc的ID
         * - vpn-tunnel-id，Vpn通道ID
         * - direct-connect-gateway-id，专线ID
         */
        @KsYunField(name = "Name")
        private String Name;
        /***/
        @KsYunField(name = "Value")
        private List<String> ValueList;
    }

    /**
     * 是否在返回值中包含资源标签信息
     */
    @KsYunField(name ="IsContainTag")
    private Boolean IsContainTag;

    /**
     * 多个标签的键
     */
    @KsYunField(name="TagKey")
    private List<String> TagKeyList;

    /**多个标签的键*/
    @KsYunField(name = "TagKV")
    private List<TagKVDto> TagKVList;

    @Data
    @ToString
    public static class TagKVDto {
        /**
         * 标签键
         */
        @KsYunField(name = "Name")
        private String Name;
        /**标签值*/
        @KsYunField(name = "Value")
        private String Value;
    }

    /**单次调用可返回的最大条目数量*/
    @KsYunField(name="MaxResults")
    private Integer MaxResults;

    /**获取另一页返回结果的 token.*/
    @KsYunField(name="NextToken")
    private String NextToken;

}