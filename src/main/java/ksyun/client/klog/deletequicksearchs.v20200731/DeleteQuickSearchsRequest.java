package ksyun.client.klog.deletequicksearchs.v20200731;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname DeleteQuickSearchsRequest
 * @Description 请求参数
 */
@Data
public class DeleteQuickSearchsRequest {
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