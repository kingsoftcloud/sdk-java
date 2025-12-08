package ksyun.client.slb.describebackendservergroups.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeBackendServerGroupsResponse
* @Description DescribeBackendServerGroups 返回体
*/
@Data
@ToString
public class DescribeBackendServerGroupsResponse extends BaseResponseModel {
    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**获取另一页返回结果的 token.*/
    @JsonProperty("NextToken")
    private String NextToken;

    /**后端服务器组的信息*/
    @JsonProperty("BackendServerGroupSet")
    private List<BackendServerGroupSetDto> BackendServerGroupSet;

    @Data
    @ToString
    public static class BackendServerGroupSetDto {
        /**创建时间*/
        @JsonProperty("CreateTime")
        private String CreateTime;

        /**后端服务组的ID*/
        @JsonProperty("BackendServerGroupId")
        private String BackendServerGroupId;

        /**Vpc的ID*/
        @JsonProperty("VpcId")
        private String VpcId;

        /**后端协议*/
        @JsonProperty("Protocol")
        private String Protocol;

        /**后端服务组的名称*/
        @JsonProperty("BackendServerGroupName")
        private String BackendServerGroupName;

        /**后端服务的数量*/
        @JsonProperty("BackendServerNumber")
        private Integer BackendServerNumber;

        /**后端服务组类型(Server: 服务器|Mirror: 镜像服务器)*/
        @JsonProperty("BackendServerGroupType")
        private String BackendServerGroupType;

        /**健康检查信息，仅镜像服务器有此参数*/
        @JsonProperty("HealthCheck")
        private HealthCheckDto HealthCheck;

        @Data
        @ToString
        public static class HealthCheckDto {
            /**HTTP类型健康检查的域名*/
            @JsonProperty("HostName")
            private String HostName;

            /**健康检查保持的状态*/
            @JsonProperty("HealthCheckState")
            private String HealthCheckState;

            /**健康阈值*/
            @JsonProperty("HealthyThreshold")
            private Integer HealthyThreshold;

            /**健康检查时间间隔*/
            @JsonProperty("Interval")
            private Integer Interval;

            /**健康检查超时时间*/
            @JsonProperty("Timeout")
            private Integer Timeout;

            /**不健康阈值*/
            @JsonProperty("UnhealthyThreshold")
            private Integer UnhealthyThreshold;

            /**HTTP类型监听器健康检查的链接*/
            @JsonProperty("UrlPath")
            private String UrlPath;

        }

        /**IP版本*/
        @JsonProperty("IpVersion")
        private String IpVersion;

        /**后端实例类型*/
        @JsonProperty("Type")
        private String Type;

        /**开启后端长连接*/
        @JsonProperty("UpstreamKeepalive")
        private String UpstreamKeepalive;

    }

}
