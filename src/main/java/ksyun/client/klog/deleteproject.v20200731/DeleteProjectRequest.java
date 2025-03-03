package ksyun.client.klog.deleteproject.v20200731;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DeleteProjectRequest
 * @Description 请求参数
 */
@Data
public class DeleteProjectRequest {
    /**
     * Action
     */
    @KsYunField(name = "Action")
    private String Action;

}