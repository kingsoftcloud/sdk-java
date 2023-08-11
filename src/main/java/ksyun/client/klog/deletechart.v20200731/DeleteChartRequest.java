package ksyun.client.klog.deletechart.v20200731;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DeleteChartRequest
* @Description 请求参数
*/
@Data
public class DeleteChartRequest{
    /**图表ID*/
    @KsYunField(name="ChartId")
    private String ChartId;


}