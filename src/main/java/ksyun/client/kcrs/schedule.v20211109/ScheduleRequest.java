package ksyun.client.kcrs.schedule.v20211109;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname ScheduleRequest
 * @Description 请求参数
 */
@Data
public class ScheduleRequest {
    /**
     * 实例Id
     */
    @KsYunField(name = "InstanceId")
    private String InstanceId;

    /**
     * 是否模拟运行
     */
    @KsYunField(name = "TestRun")
    private Boolean TestRun;

}