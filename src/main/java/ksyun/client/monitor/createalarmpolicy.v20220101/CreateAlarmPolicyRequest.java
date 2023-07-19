package ksyun.client.monitor.createalarmpolicy.v20220101;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname CreateAlarmPolicyRequest
* @Description 请求参数
*/
@Data
public class CreateAlarmPolicyRequest{
    /**策略名称	*/
    @KsYunField(name="PolicyName")
    private String PolicyName;

    /**云服务类别，详见 [云服务类别](云服务类别)*/
    @KsYunField(name="ProductType")
    private Integer ProductType;

    /**策略类型。取值：
- 0：普通策略 
- 1：默认策略	*/
    @KsYunField(name="PolicyType")
    private Integer PolicyType;

    /**策略所关联资源，绑定方式。取值： 
- 1：全部实例
- 2：按照项目组维度
- 3：自选实例*/
    @KsYunField(name="ResourceBindType")
    private Integer ResourceBindType;

    /**项目组ID。 

> **注意**：有且当 ResourceBindType=2时，该字段必填

*/
    @KsYunField(name="ProjectId")
    private Integer ProjectId;

    /**实例ID。

> **注意：** 有且当 ResourceBindType=3时，该字段必填	*/
    @KsYunField(name="InstanceIds",type=2)
    private List<String> InstanceIdsList;

    /**配置触发告警的规则列表*/
    @KsYunField(name="TriggerRules",type=2)
    private List<TriggerRulesDto> TriggerRulesList;

    @Data
    @ToString
    public static class TriggerRulesDto {
        /**统计周期，单位：分钟。取值：

- 1分钟：1m
- 5分钟：5m
- 1小时：60m*/
        private String Period;
        /**告警统计方法。取值：
- 平均：avg
- 最大：max
- 最小：min
- 求和：sum	*/
        private String Method;
        /**阈值比较符。取值：
- `=`：等于
- `>`：大于
- `<`：小于
- `GreaterThanLastPeriod`：周期环比上涨
- `LessThanLastPeriod`：周期环比下降*/
        private String Compare;
        /**触发告警的阈值*/
        private String TriggerValue;
        /**监控项名称。如：CPU利用率*/
        private String ItemName;
        /**监控项。如：`cpu.utilizition.total`, 详情 [获取指标接口](https://docs.ksyun.com/documents/43?type=3)*/
        private String ItemKey;
        /**监控项单位。如：%	*/
        private String Units;
        /**连续触发周期。*/
        private Integer Points;
        /**策略生效开始时间点，如：00:00。*/
        private String EffectBT;
        /**策略生效结束时间点，如：23:59。*/
        private String EffectET;
        /**告警间隔，单位：分钟，如5、10、30。	*/
        private Integer Interval;
        /**最大发送报警次数，取值范围:1~5。	*/
        private Integer MaxCount;
    }

    /**绑定告警联系人/联系组列表*/
    @KsYunField(name="UserNotice",type=2)
    private List<UserNoticeDto> UserNoticeList;

    @Data
    @ToString
    public static class UserNoticeDto {
        /**告警通知方式。取值：
- 1: 发送邮件 
- 2: 发送短信 
- 3: 发送邮件和短信	*/
        private Integer ContactWay;
        /**告警联系人类型。取值：
- 1: 联系组 
- 2: 联系人	*/
        private Integer ContactFlag;
        /**联系人ID/联系组ID, 详见[获取联系人](https://docs.ksyun.com/documents/40353)、[获取联系组](https://docs.ksyun.com/documents/40352)*/
        private Integer ContactId;
    }

    /**告警回调Webhook地址。
> **注意：** 最多可添加5个回调地址。*/
    @KsYunField(name="URLNotice",type=2)
    private List<String> URLNoticeList;


}