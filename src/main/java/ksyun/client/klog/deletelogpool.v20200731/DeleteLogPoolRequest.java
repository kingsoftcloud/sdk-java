package ksyun.client.klog.deletelogpool.v20200731;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DeleteLogPoolRequest
 * @Description 请求参数
 */
@Data
public class DeleteLogPoolRequest {
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