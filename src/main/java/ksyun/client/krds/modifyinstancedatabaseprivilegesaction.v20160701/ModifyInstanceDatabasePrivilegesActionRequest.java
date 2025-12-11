package ksyun.client.krds.modifyinstancedatabaseprivilegesaction.v20160701;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname ModifyInstanceDatabasePrivilegesActionRequest
* @Description 请求参数
*/
@Data
public class ModifyInstanceDatabasePrivilegesActionRequest{
    /**实例ID*/
    @KsYunField(name="DBInstanceIdentifier")
    private String DBInstanceIdentifier;

    /**数据库名称(需要修改权限的数据库库名)*/
    @KsYunField(name="InstanceDatabaseName")
    private String InstanceDatabaseName;

    /**具体账户及其权限说明*/
    @KsYunField(name="InstanceDatabasePrivileges",type=2)
    private List<InstanceDatabasePrivilegesDto> InstanceDatabasePrivilegesList;

    @Data
    @ToString
    public static class InstanceDatabasePrivilegesDto {
        /**数据库账户名称
帐号名称和权限必须同时填写*/
        @KsYunField(name="InstanceAccountName")
        private String InstanceAccountName;

        /**数据库账户权限
帐号名称和权限必须同时填写
只读：ReadOnly,
读写：ReadWrite,
仅DDL：DDLOnly,
仅DML：DMLOnly,*/
        @KsYunField(name="Privilege")
        private String Privilege;

    }

}
