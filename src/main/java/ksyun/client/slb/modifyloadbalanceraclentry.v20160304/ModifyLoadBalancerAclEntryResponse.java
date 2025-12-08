package ksyun.client.slb.modifyloadbalanceraclentry.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ModifyLoadBalancerAclEntryResponse
* @Description ModifyLoadBalancerAclEntry 返回体
*/
@Data
@ToString
public class ModifyLoadBalancerAclEntryResponse extends BaseResponseModel {
    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**LoadBalancerAcl规则信息*/
    @JsonProperty("LoadBalancerAclEntry")
    private LoadBalancerAclEntryDto LoadBalancerAclEntry;

    @Data
    @ToString
    public static class LoadBalancerAclEntryDto {
        /**ACL的ID*/
        @JsonProperty("LoadBalancerAclId")
        private String LoadBalancerAclId;

        /**ACL规则ID*/
        @JsonProperty("LoadBalancerAclEntryId")
        private String LoadBalancerAclEntryId;

        /**LoadBalancerAcl规则的网段*/
        @JsonProperty("CidrBlock")
        private String CidrBlock;

        /**LoadBalancerAcl规则优先级，1-32766，数字越小优先级越高*/
        @JsonProperty("RuleNumber")
        private Integer RuleNumber;

        /**LoadBalancerAcl规则行为，接受(allow)，拒绝(deny)*/
        @JsonProperty("RuleAction")
        private String RuleAction;

        /**协议，IP代表所有协议*/
        @JsonProperty("Protocol")
        private String Protocol;

        /**描述*/
        @JsonProperty("Description")
        private String Description;

    }

}
