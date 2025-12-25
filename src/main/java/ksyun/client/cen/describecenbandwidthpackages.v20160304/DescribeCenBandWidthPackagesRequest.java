package ksyun.client.cen.describecenbandwidthpackages.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeCenBandWidthPackagesRequest
* @Description 请求参数
*/
@Data
public class DescribeCenBandWidthPackagesRequest{
    /**项目的ID*/
    @KsYunField(name = "ProjectId", type = 1)
    private List<String> ProjectIdList;

    /**多个带宽包的ID*/
    @KsYunField(name = "CenBandWidthPackageId", type = 1)
    private List<String> CenBandWidthPackageIdList;

    /**筛选Filter*/
    @KsYunField(name = "Filter", type = 1)
    private List<FilterDto> FilterList;

    @Data
    @ToString
    public static class FilterDto {
        /**有效值：
- cen-id，云企业网的ID*/
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

    /**多个标签的键*/
    @KsYunField(name = "TagKey", type = 1)
    private List<String> TagKeyList;

    /**多个标签的键*/
    @KsYunField(name = "TagKV", type = 1)
    private List<TagKVDto> TagKVList;

    @Data
    @ToString
    public static class TagKVDto {
        /**标签键*/
        @KsYunField(name="Name")
        private String Name;

        /**标签值*/
        @KsYunField(name="Value")
        private String Value;

    }

}
