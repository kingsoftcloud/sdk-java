package ksyun.client.slb.createbackendservergroup.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname CreateBackendServerGroupRequest
 * @Description 请求参数
 */
@Data
public class CreateBackendServerGroupRequest {
    /**
     * Vpc的ID
     */
    @KsYunField(name = "VpcId")
    private String VpcId;

    /**
     * 后端协议, 默认HTTP
     */
    @KsYunField(name = "Protocol")
    private String Protocol;

    /**
     * 后端服务组的名称
     */
    @KsYunField(name = "BackendServerGroupName")
    private String BackendServerGroupName;

    /**
     * 后端服务组类型(Server: 服务器|Mirror: 镜像服务器)
     */
    @KsYunField(name = "BackendServerGroupType")
    private String BackendServerGroupType;

    /**
     * HTTP类型健康检查的域名
     */
    @KsYunField(name = "HostName")
    private String HostName;

    /**
     * 健康检查保持的状态(start|stop)
     */
    @KsYunField(name = "HealthCheckState")
    private String HealthCheckState;

    /**
     * 健康阈值，此参数镜像服务器不可为空
     */
    @KsYunField(name = "HealthyThreshold")
    private Integer HealthyThreshold;

    /**
     * 健康检查时间间隔，此参数镜像服务器不可为空
     */
    @KsYunField(name = "Interval")
    private Integer Interval;

    /**
     * 健康检查超时时间，此参数镜像服务器不可为空
     */
    @KsYunField(name = "Timeout")
    private Integer Timeout;

    /**
     * 不健康阈值，此参数镜像服务器不可为空
     */
    @KsYunField(name = "UnhealthyThreshold")
    private Integer UnhealthyThreshold;

    /**
     * HTTP类型监听器健康检查的链接
     */
    @KsYunField(name = "UrlPath")
    private String UrlPath;

    /**
     * Region机房
     */
    @KsYunField(name = "Region")
    private String Region;

}