package ksyun.client.cen.describecengrants.v20160304;

import common.annotation.KsYunField;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
 * @Classname DescribeCenGrantsRequest
 * @Description 请求参数
 */
@Data
public class DescribeCenGrantsRequest {
    /**
     * 多个云企业网授权的ID
     */
    @KsYunField(name = "CenGrantId")
    private List<String> CenGrantIdList;

    /**
     * 筛选Filter
     */
    @KsYunField(name = "Filter")
    private List<FilterDto> FilterList;
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

    @Data
    @ToString
    public static class FilterDto {
        /**
         * 有效值：
         * - cen-id，云企业网ID
         * - network-instance-id，网络实例ID
         * - instance-type，实例类型
         * - cen-account-id，云企业网账号ID
         */
        @KsYunField(name = "Name")
        private String Name;
        /***/
        @KsYunField(name = "Value")
        private List<String> ValueList;
    }

}