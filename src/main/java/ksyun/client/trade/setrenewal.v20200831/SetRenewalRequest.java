package ksyun.client.trade.setrenewal.v20200831;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname SetRenewalRequest
 * @Description 请求参数
 */
@Data
public class SetRenewalRequest {
    /**
     * 实例id, 多个英文逗号隔开
     */
    @KsYunField(name = "InstanceIds")
    private String InstanceIds;

    /**
     * 续费策略， 0 手动续费 1 自动续费
     */
    @KsYunField(name = "RenewStrategy")
    private Integer RenewStrategy;

    /**
     * 续费时长（月）
     * 当renewStrategy为0时，非必填，当renewStrategy为1时，必填。
     */
    @KsYunField(name = "RenewDuration")
    private Integer RenewDuration;

}