package ksyun.client.postgresql.modifysecuritygrouprulename.v20181225;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname ModifySecurityGroupRuleNameRequest
* @Description 请求参数
*/
@Data
public class ModifySecurityGroupRuleNameRequest{
    /**安全组规则ID*/
    @KsYunField(name="SecurityGroupRuleId")
    private String SecurityGroupRuleId;

    /**安全组规则名称

```json
安全组规则备注，不指定默认''
```*/
    @KsYunField(name="SecurityGroupRuleName")
    private String SecurityGroupRuleName;


}