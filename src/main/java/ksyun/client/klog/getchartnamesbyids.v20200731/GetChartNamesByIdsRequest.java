package ksyun.client.klog.getchartnamesbyids.v20200731;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname GetChartNamesByIdsRequest
* @Description 请求参数
*/
@Data
public class GetChartNamesByIdsRequest{
    /**工程名称*/
    @KsYunField(name="ProjectName")
    private String ProjectName;

    /**图表id列表*/
    @KsYunField(name="ChartIds")
    private String ChartIds;


}