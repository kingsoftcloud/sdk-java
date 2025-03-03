package ksyun.client.klog.listquicksearchs.v20200731;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname ListQuickSearchsRequest
 * @Description 请求参数
 */
@Data
public class ListQuickSearchsRequest {
    /**
     * Action
     */
    @KsYunField(name = "Action")
    private String Action;

}