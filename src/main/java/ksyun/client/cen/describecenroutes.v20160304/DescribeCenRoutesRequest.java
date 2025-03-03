package ksyun.client.cen.describecenroutes.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname DescribeCenRoutesRequest
 * @Description 请求参数
 */
@Data
public class DescribeCenRoutesRequest {
    /**
     * 多个云企业网路由的ID
     */
    @KsYunField(name = "CenRouteId")
    private List<String> CenRouteIdList;

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
         * - cen-id，云企业网的ID
         * - instance-type，实例的类型
         * -status，状态
         * - region，机房Code
         */
        @KsYunField(name = "Name")
        private String Name;
        /***/
        @KsYunField(name = "Value")
        private List<String> ValueList;
    }


}