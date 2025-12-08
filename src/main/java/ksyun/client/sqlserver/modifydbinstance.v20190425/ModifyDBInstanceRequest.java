package ksyun.client.sqlserver.modifydbinstance.v20190425;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname ModifyDBInstanceRequest
* @Description 请求参数
*/
@Data
public class ModifyDBInstanceRequest{
    /**实例ID*/
    @KsYunField(name="DBInstanceIdentifier")
    private String DBInstanceIdentifier;

    /**实例名称

```json
1-64个字符，支持中文，字母，数字，以及-_
```*/
    @KsYunField(name="DBInstanceName")
    private String DBInstanceName;

}
