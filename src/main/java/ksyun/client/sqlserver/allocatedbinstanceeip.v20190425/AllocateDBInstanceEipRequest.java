package ksyun.client.sqlserver.allocatedbinstanceeip.v20190425;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname AllocateDBInstanceEipRequest
* @Description 请求参数
*/
@Data
public class AllocateDBInstanceEipRequest{
    /**实例ID*/
    @KsYunField(name="DBInstanceIdentifier")
    private String DBInstanceIdentifier;

    /**放行端口号

```json
注意：[10000,65500]
```*/
    @KsYunField(name="Port")
    private String Port;

}
