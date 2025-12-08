package ksyun.client.kead.describeblockip.v20200101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeBlockIpResponse
* @Description DescribeBlockIp 返回体
*/
@Data
@ToString
public class DescribeBlockIpResponse extends BaseResponseModel {
    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("BlockIpSet")
    private List<BlockIpSetDto> BlockIpSet;

    @Data
    @ToString
    public static class BlockIpSetDto {
        /***/
        @JsonProperty("Ip")
        private String Ip;

        /***/
        @JsonProperty("InBps")
        private String InBps;

        /***/
        @JsonProperty("AttackType")
        private String AttackType;

        /***/
        @JsonProperty("InstanceType")
        private String InstanceType;

        /***/
        @JsonProperty("InstanceName")
        private String InstanceName;

        /***/
        @JsonProperty("RegionCode")
        private String RegionCode;

        /***/
        @JsonProperty("RegionName")
        private String RegionName;

        /***/
        @JsonProperty("RegionEnName")
        private String RegionEnName;

        /***/
        @JsonProperty("Status")
        private String Status;

        /***/
        @JsonProperty("BlockTime")
        private String BlockTime;

        /***/
        @JsonProperty("UnblockTime")
        private String UnblockTime;

        /***/
        @JsonProperty("PlanUnblockTime")
        private String PlanUnblockTime;

    }

    /***/
    @JsonProperty("RegionSet")
    private List<RegionSetDto> RegionSet;

    @Data
    @ToString
    public static class RegionSetDto {
        /***/
        @JsonProperty("RegionCode")
        private String RegionCode;

        /***/
        @JsonProperty("RegionName")
        private String RegionName;

        /***/
        @JsonProperty("RegionEnName")
        private String RegionEnName;

    }

    /***/
    @JsonProperty("ResourceSet")
    private List<String> ResourceSet;

    /***/
    @JsonProperty("BlockIpCount")
    private String BlockIpCount;

}
