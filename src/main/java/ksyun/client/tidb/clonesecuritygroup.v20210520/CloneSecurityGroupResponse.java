package ksyun.client.tidb.clonesecuritygroup.v20210520;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname CloneSecurityGroupResponse
* @Description CloneSecurityGroup 返回体
*/
@Data
@ToString
public class CloneSecurityGroupResponse extends BaseResponseModel {

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("Data")
    private DataDto Data;

    @Data
    @ToString
    public static class DataDto {
        /**安全组id*/
        @JsonProperty("SecurityGroupId")
        private String SecurityGroupId;

        /**安全组名称*/
        @JsonProperty("SecurityGroupName")
        private String SecurityGroupName;

        /**安全组类型*/
        @JsonProperty("GroupType")
        private String GroupType;

        /**ip版本*/
        @JsonProperty("IpVersion")
        private String IpVersion;

        /**安全组描述*/
        @JsonProperty("Description")
        private String Description;

        /**绑定实例数*/
        @JsonProperty("InstanceCount")
        private Integer InstanceCount;

        /**创建时间*/
        @JsonProperty("CreateTime")
        private String CreateTime;

        /**更新时间*/
        @JsonProperty("UpdateTime")
        private String UpdateTime;

        /**cidr地址*/
        @JsonProperty("Rules")
        private List<DataRulesDto> Rules;

        @Data
        @ToString
        public static class DataRulesDto {
            /**规则版本*/
            @JsonProperty("ipVersion")
            private String IpVersion;

            /**规则协议*/
            @JsonProperty("protocol")
            private String Protocol;

            /**是否支持*/
            @JsonProperty("action")
            private String Action;

            /**优先级*/
            @JsonProperty("priority")
            private Integer Priority;

            /**规则id*/
            @JsonProperty("RuleId")
            private String RuleId;

            /**规则地址*/
            @JsonProperty("Cidr")
            private String Cidr;

            /**规则描述*/
            @JsonProperty("Description")
            private String Description;

            /***/
            @JsonProperty("CreateTime")
            private String CreateTime;

            /***/
            @JsonProperty("UpdateTime")
            private String UpdateTime;

        }

        /***/
        @JsonProperty("Instances")
        private String Instances;

    }

}
