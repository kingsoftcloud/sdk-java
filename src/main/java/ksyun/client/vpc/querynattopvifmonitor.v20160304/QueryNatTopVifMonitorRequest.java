package ksyun.client.vpc.querynattopvifmonitor.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname QueryNatTopVifMonitorRequest
* @Description 请求参数
*/
@Data
public class QueryNatTopVifMonitorRequest{
    /**Nat的ID*/
    @KsYunField(name="natId")
    private String NatId;

    /**开始时间，时间格式例如:2023-08-08T18:00:00*/
    @KsYunField(name="startTime")
    private String StartTime;

    /**结束时间，时间格式例如：2023-08-08T18:08:00*/
    @KsYunField(name="endTime")
    private String EndTime;

    /**排序类型，只能传入两种：OUT/IN*/
    @KsYunField(name="sortType")
    private String SortType;

    /**实例类型，只包含两种：kec/epc*/
    @KsYunField(name="instanceType")
    private String InstanceType;

    /**筛选ip*/
    @KsYunField(name="ip")
    private String Ip;


}