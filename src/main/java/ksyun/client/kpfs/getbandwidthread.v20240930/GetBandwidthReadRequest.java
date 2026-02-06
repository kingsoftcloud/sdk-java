package ksyun.client.kpfs.getbandwidthread.v20240930;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname GetBandwidthReadRequest
* @Description 请求参数
*/
@Data
public class GetBandwidthReadRequest{
    /**文件系统的实例ID。*/
    @KsYunField(name="FileSystemId")
    private String FileSystemId;

    /**监控数据开始时间。格式为：时间戳，如：1732204800。*/
    @KsYunField(name="StartTime")
    private String StartTime;

    /**监控数据截止时间。格式为：时间戳，如：1734797100。*/
    @KsYunField(name="EndTime")
    private String EndTime;

    /**监控数据统计颗粒度。有效值：1m、5m、10m、1h、1d；（EndTime-StartTime）/ Interval 必须 ≤ 6000，否则接口会拦截报错。*/
    @KsYunField(name="Interval")
    private String Interval;

    /**POSIX客户端的挂载信息。拼接规则为：Ip:ClientId，如：10.0.0.1:1000018。请参见查询文件系统POSIX客户端信息。*/
    @KsYunField(name="ClientNm")
    private String ClientNm;

    /**NFS客户端的VpcIp。若您需要查询NFS客户端级的统计项，可根据VpcIp筛选。支持Ipv4，如：10.0.0.1。请参见查询文件系统NFS客户端信息。该参数仅支持华北3（呼和浩特）地域，且仅支持专属集群。*/
    @KsYunField(name="VpcIp")
    private String VpcIp;

}
