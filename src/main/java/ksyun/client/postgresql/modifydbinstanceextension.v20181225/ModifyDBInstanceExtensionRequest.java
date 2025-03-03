package ksyun.client.postgresql.modifydbinstanceextension.v20181225;

import common.annotation.KsYunField;
import lombok.Data;

import java.util.List;

/**
 * @Classname ModifyDBInstanceExtensionRequest
 * @Description 请求参数
 */
@Data
public class ModifyDBInstanceExtensionRequest {
    /**
     * 实例Id
     */
    @KsYunField(name = "DBInstanceIdentifier")
    private String DBInstanceIdentifier;

    /**
     * 数据库名称
     * <p>
     * ```json
     * 注意：插件是'database'级别的，必须指定db
     * ```
     */
    @KsYunField(name = "InstanceDatabaseName")
    private String InstanceDatabaseName;

    /**
     * 操作类型
     * <p>
     * ```json
     * 1.默认放的:install
     * 2.Install 安装
     * 3.Uninstall 卸载(不支持)
     * ```
     */
    @KsYunField(name = "Operation")
    private String Operation;

    /**
     * 插件列表
     * <p>
     * ```json
     * 注意：支持普通GET传List<string>的方式，也支持以Extension=aaa,bbb,ccc的形式传值
     * ```
     */
    @KsYunField(name = "Extension")
    private List<String> ExtensionList;


}