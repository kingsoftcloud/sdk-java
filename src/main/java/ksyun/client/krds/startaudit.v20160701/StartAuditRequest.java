package ksyun.client.krds.startaudit.v20160701;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname StartAuditRequest
 * @Description 请求参数
 */
@Data
public class StartAuditRequest {
    /**
     * 实例ID
     */
    @KsYunField(name = "DBInstanceIdentifier")
    private String DBInstanceIdentifier;


}