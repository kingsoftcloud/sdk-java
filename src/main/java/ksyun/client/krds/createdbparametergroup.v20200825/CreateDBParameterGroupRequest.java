package ksyun.client.krds.createdbparametergroup.v20200825;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname CreateDBParameterGroupRequest
* @Description 请求参数
*/
@Data
public class CreateDBParameterGroupRequest{
    /**参数组名称*/
    @KsYunField(name="DBParameterGroupName")
    private String DBParameterGroupName;

    /**数据库引擎名称 不同的数据库引擎，需要不同的数据库参数组
```json
Engine与EngineVersion的对应关系：
mysql 5.5、5.6、5.7、8.0
percona 5.6
consistent_mysql 5.7
ebs_mysql 5.6、5.7
```*/
    @KsYunField(name="Engine")
    private String Engine;

    /**数据库引擎版本*/
    @KsYunField(name="EngineVersion")
    private String EngineVersion;

    /**参数组描述*/
    @KsYunField(name="Description")
    private String Description;

    /**参数值

```json
模拟请求入参：
{
    "Engine": "mysql",
    "EngineVersion": "5.7",
    "Parameters": {
        "delay_key_write": "ON",
        "table_open_cache_instances": 16
    },
    "DBParameterGroupName": "db-drds-openapi-2",
    "Description": "db-drds-openapi-2"
}
```*/
    @KsYunField(name="Parameters")
    private ParametersDto1 Parameters;

    @Data
    @ToString
    public static class ParametersDto1 {
        /**参数名*/
        @KsYunField(name="Name")
        private String Name;

        /**参数值*/
        @KsYunField(name="Value")
        private String Value;

    }

}
