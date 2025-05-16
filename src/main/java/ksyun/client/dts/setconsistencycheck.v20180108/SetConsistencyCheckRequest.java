package ksyun.client.dts.setconsistencycheck.v20180108;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname SetConsistencyCheckRequest
 * @Description 请求参数
 */
@Data
public class SetConsistencyCheckRequest {
    /**
     * 主任务ID
     */
    @KsYunField(name = "TaskId")
    private String TaskId;

    /**
     * 校验开关。范围：True|False
     */
    @KsYunField(name = "ConsistencyCheckAuto")
    private Boolean ConsistencyCheckAuto;

    /**
     * 自动校验周期。	开启定时校验任务必传。
     */
    @KsYunField(name = "ConsistencyCheckCycle")
    private Integer ConsistencyCheckCycle;

    /**
     * 校验时间。开启定时校验任务必传。
     */
    @KsYunField(name = "ConsistencyCheckFixedTime")
    private String ConsistencyCheckFixedTime;

}