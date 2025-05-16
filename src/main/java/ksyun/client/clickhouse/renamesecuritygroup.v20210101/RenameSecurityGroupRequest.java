package ksyun.client.clickhouse.renamesecuritygroup.v20210101;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname RenameSecurityGroupRequest
 * @Description 请求参数
 */
@Data
public class RenameSecurityGroupRequest {
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
     * 安全组新名称。名称和描述至少传一个，否则名称或描述不会变更。
     */
    @KsYunField(name = "SecurityGroupName")
    private String SecurityGroupName;

    /**
     * 安全组新描述。名称和描述至少传一个，否则名称或描述不会变更。
     */
    @KsYunField(name = "Description")
    private String Description;

}