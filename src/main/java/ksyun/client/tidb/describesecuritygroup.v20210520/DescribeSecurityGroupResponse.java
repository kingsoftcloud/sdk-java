package ksyun.client.tidb.describesecuritygroup.v20210520;

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
        @JsonProperty("SecurityGroupId")
        private String SecurityGroupId;

        /**安全组名称*/
        @JsonProperty("SecurityGroupName")
        private String SecurityGroupName;

        /**集群类型*/
        @JsonProperty("GroupType")
        private String GroupType;

        /**安全组类型*/
        @JsonProperty("IpVersion")
        private String IpVersion;

        /**安全组描述*/
        @JsonProperty("Description")
        private String Description;

        /**关联实例数*/
        @JsonProperty("InstanceCount")
        private Integer InstanceCount;

        /**创建时间*/
        @JsonProperty("CreateTime")
        private String CreateTime;

        /**更新时间*/
        @JsonProperty("UpdateTime")
        private String UpdateTime;

        /***/
        @JsonProperty("Rules")
        private List<RulesDto> Rules;

        @Data
        @ToString
        public static class RulesDto {
            /**ip类型*/
            @JsonProperty("ipVersion")
            private String IpVersion;

            /**协议*/
            @JsonProperty("protocol")
            private String Protocol;

            /**是否接受*/
            @JsonProperty("action")
            private String Action;

            /**优先级*/
            @JsonProperty("priority")
            private Integer Priority;

            /**规则ID*/
            @JsonProperty("RuleId")
            private String RuleId;

            /**地址*/
            @JsonProperty("Cidr")
            private String Cidr;

            /**规则描述*/
            @JsonProperty("Description")
            private String Description;

            /**绑定时间*/
            @JsonProperty("CreateTime")
            private String CreateTime;

            /**更新时间*/
            @JsonProperty("UpdateTime")
            private String UpdateTime;

        }

        /***/
        @JsonProperty("Instances")
        private List<InstancesDto> Instances;

        @Data
        @ToString
        public static class InstancesDto {
            /**实例ID*/
            @JsonProperty("InstanceId")
            private String InstanceId;

            /**实例名称*/
            @JsonProperty("InstanceName")
            private String InstanceName;

            /**商品类型*/
            @JsonProperty("ProductType")
            private Integer ProductType;

            /**商品类型名称*/
            @JsonProperty("ProductTypeName")
            private String ProductTypeName;

            /**绑定时间*/
            @JsonProperty("CreateTime")
            private String CreateTime;

            /**更新时间*/
            @JsonProperty("UpdateTime")
            private String UpdateTime;

            /**tidb服务IP*/
            @JsonProperty("ClientIp")
            private String ClientIp;

            /**tidb服务端口*/
            @JsonProperty("ClientPort")
            private String ClientPort;

        }

    }

}
