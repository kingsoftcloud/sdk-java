package ksyun.client.krds.securitygrouprelation.v20200825;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname SecurityGroupRelationRequest
* @Description 请求参数
*/
@Data
public class SecurityGroupRelationRequest{
    /**操作类型		Attach \*/
    @KsYunField(name="RelationAction")
    private String RelationAction;

    /**安全组ID*/
    @KsYunField(name="SecurityGroupId")
    private String SecurityGroupId;

    /**实例ID列表		例如：<br>方式1：DBInstanceIdentifier.0=aaa&DBInstanceIdentifier.1=bbb<br>方式2：DBInstanceIdentifier=aaa,bbb*/
    @KsYunField(name="DBInstanceIdentifier")
    private String DBInstanceIdentifier;


}