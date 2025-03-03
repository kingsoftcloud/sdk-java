package ksyun.client.krds.createinstanceaccountaction.v20160701;

import common.annotation.KsYunField;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
 * @Classname CreateInstanceAccountActionRequest
 * @Description 请求参数
 */
@Data
public class CreateInstanceAccountActionRequest {
    /**
     * 实例ID
     */
    @KsYunField(name = "DBInstanceIdentifier")
    private String DBInstanceIdentifier;

    /**
     * 账号名称			数字字母下滑线
     */
    @KsYunField(name = "InstanceAccountName")
    private String InstanceAccountName;

    /**
     * 账号密码
     */
    @KsYunField(name = "InstanceAccountPassword")
    private String InstanceAccountPassword;

    /**
     * 数据库账号描述
     */
    @KsYunField(name = "InstanceAccountDescription")
    private String InstanceAccountDescription;

    /**
     * 该账号对应的数据库权限
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