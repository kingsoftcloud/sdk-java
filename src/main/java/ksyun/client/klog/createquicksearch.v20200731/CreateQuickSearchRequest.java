package ksyun.client.klog.createquicksearch.v20200731;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname CreateQuickSearchRequest
 * @Description 请求参数
 */
@Data
public class CreateQuickSearchRequest {
    /**
     * Action
     */
    @KsYunField(name = "Action")
    private String Action;

}