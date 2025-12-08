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
    /**Attach | Dettach Attach: 添加实例Id到安全组 Dettach：将实例Id从安全组解绑*/
    @KsYunField(name="RelationAction")
    private String RelationAction;

    /**安全组ID

单独操作传递此值*/
    @KsYunField(name="SecurityGroupId")
    private String SecurityGroupId;

    /**安全组ID列表

若批量操作则传递此值*/
    @KsYunField(name="SecurityGroupIds")
    private String SecurityGroupIds;

    /**实例ID列表		例如：<br>方式1：DBInstanceIdentifier.0=aaa&DBInstanceIdentifier.1=bbb<br>方式2：DBInstanceIdentifier=aaa,bbb*/
    @KsYunField(name="DBInstanceIdentifier")
    private String DBInstanceIdentifier;

}
