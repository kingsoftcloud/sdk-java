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
     * Action
     */
    @KsYunField(name = "Action")
    private String Action;

}