package ksyun.client.clickhouse.modifyinstanceaccountprivileges.v20210101;

import common.annotation.KsYunField;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
 * @Classname ModifyInstanceAccountPrivilegesRequest
 * @Description 请求参数
 */
@Data
public class ModifyInstanceAccountPrivilegesRequest {
    /**
     * 实例ID
     */
    @KsYunField(name = "InstanceId")
    private String InstanceId;

    /**
     * 账号名称
     */
    @KsYunField(name = "InstanceAccountName")
    private String InstanceAccountName;

    /***/
    @KsYunField(name = "InstanceAccountPrivileges")
    private List<InstanceAccountPrivilegesDto> InstanceAccountPrivilegesList;

    @Data
    @ToString
    public static class InstanceAccountPrivilegesDto {
        /**
         * 数据库名称
         */
        @KsYunField(name = "InstanceDatabaseName")
        private String InstanceDatabaseName;
        /**
         * 权限类型
         * <p>
         * ```json
         * ReadOnly ReadWrite DDLOnly
         * ```
         */
        @KsYunField(name = "Privilege")
        private String Privilege;
    }

}