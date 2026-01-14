package ksyun.client.kfw.describehostbook.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeHostbookResponse
* @Description DescribeHostbook 返回体
*/
@Data
@ToString
public class DescribeHostbookResponse extends BaseResponseModel {

    /**请求Id*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**查询的域名簿对象*/
    @JsonProperty("CfwHostbooks")
    private List<CfwHostbooksDto> CfwHostbooks;

    @Data
    @ToString
    public static class CfwHostbooksDto {
        /***/
        @JsonProperty("HostbookId")
        private String HostbookId;

        /***/
        @JsonProperty("HostbookName")
        private String HostbookName;

        /***/
        @JsonProperty("HostValue")
        private List<String> HostValue;

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

    /**获取另一页返回结果的 token*/
    @JsonProperty("NextToken")
    private String NextToken;

    /**总条数*/
    @JsonProperty("TotalCount")
    private Integer TotalCount;

}
