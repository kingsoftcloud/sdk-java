package ksyun.client.krds.getcurrentdatabaseinfo.v20160701;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname GetCurrentDatabaseInfoRequest
 * @Description 请求参数
 */
@Data
public class GetCurrentDatabaseInfoRequest {
    /**
     * 实例ID
     */
    @KsYunField(name = "DBInstanceIdentifier")
    private String DBInstanceIdentifier;

}