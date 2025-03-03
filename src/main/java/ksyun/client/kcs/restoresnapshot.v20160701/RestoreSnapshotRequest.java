package ksyun.client.kcs.restoresnapshot.v20160701;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname RestoreSnapshotRequest
 * @Description 请求参数
 */
@Data
public class RestoreSnapshotRequest {
    /**
     * 可用区       	 默认：对应机房的a区
     */
    @KsYunField(name = "AvailableZone")
    private String AvailableZone;

    /**
     * 缓存服务ID。
     */
    @KsYunField(name = "Cacheld")
    private String Cacheld;

    /**
     * 备份类型     	 Default / BaseKS3
     */
    @KsYunField(name = "Type")
    private String Type;

    /**
     * 备份ID。       	 Type值为Default时，必选项。
     */
    @KsYunField(name = "SnapshotId")
    private String SnapshotId;

    /**
     * 存储空间名称。 	 Type值为BaseKS3时，必选项。
     */
    @KsYunField(name = "BucketName")
    private String BucketName;

    /**
     * 文件名称。     	 Type值为BaseKS3时，必选项
     */
    @KsYunField(name = "ObjectName")
    private String ObjectName;

}