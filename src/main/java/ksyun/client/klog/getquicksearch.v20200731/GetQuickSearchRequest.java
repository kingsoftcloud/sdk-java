package ksyun.client.klog.getquicksearch.v20200731;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname GetQuickSearchRequest
 * @Description 请求参数
 */
@Data
public class GetQuickSearchRequest {
    /**
     * Action
     */
    @KsYunField(name = "Action")
    private String Action;

}