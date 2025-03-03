package ksyun.client.ebs.describeebsinstances.v20160304;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DescribeEbsInstancesRequest
 * @Description 请求参数
 */
@Data
public class DescribeEbsInstancesRequest {
    /**
     * 指定获取某个AZ的可用主机
     */
    @KsYunField(name = "AvailabilityZone")
    private String AvailabilityZone;

    /**
     * 硬盘类型，SSD3.0/EHDD/ESSD_PL0/ESSD_PL1/ESSD_PL2/ESSD_PL3
     */
    @KsYunField(name = "VolumeType")
    private String VolumeType;

}