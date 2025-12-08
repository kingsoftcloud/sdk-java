package ksyun.client.clickhouse.modifydbparametergroup.v20210101;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname ModifyDBParameterGroupRequest
* @Description 请求参数
*/
@Data
public class ModifyDBParameterGroupRequest{
    /**实例ID。*/
    @KsYunField(name="InstanceId")
    private String InstanceId;

    /**参数变更列表。

```json
请求体中传值(key-value形式放入所有要变更的参数-参数值)。
例如：
{
    "InstanceId": "***",
    "Parameters": {
        "keep_alive_timeout": "500"
    },
    "ConfigType": "Config"
}
```*/
    @KsYunField(name="Parameters")
    private String Parameters;

    /**参数类型。可选：Users，Config。*/
    @KsYunField(name="ConfigType")
    private String ConfigType;

}
