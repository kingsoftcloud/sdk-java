package ksyun.client.klog.listlogpools.v20200731;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname ListLogPoolsRequest
 * @Description 请求参数
 */
@Data
public class ListLogPoolsRequest {
    /**
     * Action
     */
    @KsYunField(name = "Action")
    private String Action;

}