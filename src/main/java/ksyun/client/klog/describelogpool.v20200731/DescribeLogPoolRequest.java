package ksyun.client.klog.describelogpool.v20200731;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DescribeLogPoolRequest
 * @Description 请求参数
 */
@Data
public class DescribeLogPoolRequest {
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