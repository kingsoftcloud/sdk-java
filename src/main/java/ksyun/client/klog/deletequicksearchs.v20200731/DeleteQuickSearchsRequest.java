package ksyun.client.klog.deletequicksearchs.v20200731;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DeleteQuickSearchsRequest
 * @Description 请求参数
 */
@Data
public class DeleteQuickSearchsRequest {
    /**
     * Action
     */
    @KsYunField(name = "Action")
    private String Action;

}