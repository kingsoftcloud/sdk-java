package ksyun.client.cen.describecengrants.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeCenGrantsResponse
* @Description DescribeCenGrants 返回体
*/
@Data
@ToString
public class DescribeCenGrantsResponse extends BaseResponseModel {
    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**获取另一页返回结果的 token.*/
    @JsonProperty("NextToken")
    private String NextToken;

    /**云企业网授权的信息*/
    @JsonProperty("CenGrantSet")
    private List<CenGrantSetDto> CenGrantSet;

    @Data
    @ToString
    public static class CenGrantSetDto {
        /**创建时间*/
        @JsonProperty("CreateTime")
        private String CreateTime;

        /**云企业网授权的ID*/
        @JsonProperty("CenGrantId")
        private String CenGrantId;

        /**云企业网的ID*/
        @JsonProperty("CenId")
        private String CenId;

        /**云企业网网络实例ID*/
        @JsonProperty("NetworkInstanceId")
        private String NetworkInstanceId;

        /**网络实例类型*/
        @JsonProperty("InstanceType")
        private String InstanceType;

        /**授权的云企业网账号ID*/
        @JsonProperty("CenAccountId")
        private String CenAccountId;

    }

}
