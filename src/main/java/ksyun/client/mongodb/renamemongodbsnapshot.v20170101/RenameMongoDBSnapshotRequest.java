package ksyun.client.mongodb.renamemongodbsnapshot.v20170101;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname RenameMongoDBSnapshotRequest
 * @Description 请求参数
 */
@Data
public class RenameMongoDBSnapshotRequest {
    /**
     * 实例id
     */
    @KsYunField(name = "InstanceId")
    private String InstanceId;

    /**
     * 备份Id
     */
    @KsYunField(name = "SnapshotId")
    private String SnapshotId;

    /**
     * 备份名称。支持2-64个字符，支持中文，字母，数字，以及-_。
     */
    @KsYunField(name = "Name")
    private String Name;


}