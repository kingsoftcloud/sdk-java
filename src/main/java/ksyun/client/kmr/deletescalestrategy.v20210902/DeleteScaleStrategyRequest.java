package ksyun.client.kmr.deletescalestrategy.v20210902;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname DeleteScaleStrategyRequest
 * @Description 请求参数
 */
@Data
public class DeleteScaleStrategyRequest {
    /**
     * 集群ID
     */
    @KsYunField(name = "ClusterId")
    private String ClusterId;

    /**
     * 弹性策略的ID
     */
    @KsYunField(name = "StrategyId")
    private String StrategyId;

    /**
     * 弹性策略的类型
     * - 时间弹性：Time-Based
     * - 负载弹性：Load-Based
     */
    @KsYunField(name = "StrategyModule")
    private String StrategyModule;

}