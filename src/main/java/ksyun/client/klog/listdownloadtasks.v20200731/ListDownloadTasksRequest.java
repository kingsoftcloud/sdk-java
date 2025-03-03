package ksyun.client.klog.listdownloadtasks.v20200731;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname ListDownloadTasksRequest
 * @Description 请求参数
 */
@Data
public class ListDownloadTasksRequest {
    /**
     * Action
     */
    @KsYunField(name = "Action")
    private String Action;

}