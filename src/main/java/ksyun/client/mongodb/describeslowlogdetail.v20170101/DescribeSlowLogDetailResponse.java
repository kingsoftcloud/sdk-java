package ksyun.client.mongodb.describeslowlogdetail.v20170101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeSlowLogDetailResponse
* @Description DescribeSlowLogDetail 返回体
*/
@Data
@ToString
public class DescribeSlowLogDetailResponse extends BaseResponseModel {

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("data")
    private List<DataDto> Data;

    @Data
    @ToString
    public static class DataDto {
        /***/
        @JsonProperty("processingTime")
        private String ProcessingTime;

        /***/
        @JsonProperty("nameSpace")
        private String NameSpace;

        /***/
        @JsonProperty("content")
        private String Content;

        /***/
        @JsonProperty("client")
        private String Client;

        /***/
        @JsonProperty("user")
        private String User;

        /***/
        @JsonProperty("docsExamined")
        private String DocsExamined;

        /***/
        @JsonProperty("keysExamined")
        private String KeysExamined;

        /***/
        @JsonProperty("keysUpdates")
        private String KeysUpdates;

        /***/
        @JsonProperty("nreturned")
        private String Nreturned;

        /***/
        @JsonProperty("responseLength")
        private String ResponseLength;

        /***/
        @JsonProperty("millis")
        private String Millis;

    }

    /***/
    @JsonProperty("marker")
    private Integer Marker;

    /***/
    @JsonProperty("maxRecords")
    private Integer MaxRecords;

    /***/
    @JsonProperty("Total")
    private Integer Total;

}
