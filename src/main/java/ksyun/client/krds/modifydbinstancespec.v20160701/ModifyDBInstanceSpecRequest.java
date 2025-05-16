package ksyun.client.krds.modifydbinstancespec.v20160701;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

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