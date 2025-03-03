package ksyun.client.krds.upgradedbinstancelatesversion.v20160701;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname UpgradeDBInstanceLatesVersionRequest
 * @Description 请求参数
 */
@Data
public class UpgradeDBInstanceLatesVersionRequest {
    /**
     * 实例ID
     */
    @KsYunField(name = "DBInstanceIdentifier")
    private String DBInstanceIdentifier;

}