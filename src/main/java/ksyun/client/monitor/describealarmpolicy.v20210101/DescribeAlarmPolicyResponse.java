package ksyun.client.monitor.describealarmpolicy.v20210101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeAlarmPolicyResponse
* @Description DescribeAlarmPolicy 返回体
*/
@Data
@ToString
public class DescribeAlarmPolicyResponse extends BaseResponseModel {
    /***/
    @JsonProperty("data")
    private DataDto Data;

    @Data
    @ToString
    public static class DataDto {
        /**告警策略列表*/
        @JsonProperty("alarmPolicyList")
        private List<AlarmPolicyListDto> AlarmPolicyList;

        @Data
        @ToString
        public static class AlarmPolicyListDto {
            /**策略ID*/
            @JsonProperty("policyId")
            private Integer PolicyId;

            /**策略名称*/
            @JsonProperty("policyName")
            private String PolicyName;

            /**	
云服务类别，详见 [云服务类别](https://docs.ksyun.com/documents/42040?type=3)*/
            @JsonProperty("productType")
            private Integer ProductType;

            /**策略类型。取值：
- 0：普通策略
- 1：默认策略
*/
            @JsonProperty("policyType")
            private Integer PolicyType;

            /**策略状态。取值：
- 0：启用
- 1：禁用*/
            @JsonProperty("enabled")
            private Integer Enabled;

            /**策略关联的实例数量*/
            @JsonProperty("InstanceInfoCount")
            private Integer InstanceInfoCount;

            /**告警规则列表*/
            @JsonProperty("triggerRuleList")
            private List<TriggerRuleListDto> TriggerRuleList;

            @Data
            @ToString
            public static class TriggerRuleListDto {
                /**规则ID*/
                @JsonProperty("triggerId")
                private Integer TriggerId;

                /**统计周期，单位：分钟。取值：

- 1分钟：1m
- 5分钟：5m
- 1小时：60m*/
                @JsonProperty("period")
                private String Period;

                /**告警统计方法。取值：
- 平均：avg
- 最大：max
- 最小：min
- 求和：sum*/
                @JsonProperty("method")
                private String Method;

                /**阈值比较符。取值：

- `=`：等于
- `>`：大于
- `<`：小于
- `GreaterThanLastPeriod`：周期环比上涨
- `LessThanLastPeriod`：周期环比下降*/
                @JsonProperty("compare")
                private String Compare;

                /**触发告警的阈值。*/
                @JsonProperty("triggerValue")
                private String TriggerValue;

                /**监控项名称。*/
                @JsonProperty("itemName")
                private String ItemName;

                /**监控项。
*/
                @JsonProperty("itemKey")
                private String ItemKey;

                /**单位*/
                @JsonProperty("units")
                private String Units;

                /**策略生效开始时间点。*/
                @JsonProperty("effectBT")
                private String EffectBT;

                /**策略生效结束时间点。*/
                @JsonProperty("effectET")
                private String EffectET;

                /**维度标签*/
                @JsonProperty("tags")
                private String Tags;

                /**告警间隔，单位：分钟，如5、10、30。

*/
                @JsonProperty("interval")
                private String Interval;

                /**	
连续触发周期。*/
                @JsonProperty("points")
                private Integer Points;

                /**最大发送报警次数，取值范围:1~5。*/
                @JsonProperty("maxCount")
                private Integer MaxCount;

            }

            /***/
            @JsonProperty("contactInfoList")
            private List<ContactInfoListDto> ContactInfoList;

            @Data
            @ToString
            public static class ContactInfoListDto {
                /**告警联系人ID或告警联系组ID*/
                @JsonProperty("contactId")
                private Integer ContactId;

                /**告警联系人/告警联系组名称*/
                @JsonProperty("contactName")
                private String ContactName;

                /**告警通知方式。取值：
- 1: 发送邮件
- 2: 发送短信
- 3: 发送邮件和短信*/
                @JsonProperty("contactWay")
                private Integer ContactWay;

                /**告警联系人类型。取值：
- 1: 联系组
- 2: 联系人*/
                @JsonProperty("contactFlag")
                private Integer ContactFlag;

            }

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
