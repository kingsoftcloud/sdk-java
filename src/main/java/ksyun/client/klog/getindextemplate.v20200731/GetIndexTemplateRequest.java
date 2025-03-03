package ksyun.client.klog.getindextemplate.v20200731;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname GetIndexTemplateRequest
 * @Description 请求参数
 */
@Data
public class GetIndexTemplateRequest {
    /**
     * 工程名称
     */
    @KsYunField(name = "ProjectName")
    private String ProjectName;

    /**
     * 日志池名称
     */
    @KsYunField(name = "LogPoolName")
    private String LogPoolName;


}