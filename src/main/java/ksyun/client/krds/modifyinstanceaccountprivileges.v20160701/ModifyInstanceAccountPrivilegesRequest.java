package ksyun.client.krds.modifyinstanceaccountprivileges.v20160701;

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
    /**实例id*/
    @KsYunField(name="DBInstanceIdentifier")
    private String DBInstanceIdentifier;

    /**实例名称*/
    @KsYunField(name="InstanceAccountName")
    private String InstanceAccountName;

    /**账户权限*/
    @KsYunField(name="InstanceAccountPrivileges",type=2)
    private List<InstanceAccountPrivilegesDto1> InstanceAccountPrivilegesList;

    @Data
    @ToString
    public static class InstanceAccountPrivilegesDto1 {
        /**数据库名称*/
        @KsYunField(name="InstanceDatabaseName")
        private String InstanceDatabaseName;

        /**ReadOnly
ReadWrite
DDLOnly
DMLOnly*/
        @KsYunField(name="Privilege")
        private String Privilege;

    }

}
