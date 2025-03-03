package ksyun.client.klog.getquicksearch.v20200731;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname GetQuickSearchRequest
 * @Description 请求参数
 */
@Data
public class GetQuickSearchRequest {
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

    /**
     * 快速查询名称
     */
    @KsYunField(name = "QuickSearchName")
    private String QuickSearchName;


}