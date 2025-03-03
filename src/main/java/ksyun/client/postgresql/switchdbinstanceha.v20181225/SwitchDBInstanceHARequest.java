package ksyun.client.postgresql.switchdbinstanceha.v20181225;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname SwitchDBInstanceHARequest
 * @Description 请求参数
 */
@Data
public class SwitchDBInstanceHARequest {
    /**
     * 实例ID
     */
    @KsYunField(name = "DBInstanceIdentifier")
    private String DBInstanceIdentifier;


}