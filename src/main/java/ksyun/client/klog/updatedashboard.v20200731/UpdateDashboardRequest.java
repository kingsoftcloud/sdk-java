package ksyun.client.klog.updatedashboard.v20200731;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname UpdateDashboardRequest
* @Description 请求参数
*/
@Data
public class UpdateDashboardRequest{
    /**仪表盘ID*/
    @KsYunField(name="DashboardId")
    private String DashboardId;

    /**仪表盘名称*/
    @KsYunField(name="DashboardName")
    private String DashboardName;


}