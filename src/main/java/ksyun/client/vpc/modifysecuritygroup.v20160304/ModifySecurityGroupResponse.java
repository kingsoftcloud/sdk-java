package ksyun.client.vpc.modifysecuritygroup.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ModifySecurityGroupResponse
* @Description ModifySecurityGroup 返回体
*/
@Data
@ToString
public class ModifySecurityGroupResponse extends BaseResponseModel {
    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**创建时间*/
    @JsonProperty("CreateTime")
    private String CreateTime;

    /**Vpc的ID*/
    @JsonProperty("VpcId")
    private String VpcId;

    /**安全组的名称*/
    @JsonProperty("SecurityGroupName")
    private String SecurityGroupName;

    /**安全组的ID*/
    @JsonProperty("SecurityGroupId")
    private String SecurityGroupId;

    /**安全组的描述*/
    @JsonProperty("Description")
    private String Description;

    /**安全组的类型*/
    @JsonProperty("SecurityGroupType")
    private String SecurityGroupType;

    /**安全组规则的信息*/
    @JsonProperty("SecurityGroupEntrySet")
    private List<SecurityGroupEntrySetDto> SecurityGroupEntrySet;

    @Data
    @ToString
    public static class SecurityGroupEntrySetDto {
        /**创建时间*/
        @JsonProperty("CreateTime")
        private String CreateTime;

        /**安全组规则的描述*/
        @JsonProperty("Description")
        private String Description;

        /**安全组规则的ID*/
        @JsonProperty("SecurityGroupEntryId")
        private String SecurityGroupEntryId;

        /**安全组规则的网段*/
        @JsonProperty("CidrBlock")
        private String CidrBlock;

        /**安全组规则方向，in为入站规则，out为出站规则*/
        @JsonProperty("Direction")
        private String Direction;

        /**协议，IP代表所有协议*/
        @JsonProperty("Protocol")
        private String Protocol;

        /**ICMP协议，ICMP类型*/
        @JsonProperty("IcmpType")
        private Integer IcmpType;

        /**ICMP协议，ICMP代码*/
        @JsonProperty("IcmpCode")
        private Integer IcmpCode;

        /**TCP或UDP协议的端口规则起始端口*/
        @JsonProperty("PortRangeFrom")
        private Integer PortRangeFrom;

        /**TCP或UDP协议的端口规则结束端口*/
        @JsonProperty("PortRangeTo")
        private Integer PortRangeTo;

        /**规则标签*/
        @JsonProperty("RuleTag")
        private String RuleTag;

        /**优先级*/
        @JsonProperty("Priority")
        private Integer Priority;

        /**访问权限*/
        @JsonProperty("Policy")
        private String Policy;

    }

}
