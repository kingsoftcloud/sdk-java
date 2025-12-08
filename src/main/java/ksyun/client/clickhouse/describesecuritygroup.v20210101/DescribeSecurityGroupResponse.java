package ksyun.client.clickhouse.describesecuritygroup.v20210101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeSecurityGroupResponse
* @Description DescribeSecurityGroup 返回体
*/
@Data
@ToString
public class DescribeSecurityGroupResponse extends BaseResponseModel {
    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("Code")
    private String Code;

    /***/
    @JsonProperty("Message")
    private String Message;

    /***/
    @JsonProperty("Data")
    private DataDto Data;

    @Data
    @ToString
    public static class DataDto {
        /***/
        @JsonProperty("SecurityGroupId")
        private String SecurityGroupId;

        /***/
        @JsonProperty("SecurityGroupName")
        private String SecurityGroupName;

        /***/
        @JsonProperty("IpVersion")
        private String IpVersion;

        /***/
        @JsonProperty("Description")
        private String Description;

        /***/
        @JsonProperty("InstanceCount")
        private Integer InstanceCount;

        /***/
        @JsonProperty("CreateTime")
        private String CreateTime;

        /***/
        @JsonProperty("UpdateTime")
        private String UpdateTime;

        /***/
        @JsonProperty("Rules")
        private List<RulesDto> Rules;

        @Data
        @ToString
        public static class RulesDto {
            /***/
            @JsonProperty("RuleId")
            private String RuleId;

            /***/
            @JsonProperty("Cidr")
            private String Cidr;

            /***/
            @JsonProperty("CreateTime")
            private String CreateTime;

            /***/
            @JsonProperty("Description")
            private String Description;

        }

        /***/
        @JsonProperty("Instances")
        private List<InstancesDto> Instances;

        @Data
        @ToString
        public static class InstancesDto {
            /***/
            @JsonProperty("InstanceId")
            private String InstanceId;

            /***/
            @JsonProperty("InstanceName")
            private String InstanceName;

            /***/
            @JsonProperty("ProductType")
            private Integer ProductType;

            /***/
            @JsonProperty("ProductTypeName")
            private String ProductTypeName;

            /***/
            @JsonProperty("Vip")
            private String Vip;

            /***/
            @JsonProperty("CreateTime")
            private String CreateTime;

            /***/
            @JsonProperty("Status")
            private String Status;

            /***/
            @JsonProperty("UpdatetTime")
            private String UpdatetTime;

        }

    }

}
