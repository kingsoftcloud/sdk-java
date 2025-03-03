package ksyun.client.krds.modifyinstancedatabaseprivileges.v20160701;

import common.annotation.KsYunField;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
 * @Classname ModifyInstanceDatabasePrivilegesRequest
 * @Description 请求参数
 */
@Data
public class ModifyInstanceDatabasePrivilegesRequest {
    /**
     * 实例ID
     */
    @KsYunField(name = "DBInstanceIdentifier")
    private String DBInstanceIdentifier;

    /**
     * 数据库名称
     */
    @KsYunField(name = "InstanceDatabaseName")
    private String InstanceDatabaseName;

    /***/
    @KsYunField(name = "InstanceDatabasePrivileges")
    private List<InstanceDatabasePrivilegesDto> InstanceDatabasePrivilegesList;

    @Data
    @ToString
    public static class InstanceDatabasePrivilegesDto {
        /**
         * 数据库账户名称
         * 帐号名称和权限必须同时填写
         */
        @KsYunField(name = "InstanceAccountName")
        private String InstanceAccountName;
        /**
         * 数据库账户权限
         * 帐号名称和权限必须同时填写
         * 只读：ReadOnly,
         * 读写：ReadWrite,
         * 仅DDL：DDLOnly,
         * 仅DML：DMLOnly,
         */
        @KsYunField(name = "Privilege")
        private String Privilege;
    }

}