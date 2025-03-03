package ksyun.client.klog.getlogs.v20200731;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname GetLogsRequest
 * @Description 请求参数
 */
@Data
public class GetLogsRequest {
    /**
     * Action
     */
    @KsYunField(name = "Action")
    private String Action;

    /***/
    @KsYunField(name = "LogPoolId")
    private String LogPoolId;

}