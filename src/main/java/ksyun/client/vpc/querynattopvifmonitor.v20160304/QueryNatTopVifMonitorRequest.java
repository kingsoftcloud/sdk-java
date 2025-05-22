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
public class QueryNatTopVifMonitorRequest {
    /**
     * Nat的ID
     */
    @KsYunField(name = "NatId")
    private String NatId;

    /**
     * 开始时间，开始时间和结束时间相差10分钟,例如：2023-09-14T13:30:01
     */
    @KsYunField(name="StartTime")
    private String StartTime;

    /**
     * 结束时间，开始时间和结束时间相差10分钟，例如：2023-09-14T13:40:01
     */
    @KsYunField(name = "EndTime")
    private String EndTime;

    /**排序顺序，默认是BPS_OUT，可选BPS_IN|BPS_OUT|PEAK_IN|PEAK_OUT,区分大小写，填写其他的字符按BPS_OUT排序*/
    @KsYunField(name= "SortType")
    private String SortType;

    /**查询实例类型，不填默认是kec，epc/kec*/
    @KsYunField(name="InstanceType")
    private String InstanceType;

    /**ip*/
    @KsYunField(name="ip")
    private String Ip;

}