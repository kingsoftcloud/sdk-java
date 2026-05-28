package ksyun.client.kpfs.getremotecacheputlatency.v20240930;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname GetRemoteCachePutLatencyRequest
* @Description 请求参数
*/
@Data
public class GetRemoteCachePutLatencyRequest{
    /**文件系统的实例ID。*/
    @KsYunField(name="FileSystemId")
    private String FileSystemId;

    /**监控数据开始时间。格式为：时间戳，如：1732204800。*/
    @KsYunField(name="StartTime")
    private String StartTime;

    /**监控数据截止时间。格式为：时间戳，如：1734797100。*/
    @KsYunField(name="EndTime")
    private String EndTime;

    /**监控数据统计颗粒度。有效值：1m、5m、10m、1h、1d。
（EndTime-StartTime）/ Interval 必须 ≤ 6000，否则接口会拦截报错。*/
    @KsYunField(name="Interval")
    private String Interval;

    /**客户端所在缓存组。精确匹配。*/
    @KsYunField(name="CacheGroup")
    private String CacheGroup;

    /**客户端所在缓存组中角色。精确匹配。
• consumer：代表消费者，即缓存组中的--no-sharing节点
• provider：代表提供者
*/
    @KsYunField(name="CacheGroupRole")
    private String CacheGroupRole;

    /**客户端挂载信息。拼接规则为：HostName:MountPoint，如：vm10-0-0-116:/datapoint。*/
    @KsYunField(name="ClientNm")
    private String ClientNm;

}
