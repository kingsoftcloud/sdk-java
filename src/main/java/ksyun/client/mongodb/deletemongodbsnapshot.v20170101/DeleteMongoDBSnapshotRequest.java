package ksyun.client.mongodb.deletemongodbsnapshot.v20170101;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DeleteMongoDBSnapshotRequest
 * @Description 请求参数
 */
@Data
public class DeleteMongoDBSnapshotRequest {
    /**
     * 实例Id。
     */
    @KsYunField(name = "InstanceId")
    private String InstanceId;

    /**
     * 备份Id
     */
    @KsYunField(name = "SnapshotId")
    private String SnapshotId;


}