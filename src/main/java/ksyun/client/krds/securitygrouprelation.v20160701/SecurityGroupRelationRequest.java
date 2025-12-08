package ksyun.client.krds.securitygrouprelation.v20160701;

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
    /**安全组ID*/
    @KsYunField(name="SecurityGroupId")
    private String SecurityGroupId;

    /**安全组操作
Attach：绑定
Dettach：解绑*/
    @KsYunField(name="RelationAction")
    private String RelationAction;

    /**实例ID列表*/
    @KsYunField(name="DBInstanceIdentifier",type=2)
    private List<String> DBInstanceIdentifierList;

}
