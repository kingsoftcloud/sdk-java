package ksyun.client.epc.describesosecuritygroups.v20151101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeSoSecurityGroupsResponse
* @Description DescribeSoSecurityGroups 返回体
*/
@Data
@ToString
public class DescribeSoSecurityGroupsResponse extends BaseResponseModel {
    /***/
    @JsonProperty("SecurityGroups")
    private List<SecurityGroupsDto> SecurityGroups;

    @Data
    @ToString
    public static class SecurityGroupsDto {
        /**b1b139ff-349b-402c-b23b-4ce2295e5663*/
        @JsonProperty("VpcId")
        private String VpcId;

        /**Default*/
        @JsonProperty("SecurityGroupName")
        private String SecurityGroupName;

        /**默认安全组*/
        @JsonProperty("Description")
        private String Description;

        /**77708c3a-b678-4305-9830-efd4b9ef0e62*/
        @JsonProperty("SecurityGroupId")
        private String SecurityGroupId;

        /**Available*/
        @JsonProperty("Status")
        private String Status;

        /**2025-07-16T14:57:23+08:00*/
        @JsonProperty("CreationTime")
        private String CreationTime;

        /**default*/
        @JsonProperty("Type")
        private String Type;

    }

    /**InNnLTNyNDk2Y2ozZmV0eGM3enJ4OXdncXR4d3ki*/
    @JsonProperty("NextToken")
    private String NextToken;

    /**6d92d1e6-225c-4320-af84-21110b163a38*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**true*/
    @JsonProperty("Return")
    private Boolean ReturnField;

}
