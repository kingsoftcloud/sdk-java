package ksyun.client.kmr.addloadbasedscalestrategy.v20210902;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname AddLoadBasedScaleStrategyRequest
 * @Description 请求参数
 */
@Data
public class AddLoadBasedScaleStrategyRequest {
    /**
     * 集群ID
     */
    @KsYunField(name = "ClusterId")
    private String ClusterId;

}