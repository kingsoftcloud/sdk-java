package ksyun.client.epc.describesosubnet.v20151101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeSoSubnetResponse
* @Description DescribeSoSubnet 返回体
*/
@Data
@ToString
public class DescribeSoSubnetResponse extends BaseResponseModel {
    /**1ded7233-54f8-44d1-a2ea-b6fcc0ca7390*/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("Subnets")
    private List<SubnetsDto> Subnets;

    @Data
    @ToString
    public static class SubnetsDto {
        /**65529*/
        @JsonProperty("AvailableIpAddressCount")
        private Integer AvailableIpAddressCount;

        /**192.168.0.0/16*/
        @JsonProperty("CidrBlock")
        private String CidrBlock;

        /**Available*/
        @JsonProperty("Status")
        private String Status;

        /**a3bb28f4-ab2d-4873-8243-eb53a6338a6c*/
        @JsonProperty("SubnetId")
        private String SubnetId;

        /**测试子网lee*/
        @JsonProperty("SubnetName")
        private String SubnetName;

        /**65533*/
        @JsonProperty("TotalIpv4Count")
        private Integer TotalIpv4Count;

        /**2025-07-15T13:46:35+08:00*/
        @JsonProperty("UpdateTime")
        private String UpdateTime;

        /**407caf3c-37c2-4bf9-a4f0-76dd65a40d9f*/
        @JsonProperty("VpcId")
        private String VpcId;

        /**cn-beijing-6a*/
        @JsonProperty("ZoneId")
        private String ZoneId;

    }

    /***/
    @JsonProperty("NextToken")
    private String NextToken;

    /**1*/
    @JsonProperty("TotalCount")
    private Integer TotalCount;

}
