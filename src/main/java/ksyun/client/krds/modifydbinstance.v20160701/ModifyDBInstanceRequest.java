package ksyun.client.krds.modifydbinstance.v20160701;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname ModifyDBInstanceRequest
 * @Description 请求参数
 */
@Data
public class ModifyDBInstanceRequest {
    /**
     * 实例ID
     */
    @KsYunField(name = "DBInstanceIdentifier")
    private String DBInstanceIdentifier;

    /**
     * 备份时间段		例如：02:00-03:00，范围取值:[00:00-01:00,23:00-24:00],  间隔一小时的整点时刻
     */
    @KsYunField(name = "PreferredBackupTime")
    private String PreferredBackupTime;

    /**
     * 实例新名称,不超过256个字节，仅支持中文、大小写字母、数字、减号和下划线
     */
    @KsYunField(name = "DBInstanceName")
    private String DBInstanceName;

    /**
     * 参数组ID
     */
    @KsYunField(name = "DBParameterGroupId")
    private String DBParameterGroupId;


}