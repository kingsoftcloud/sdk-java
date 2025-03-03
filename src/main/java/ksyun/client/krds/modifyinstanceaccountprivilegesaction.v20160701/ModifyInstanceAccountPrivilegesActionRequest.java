package ksyun.client.krds.modifyinstanceaccountprivilegesaction.v20160701;

import common.annotation.KsYunField;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
 * @Classname ModifyInstanceAccountPrivilegesActionRequest
 * @Description 请求参数
 */
@Data
public class ModifyInstanceAccountPrivilegesActionRequest {
    /**
     * 实例ID
     */
    @KsYunField(name = "DBInstanceIdentifier")
    private String DBInstanceIdentifier;

    /**
     * 数据库帐号名称
     */
    @KsYunField(name = "InstanceAccountName")
    private String InstanceAccountName;

    /**
     * 数据库权限		不传则置空改帐号数据库权限
     */
    @KsYunField(name = "InstanceAccountPrivileges", type = 2)
    private List<InstanceAccountPrivilegesDto> InstanceAccountPrivilegesList;

    @Data
    @ToString
    public static class InstanceAccountPrivilegesDto {
        /**
         * 数据库名称
         * 数据库名称和权限必须同时填写
         */
        private String InstanceDatabaseName;
        /**
         * 数据库权限
         * 数据库名称和权限必须同时填写
         * 只读：ReadOnly,
         * 读写：ReadWrite,
         * 仅DDL：DDLOnly,
         * 仅DML：DMLOnly,
         */
        private String Privilege;
    }


}