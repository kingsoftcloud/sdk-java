package ksyun.client.epc.describexiddetails.v20151101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeXidDetailsResponse
* @Description DescribeXidDetails 返回体
*/
@Data
@ToString
public class DescribeXidDetailsResponse extends BaseResponseModel {

    /***/
    @JsonProperty("XidDetailSet")
    private List<XidDetailSetDto> XidDetailSet;

    @Data
    @ToString
    public static class XidDetailSetDto {
        /***/
        @JsonProperty("InstanceId")
        private String InstanceId;

        /***/
        @JsonProperty("InstanceName")
        private String InstanceName;

        /***/
        @JsonProperty("Sn")
        private String Sn;

        /***/
        @JsonProperty("EventName")
        private String EventName;

        /***/
        @JsonProperty("EventTime")
        private String EventTime;

        /***/
        @JsonProperty("KcmName")
        private String KcmName;

        /***/
        @JsonProperty("Xid")
        private String Xid;

        /***/
        @JsonProperty("EventMsg")
        private String EventMsg;

    }

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("TotalCount")
    private Integer TotalCount;

    /***/
    @JsonProperty("NextToken")
    private String NextToken;

}
