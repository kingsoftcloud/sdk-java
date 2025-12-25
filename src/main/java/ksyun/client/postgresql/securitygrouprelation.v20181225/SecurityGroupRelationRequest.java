package ksyun.client.postgresql.securitygrouprelation.v20181225;

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
    /**操作类型

```json
1.取值范围:Attach|Dettach 
2.Attach: 添加实例Id到安全组 
3.Dettach：将实例Id从安全组解绑
```*/
    @KsYunField(name="RelationAction")
    private String RelationAction;

    /**安全组id*/
    @KsYunField(name="SecurityGroupId")
    private String SecurityGroupId;

    /**实例ID列表，支持批量*/
    @KsYunField(name = "DBInstanceIdentifier", type = 1)
    private List<String> DBInstanceIdentifierList;

}
