package ksyun.client.clickhouse.createsecuritygroup.v20210101;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname CreateSecurityGroupRequest
 * @Description 请求参数
 */
@Data
public class CreateSecurityGroupRequest {
    /**
     * 商品类型：Clickhouse固定取值：523。
     */
    @KsYunField(name = "ProductType")
    private Integer ProductType;

    /**
     * 安全组名称。
     */
    @KsYunField(name = "SecurityGroupName")
    private String SecurityGroupName;

    /**
     * 安全组描述。
     */
    @KsYunField(name = "Description")
    private String Description;

}