package ksyun.client.klog.createproject.v20200731;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname CreateProjectRequest
 * @Description 请求参数
 */
@Data
public class CreateProjectRequest {
    /**
     * Action
     */
    @KsYunField(name = "Action")
    private String Action;

}