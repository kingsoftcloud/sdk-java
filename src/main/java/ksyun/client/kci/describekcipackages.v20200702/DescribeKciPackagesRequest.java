package ksyun.client.kci.describekcipackages.v20200702;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DescribeKciPackagesRequest
 * @Description 请求参数
 */
@Data
public class DescribeKciPackagesRequest {
    /**
     * - HourlyInstantSettlement 按小时结算
     * - Spot 竞价实例
     */
    @KsYunField(name = "ChargeType")
    private String ChargeType;

    /**
     * 可用区
     */
    @KsYunField(name = "AvailabilityZone")
    private String AvailabilityZone;

    /**
     * 当前固定值为RBKCI
     */
    @KsYunField(name = "KciType")
    private String KciType;

}