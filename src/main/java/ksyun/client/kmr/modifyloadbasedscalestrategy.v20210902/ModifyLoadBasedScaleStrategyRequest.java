package ksyun.client.kmr.modifyloadbasedscalestrategy.v20210902;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname ModifyLoadBasedScaleStrategyRequest
 * @Description 请求参数
 */
@Data
public class ModifyLoadBasedScaleStrategyRequest {
    /**
     * 集群ID
     */
    @KsYunField(name = "ClusterId")
    private String ClusterId;


}