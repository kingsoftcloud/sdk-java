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
     * 工程名称
     */
    @KsYunField(name = "ProjectName")
    private String ProjectName;


}