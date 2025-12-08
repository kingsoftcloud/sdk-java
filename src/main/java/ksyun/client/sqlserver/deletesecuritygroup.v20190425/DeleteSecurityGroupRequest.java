package ksyun.client.sqlserver.deletesecuritygroup.v20190425;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DeleteSecurityGroupRequest
* @Description 请求参数
*/
@Data
public class DeleteSecurityGroupRequest{
    /**安全组ID

```json
安全组ID，支持批量删除，每个ID中间用英文 ”,“  隔开
```*/
    @KsYunField(name="SecurityGroupIds")
    private String SecurityGroupIds;

}
