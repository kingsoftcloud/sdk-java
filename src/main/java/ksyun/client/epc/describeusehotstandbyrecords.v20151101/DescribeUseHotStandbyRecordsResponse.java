package ksyun.client.epc.describeusehotstandbyrecords.v20151101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeUseHotStandbyRecordsResponse
* @Description DescribeUseHotStandbyRecords 返回体
*/
@Data
@ToString
public class DescribeUseHotStandbyRecordsResponse extends BaseResponseModel {

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("NextToken")
    private String NextToken;

    /***/
    @JsonProperty("TotalCount")
    private Integer TotalCount;

    /***/
    @JsonProperty("UseHotStandbyRecordsSet")
    private List<UseHotStandbyRecordsSetDto> UseHotStandbyRecordsSet;

    @Data
    @ToString
    public static class UseHotStandbyRecordsSetDto {
        /***/
        @JsonProperty("FaultHostName")
        private String FaultHostName;

        /***/
        @JsonProperty("FaultInstanceId")
        private String FaultInstanceId;

        /***/
        @JsonProperty("FaultSn")
        private String FaultSn;

        /***/
        @JsonProperty("FaultHostType")
        private String FaultHostType;

        /***/
        @JsonProperty("FaultPrivateIp")
        private String FaultPrivateIp;

        /***/
        @JsonProperty("FaultEip")
        private String FaultEip;

        /***/
        @JsonProperty("ReplaceType")
        private String ReplaceType;

        /***/
        @JsonProperty("HotStandbyHostName")
        private String HotStandbyHostName;

        /***/
        @JsonProperty("HotStandbyInstanceId")
        private String HotStandbyInstanceId;

        /***/
        @JsonProperty("HotStandbySn")
        private String HotStandbySn;

        /***/
        @JsonProperty("HotStandbyHostType")
        private String HotStandbyHostType;

        /***/
        @JsonProperty("HotStandbyPrivateIp")
        private String HotStandbyPrivateIp;

        /***/
        @JsonProperty("HotStandbyEip")
        private String HotStandbyEip;

        /***/
        @JsonProperty("CreateTime")
        private String CreateTime;

    }

}
