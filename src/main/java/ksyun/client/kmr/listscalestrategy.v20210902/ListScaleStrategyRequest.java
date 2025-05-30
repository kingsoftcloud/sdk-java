package ksyun.client.kmr.listscalestrategy.v20210902;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname ListScaleStrategyRequest
 * @Description 请求参数
 */
@Data
public class ListScaleStrategyRequest {
    /**
     * 集群ID
     */
    @KsYunField(name = "ClusterId")
    private String ClusterId;

}