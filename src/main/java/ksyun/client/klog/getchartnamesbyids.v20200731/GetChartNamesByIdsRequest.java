package ksyun.client.klog.getchartnamesbyids.v20200731;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname GetChartNamesByIdsRequest
 * @Description 请求参数
 */
@Data
public class GetChartNamesByIdsRequest {
    /**
     * 工程名称
     */
    @KsYunField(name = "ProjectName")
    private String ProjectName;

    /**
     * 图表id列表
     */
    @KsYunField(name = "ChartIds")
    private String ChartIds;


}