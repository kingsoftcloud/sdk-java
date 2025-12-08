package ksyun.client.bws.querybwstopeipmonitor.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname QueryBwsTopEipMonitorRequest
* @Description 请求参数
*/
@Data
public class QueryBwsTopEipMonitorRequest{
    /**共享带宽的ID*/
    @KsYunField(name="BandWidthShareId")
    private String BandWidthShareId;

    /**开始时间，开始时间和结束时间相差10分钟,例如：2023-09-14T13:30:01*/
    @KsYunField(name="StartTime")
    private String StartTime;

    /**结束时间，开始时间和结束时间相差10分钟，例如：2023-09-14T13:40:01*/
    @KsYunField(name="EndTime")
    private String EndTime;

    /**排序顺序，默认是OUT，可选OUT|IN,区分大小写，填写其他的字符按OUT排序*/
    @KsYunField(name="SortType")
    private String SortType;

    /**筛选ip*/
    @KsYunField(name="PublicIp")
    private String PublicIp;

}
