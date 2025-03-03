package ksyun.client.klog.updateproject.v20200731;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname UpdateProjectRequest
 * @Description 请求参数
 */
@Data
public class UpdateProjectRequest {
    /**
     * Action
     */
    @KsYunField(name = "Action")
    private String Action;

}