package ksyun.client.milvus.describesecuritygroup.v20231010;

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
        /**安全组ID*/
        @JsonProperty("Id")
        private String Id;

        /**安全组名称*/
        @JsonProperty("Name")
        private String Name;

        /**安全组版本，现在仅支持：ipv4*/
        @JsonProperty("IpVersion")
        private String IpVersion;

        /**创建时间*/
        @JsonProperty("CreatedAt")
        private String CreatedAt;

        /**更新时间*/
        @JsonProperty("UpdatedAt")
        private String UpdatedAt;

        /**描述/具体说明*/
        @JsonProperty("Detail")
        private String Detail;

        /**当前安全组规则列表*/
        @JsonProperty("Rules")
        private List<RulesDto> Rules;

        @Data
        @ToString
        public static class RulesDto {
            /**cidr规则*/
            @JsonProperty("Cidr")
            private String Cidr;

            /**描述*/
            @JsonProperty("Detail")
            private String Detail;

            /**规则ID*/
            @JsonProperty("Id")
            private String Id;

            /**创建实例*/
            @JsonProperty("CreatedAt")
            private String CreatedAt;

            /**更新时间*/
            @JsonProperty("UpdatedAt")
            private String UpdatedAt;

        }

        /**当前安全组绑定实例列表*/
        @JsonProperty("Instances")
        private List<InstancesDto> Instances;

        @Data
        @ToString
        public static class InstancesDto {
            /**实例ID*/
            @JsonProperty("Id")
            private String Id;

            /**实例名称*/
            @JsonProperty("Name")
            private String Name;

            /**创建时间*/
            @JsonProperty("CreatedAt")
            private String CreatedAt;

            /**节点ip信息*/
            @JsonProperty("Addresses")
            private List<AddressesDto> Addresses;

            @Data
            @ToString
            public static class AddressesDto {
                /**ip地址*/
                @JsonProperty("Host")
                private String Host;

                /**ip类型： 
vip(仅内网访问)
eip(外网可访问)*/
                @JsonProperty("Type")
                private String Type;

            }

        }

    }

}
