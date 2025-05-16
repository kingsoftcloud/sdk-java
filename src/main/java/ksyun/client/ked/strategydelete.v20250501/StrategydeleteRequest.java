package ksyun.client.ked.strategydelete.v20250501;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname StrategydeleteRequest
 * @Description 请求参数
 */
@Data
public class StrategydeleteRequest {
    /**
     * 策略组 id 列表
     */
    @KsYunField(name = "id")
    private Integer Id;

}