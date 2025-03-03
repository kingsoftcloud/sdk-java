package ksyun.client.klog.createdownloadtask.v20200731;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname CreateDownloadTaskRequest
 * @Description 请求参数
 */
@Data
public class CreateDownloadTaskRequest {
    /**
     * Action
     */
    @KsYunField(name = "Action")
    private String Action;

}