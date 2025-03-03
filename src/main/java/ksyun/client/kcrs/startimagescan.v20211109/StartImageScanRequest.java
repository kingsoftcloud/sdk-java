package ksyun.client.kcrs.startimagescan.v20211109;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname StartImageScanRequest
 * @Description 请求参数
 */
@Data
public class StartImageScanRequest {
    /**
     * 实例id
     */
    @KsYunField(name = "InstanceId")
    private String InstanceId;

    /**
     * 命名空间
     */
    @KsYunField(name = "Namespace")
    private String Namespace;

    /**
     * 镜像仓库名称
     */
    @KsYunField(name = "RepoName")
    private String RepoName;

    /**
     * 镜像id
     */
    @KsYunField(name = "ImageId")
    private String ImageId;

}