package ksyun.client.klog.listprojects.v20200731;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname ListProjectsRequest
 * @Description 请求参数
 */
@Data
public class ListProjectsRequest {
    /**
     * Action
     */
    @KsYunField(name = "Action")
    private String Action;

}