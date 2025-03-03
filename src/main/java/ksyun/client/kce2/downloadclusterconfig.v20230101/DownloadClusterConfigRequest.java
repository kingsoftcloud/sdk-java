package ksyun.client.kce2.downloadclusterconfig.v20230101;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DownloadClusterConfigRequest
 * @Description 请求参数
 */
@Data
public class DownloadClusterConfigRequest {
    /**
     * 集群ID
     */
    @KsYunField(name = "ClusterId")
    private String ClusterId;

    /**
     * 集群名称
     */
    @KsYunField(name = "ClusterName")
    private String ClusterName;

    /**
     * Config 类型
     * + INNERSLB:内网访问
     * + OUTTERSLB:公网访问）
     */
    @KsYunField(name = "Type")
    private String Type;

}