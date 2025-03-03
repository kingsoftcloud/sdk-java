package ksyun.client.sqlserver.modifydbinstancespec.v20190425;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname ModifyDBInstanceSpecRequest
 * @Description 请求参数
 */
@Data
public class ModifyDBInstanceSpecRequest {
    /**
     * 实例ID
     */
    @KsYunField(name = "DBInstanceIdentifier")
    private String DBInstanceIdentifier;

    /**
     * 内存规格
     */
    @KsYunField(name = "Mem")
    private Integer Mem;

    /**
     * 磁盘规格
     */
    @KsYunField(name = "Disk")
    private Integer Disk;

}