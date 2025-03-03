package ksyun.client.clickhouse.rebindsecuritygroup.v20210101;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname RebindSecurityGroupRequest
 * @Description 请求参数
 */
@Data
public class RebindSecurityGroupRequest {
    /**
     * 商品类型：Clickhouse固定取值：523。
     */
    @KsYunField(name = "ProductType")
    private Integer ProductType;

    /**
     * 安全组ID。
     */
    @KsYunField(name = "SecurityGroupId")
    private String SecurityGroupId;

    /**
     * 实例ID。
     */
    @KsYunField(name = "InstanceId")
    private String InstanceId;

}