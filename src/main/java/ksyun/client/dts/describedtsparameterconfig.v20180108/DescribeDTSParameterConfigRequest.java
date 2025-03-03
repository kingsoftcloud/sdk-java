package ksyun.client.dts.describedtsparameterconfig.v20180108;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DescribeDTSParameterConfigRequest
 * @Description 请求参数
 */
@Data
public class DescribeDTSParameterConfigRequest {
    /**
     * 主任务ID。
     */
    @KsYunField(name = "TaskId")
    private String TaskId;

}