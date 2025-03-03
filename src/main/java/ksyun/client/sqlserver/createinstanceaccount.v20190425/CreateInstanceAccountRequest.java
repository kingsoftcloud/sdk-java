package ksyun.client.sqlserver.createinstanceaccount.v20190425;

import common.annotation.KsYunField;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
 * @Classname CreateInstanceAccountRequest
 * @Description 请求参数
 */
@Data
public class CreateInstanceAccountRequest {
    /**
     * 实例ID
     */
    @KsYunField(name = "DBInstanceIdentifier")
    private String DBInstanceIdentifier;

    /**
     * 账户名称
     * <p>
     * ```json
     * root, rdsrepladmin, rdsadmin, dtsroot, sa不可用；由大小写字母、数字或下划线组成，以小写字母开头，以小写字母或数字结尾，长度为2~16个字符
     * ```
     */
    @KsYunField(name = "InstanceAccountName")
    private String InstanceAccountName;

    /**
     * 账户密码
     * <p>
     * ```json
     * 8-30个字符，必须包含大小写字母和数字；支持的特殊字符：!@#$%^&*()_+=-
     * ```
     */
    @KsYunField(name = "InstanceAccountPassword")
    private String InstanceAccountPassword;

    /**
     * 实例账号说明/描述
     */
    @KsYunField(name = "InstanceAccountDescription")
    private String InstanceAccountDescription;

    /**
     * 实例账号权限列表
     */
    @KsYunField(name = "InstanceAccountPrivileges")
    private List<InstanceAccountPrivilegesDto> InstanceAccountPrivilegesList;

    @Data
    @ToString
    public static class InstanceAccountPrivilegesDto {
        /**
         * 数据名称
         */
        @KsYunField(name = "InstanceDatabaseName")
        private String InstanceDatabaseName;
        /**
         * 权限
         * <p>
         * ```json
         * DBOwner
         * ReadWrite
         * ReadOnly
         * ```
         */
        @KsYunField(name = "Privilege")
        private String Privilege;
    }

}