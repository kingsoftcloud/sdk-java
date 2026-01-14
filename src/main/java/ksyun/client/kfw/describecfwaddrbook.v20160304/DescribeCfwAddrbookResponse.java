package ksyun.client.kfw.describecfwaddrbook.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeCfwAddrbookResponse
* @Description DescribeCfwAddrbook 返回体
*/
@Data
@ToString
public class DescribeCfwAddrbookResponse extends BaseResponseModel {

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("CfwAddrbooks")
    private List<CfwAddrbooksDto> CfwAddrbooks;

    @Data
    @ToString
    public static class CfwAddrbooksDto {
        /***/
        @JsonProperty("AddrbookId")
        private String AddrbookId;

        /***/
        @JsonProperty("AddrbookName")
        private String AddrbookName;

        /***/
        @JsonProperty("IpAddress")
        private List<String> IpAddress;

        /***/
        @JsonProperty("Description")
        private String Description;

        /***/
        @JsonProperty("CitationCount")
        private Integer CitationCount;

        /***/
        @JsonProperty("CreateTime")
        private String CreateTime;

    }

    /***/
    @JsonProperty("NextToken")
    private String NextToken;

    /***/
    @JsonProperty("TotalCount")
    private Integer TotalCount;

}
