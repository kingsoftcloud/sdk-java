package ksyun.client.cen.describeinterregions.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeInterRegionsResponse
* @Description DescribeInterRegions 返回体
*/
@Data
@ToString
public class DescribeInterRegionsResponse extends BaseResponseModel {
    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**获取另一页返回结果的 token.*/
    @JsonProperty("NextToken")
    private String NextToken;

    /**云企业网地域的信息*/
    @JsonProperty("InterRegionSet")
    private List<InterRegionSetDto> InterRegionSet;

    @Data
    @ToString
    public static class InterRegionSetDto {
        /**互通大区ID*/
        @JsonProperty("InterAreaId")
        private String InterAreaId;

        /**云企业网地域ID*/
        @JsonProperty("InterRegionId")
        private String InterRegionId;

        /**云企业网地域名称*/
        @JsonProperty("InterRegionName")
        private String InterRegionName;

    }

}
