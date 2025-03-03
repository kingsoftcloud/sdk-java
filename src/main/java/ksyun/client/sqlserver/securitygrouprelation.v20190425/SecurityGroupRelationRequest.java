package ksyun.client.sqlserver.securitygrouprelation.v20190425;

import common.annotation.KsYunField;
import lombok.Data;

import java.util.List;

/**
 * @Classname SecurityGroupRelationRequest
 * @Description 请求参数
 */
@Data
public class SecurityGroupRelationRequest {
    /**
     * 操作类型
     * <p>
     * ```json
     * Attach | Dettach
     * Attach: 添加实例Id到安全组
     * Dettach：将实例Id从安全组解绑
     * ```
     */
    @KsYunField(name = "RelationAction")
    private String RelationAction;

    /**
     * 安全组ID
     */
    @KsYunField(name = "SecurityGroupId")
    private String SecurityGroupId;

    /**
     * 实例ID列表
     * <p>
     * ```json
     * 方式1：DBInstanceIdentifier.0=aaa&DBInstanceIdentifier.1=bbb
     * 方式2：DBInstanceIdentifier=aaa,bbb
     * ```
     */
    @KsYunField(name = "DBInstanceIdentifier")
    private List<String> DBInstanceIdentifierList;

}