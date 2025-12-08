package ksyun.client.ked.queryruledetail.v20250501;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname QueryRuledetailResponse
* @Description QueryRuledetail 返回体
*/
@Data
@ToString
public class QueryRuledetailResponse extends BaseResponseModel {
    /***/
    @JsonProperty("message")
    private String Message;

    /**成功为0 其他错误码单独给出*/
    @JsonProperty("code")
    private Integer Code;

    /**请求唯一id错误时候显示到前端界面中*/
    @JsonProperty("requestId")
    private String RequestId;

    /***/
    @JsonProperty("data")
    private DataDto Data;

    @Data
    @ToString
    public static class DataDto {
        /**安全组名称*/
        @JsonProperty("name")
        private String Name;

        /**创建时间*/
        @JsonProperty("createTime")
        private String CreateTime;

        /**安全组描述*/
        @JsonProperty("description")
        private String Description;

        /**安全组策略列表*/
        @JsonProperty("securityGroupPolicies")
        private List<SecurityGroupPoliciesDto> SecurityGroupPolicies;

        @Data
        @ToString
        public static class SecurityGroupPoliciesDto {
            /**协议*/
            @JsonProperty("protocol")
            private String Protocol;

            /**备注*/
            @JsonProperty("description")
            private String Description;

            /**目的端口结尾*/
            @JsonProperty("maxPortRange")
            private Integer MaxPortRange;

            /**目的端口起始*/
            @JsonProperty("minPortRange")
            private Integer MinPortRange;

            /**安全组策略ID*/
            @JsonProperty("securityGroupPolicyId")
            private Integer SecurityGroupPolicyId;

            /**方向，in为流入，out为流出*/
            @JsonProperty("direction")
            private String Direction;

            /**安全组id*/
            @JsonProperty("securityGroupId")
            private String SecurityGroupId;

        }

    }

}
