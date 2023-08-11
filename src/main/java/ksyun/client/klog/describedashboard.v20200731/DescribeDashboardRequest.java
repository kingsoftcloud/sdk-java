package ksyun.client.klog.describedashboard.v20200731;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeDashboardRequest
* @Description 请求参数
*/
@Data
public class DescribeDashboardRequest{
    /**仪表盘ID*/
    @KsYunField(name="DashboardId")
    private String DashboardId;


}