package ksyun.client.sqlserver.modifyinstancedatabaseprivileges.v20190425;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname ModifyInstanceDatabasePrivilegesRequest
* @Description 请求参数
*/
@Data
public class ModifyInstanceDatabasePrivilegesRequest{
    /**实例ID*/
    @KsYunField(name="DBInstanceIdentifier")
    private String DBInstanceIdentifier;

    /**数据库名称*/
    @KsYunField(name="InstanceDatabaseName")
    private String InstanceDatabaseName;

    /***/
    @KsYunField(name="InstanceDatabasePrivileges",type=2)
    private List<InstanceDatabasePrivilegesDto1> InstanceDatabasePrivilegesList;

    @Data
    @ToString
    public static class InstanceDatabasePrivilegesDto1 {
        /**账号名称*/
        @KsYunField(name="InstanceAccountName")
        private String InstanceAccountName;

        /**账号权限*/
        @KsYunField(name="Privilege")
        private String Privilege;

    }

}
