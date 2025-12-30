package ksyun.client.epc.describesovpcs.v20151101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeSoVpcsResponse
* @Description DescribeSoVpcs 返回体
*/
@Data
@ToString
public class DescribeSoVpcsResponse extends BaseResponseModel {

    /***/
    @JsonProperty("Vpcs")
    private List<VpcsDto> Vpcs;

    @Data
    @ToString
    public static class VpcsDto {
        /**407caf3c-37c2-4bf9-a4f0-76dd65a40d9f*/
        @JsonProperty("VpcId")
        private String VpcId;

        /**24373992-ad9a-4ea6-9c4f-519cc9afcebe*/
        @JsonProperty("AttachVpcId")
        private String AttachVpcId;

        /**epc-lee-test*/
        @JsonProperty("AttachVpcName")
        private String AttachVpcName;

        /**测试创建lee*/
        @JsonProperty("VpcName")
        private String VpcName;

        /***/
        @JsonProperty("Description")
        private String Description;

        /**192.168.0.0/16*/
        @JsonProperty("CidrBlock")
        private String CidrBlock;

        /**a3bb28f4-ab2d-4873-8243-eb53a6338a6c*/
        @JsonProperty("SubnetIds")
        private List<String> SubnetIds;

        /**0b58d2de-b0b6-41c1-9a08-64b2e159fd79*/
        @JsonProperty("SecurityGroupIds")
        private List<String> SecurityGroupIds;

        /**10.0.0.1*/
        @JsonProperty("DnsServers")
        private List<String> DnsServers;

        /**Available*/
        @JsonProperty("Status")
        private String Status;

        /**2025-07-14T15:20:04+08:00*/
        @JsonProperty("CreationTime")
        private String CreationTime;

        /**2025-07-14T15:20:51+08:00*/
        @JsonProperty("UpdateTime")
        private String UpdateTime;

    }

    /***/
    @JsonProperty("NextToken")
    private String NextToken;

    /**1ded7233-54f8-44d1-a2ea-b6fcc0ca7390*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**true*/
    @JsonProperty("Return")
    private Boolean ReturnField;

}
