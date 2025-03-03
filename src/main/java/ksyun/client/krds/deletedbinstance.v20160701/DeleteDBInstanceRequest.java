package ksyun.client.krds.deletedbinstance.v20160701;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DeleteDBInstanceRequest
 * @Description 请求参数
 */
@Data
public class DeleteDBInstanceRequest {
    /**
     * 实例ID
     */
    @KsYunField(name = "DBInstanceIdentifier")
    private String DBInstanceIdentifier;

}