package ksyun.client.krds.gettablerestorabletime.v20160701;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname GetTableRestorableTimeRequest
 * @Description 请求参数
 */
@Data
public class GetTableRestorableTimeRequest {
    /**
     * 实例ID
     */
    @KsYunField(name = "DBInstanceIdentifier")
    private String DBInstanceIdentifier;


}