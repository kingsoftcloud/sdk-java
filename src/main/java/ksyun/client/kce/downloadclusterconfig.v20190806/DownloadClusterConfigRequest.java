package ksyun.client.kce.downloadclusterconfig.v20190806;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DownloadClusterConfigRequest
 * @Description 请求参数
 */
@Data
public class DownloadClusterConfigRequest {
    /**
     * 集群id
     */
    @KsYunField(name = "ClusterId")
    private String ClusterId;

    /**
     * 获取的config类型<br>true：公网访问config文件<br>false：VPC内网config文件<br>默认值：true
     */
    @KsYunField(name = "IsPublic")
    private Boolean IsPublic;

}