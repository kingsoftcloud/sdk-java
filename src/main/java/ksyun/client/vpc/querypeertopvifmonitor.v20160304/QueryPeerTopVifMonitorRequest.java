package ksyun.client.vpc.querypeertopvifmonitor.v20160304;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname QueryPeerTopVifMonitorRequest
 * @Description 请求参数
 */
@Data
public class QueryPeerTopVifMonitorRequest {
    /**
     * 虚拟私有网络id
     */
    @KsYunField(name = "vpcId")
    private String VpcId;

    /**
     * 开始时间，开始时间和结束时间相差10分钟。例如：2023-12-21T00:01:00
     */
    @KsYunField(name = "StartTime")
    private String StartTime;

    /**
     * 结束时间，开始时间和结束时间相差10分钟。例如：2023-12-21T00:01:00
     */
    @KsYunField(name = "EndTime")
    private String EndTime;

    /**
     * 排序顺序，默认是OUT，可选OUT|IN,区分大小写，填写其他的字符按OUT排序
     */
    @KsYunField(name = "SortType")
    private String SortType;

    /**
     * 筛选IP。
     */
    @KsYunField(name = "ip")
    private String Ip;


}