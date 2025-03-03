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
     * Action
     */
    @KsYunField(name = "Action")
    private String Action;

}