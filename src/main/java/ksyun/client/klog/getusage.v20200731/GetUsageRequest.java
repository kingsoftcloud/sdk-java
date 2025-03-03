package ksyun.client.klog.getusage.v20200731;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname GetUsageRequest
 * @Description 请求参数
 */
@Data
public class GetUsageRequest {
    /**
     * Action
     */
    @KsYunField(name = "Action")
    private String Action;

}