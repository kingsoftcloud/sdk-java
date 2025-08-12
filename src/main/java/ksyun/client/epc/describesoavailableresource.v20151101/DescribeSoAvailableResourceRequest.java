package ksyun.client.epc.describesoavailableresource.v20151101;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname DescribeSoAvailableResourceRequest
 * @Description 请求参数
 */
@Data
public class DescribeSoAvailableResourceRequest {
    /**
     * 资源的计费类型。取值：
     * • 包年包月Monthly
     * • 按日月结Daily
     * • 试用Trial
     * 示例值：Daily
     */
    @KsYunField(name = "InstanceChargeType")
    private String InstanceChargeType;

    /**
     * 指定一个要查询的实例规格。
     * 示例值：SO-GM404-I
     */
    @KsYunField(name = "InstanceTypeId")
    private String InstanceTypeId;

    /**
     * 可用区ID。
     * 说明：默认为空，表示返回当前地域（RegionId）下的所有可用区中所有符合条件的资源。
     * 示例值：cn-beijing-6a
     */
    @KsYunField(name = "ZoneId")
    private String ZoneId;

}