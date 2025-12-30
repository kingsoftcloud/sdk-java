package ksyun.client.cen.describecens.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeCensResponse
* @Description DescribeCens 返回体
*/
@Data
@ToString
public class DescribeCensResponse extends BaseResponseModel {

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**获取另一页返回结果的 token.*/
    @JsonProperty("NextToken")
    private String NextToken;

    /**云企业网的信息*/
    @JsonProperty("CenSet")
    private List<CenSetDto> CenSet;

    @Data
    @ToString
    public static class CenSetDto {
        /**创建时间*/
        @JsonProperty("CreateTime")
        private String CreateTime;

        /**云企业网的ID*/
        @JsonProperty("CenId")
        private String CenId;

        /**云企业网的名称*/
        @JsonProperty("CenName")
        private String CenName;

        /**云企业网的描述信息*/
        @JsonProperty("Description")
        private String Description;

    }

}
