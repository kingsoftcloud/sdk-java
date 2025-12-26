package ksyun.client.monitor.listalarmeffectinstance.v20250101;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname ListAlarmEffectInstanceRequest
* @Description 请求参数
*/
@Data
public class ListAlarmEffectInstanceRequest{
    /**开始时间。*/
    @KsYunField(name="StartTime")
    private Integer StartTime;

    /**结束时间。*/
    @KsYunField(name="EndTime")
    private Integer EndTime;

    /**页数。*/
    @KsYunField(name="PageIndex")
    private Integer PageIndex;

    /**每页显示最大数量。*/
    @KsYunField(name="PageSize")
    private Integer PageSize;

}
