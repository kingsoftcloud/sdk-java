package ksyun.client.klog.getdashboardnamesbyids.v20200731;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname GetDashboardNamesByIdsRequest
 * @Description 请求参数
 */
@Data
public class GetDashboardNamesByIdsRequest {
    /**
     * 工程名称
     */
    @KsYunField(name = "ProjectName")
    private String ProjectName;

    /**
     * 仪表盘id列表
     */
    @KsYunField(name = "DashboardIds")
    private String DashboardIds;

}