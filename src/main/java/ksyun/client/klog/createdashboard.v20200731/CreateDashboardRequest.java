package ksyun.client.klog.createdashboard.v20200731;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname CreateDashboardRequest
* @Description 请求参数
*/
@Data
public class CreateDashboardRequest{
    /**工程名称*/
    @KsYunField(name="ProjectName")
    private String ProjectName;

    /**仪表盘名称*/
    @KsYunField(name="DashboardName")
    private String DashboardName;


}