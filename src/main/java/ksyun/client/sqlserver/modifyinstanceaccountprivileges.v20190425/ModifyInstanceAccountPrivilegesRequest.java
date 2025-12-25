package ksyun.client.sqlserver.modifyinstanceaccountprivileges.v20190425;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname ModifyInstanceAccountPrivilegesRequest
* @Description 请求参数
*/
@Data
public class ModifyInstanceAccountPrivilegesRequest{
    /**实例ID*/
    @KsYunField(name="DBInstanceIdentifier")
    private String DBInstanceIdentifier;

    /**账号名称*/
    @KsYunField(name="InstanceAccountName")
    private String InstanceAccountName;

    /**
```json
库名称和权限必须输入。例如(Get请求传List示例)：InstanceAccountPrivileges.InstanceDatabaseName.1:db_test_1 InstanceAccountPrivileges.Privilege.1:DBOwner
```*/
    @KsYunField(name = "InstanceAccountPrivileges", type = 1)
    private List<InstanceAccountPrivilegesDto> InstanceAccountPrivilegesList;

    @Data
    @ToString
    public static class InstanceAccountPrivilegesDto {
        /**数据库库名*/
        @KsYunField(name="InstanceDatabaseName")
        private String InstanceDatabaseName;

        /**数据库权限*/
        @KsYunField(name="Privilege")
        private String Privilege;

    }

}
