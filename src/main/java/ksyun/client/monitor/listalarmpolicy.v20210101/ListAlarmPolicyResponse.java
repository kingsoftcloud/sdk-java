package ksyun.client.monitor.listalarmpolicy.v20210101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ListAlarmPolicyResponse
* @Description ListAlarmPolicy 返回体
*/
@Data
@ToString
public class ListAlarmPolicyResponse extends BaseResponseModel {
    /***/
    @JsonProperty("data")
    private DataDto Data;

    @Data
    @ToString
    public static class DataDto {
        /***/
        @JsonProperty("alarmPolicyList")
        private List<DataDtoAlarmPolicyListDto> AlarmPolicyList;

        @Data
        @ToString
        public static class DataDtoAlarmPolicyListDto {
            /**策略ID*/
            @JsonProperty("policyId")
            private Integer PolicyId;

            /**策略名称*/
            @JsonProperty("policyName")
            private String PolicyName;

            /**产品ID，详情 [获取产品列表](https://docs.ksyun.com/documents/42040?type=3)*/
            @JsonProperty("productType")
            private String ProductType;

            /**策略类型。取值：
- 0：普通策略
- 1：默认策略*/
            @JsonProperty("policyType")
            private String PolicyType;

            /**策略状态。取值：
- 0：启用
- 1：禁用*/
            @JsonProperty("enabled")
            private String Enabled;

            /**策略关联的实例数量*/
            @JsonProperty("instanceInfoCount")
            private Integer InstanceInfoCount;

            /**策略关联的告警规则数量*/
            @JsonProperty("triggerRuleCount")
            private Integer TriggerRuleCount;

            /**策略关联的联系人数量*/
            @JsonProperty("contactInfoCount")
            private Integer ContactInfoCount;

            /**告警回调地址*/
            @JsonProperty("callbackUrl")
            private String CallbackUrl;

        }

    }

    /**总记录数*/
    @JsonProperty("totalCount")
    private Integer TotalCount;

    /**请求ID*/
    @JsonProperty("requestId")
    private String RequestId;

}
