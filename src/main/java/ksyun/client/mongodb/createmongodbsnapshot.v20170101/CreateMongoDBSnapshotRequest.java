package ksyun.client.mongodb.createmongodbsnapshot.v20170101;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname CreateMongoDBSnapshotRequest
* @Description 请求参数
*/
@Data
public class CreateMongoDBSnapshotRequest{
    /**实例Id。*/
    @KsYunField(name="InstanceId")
    private String InstanceId;

    /**备份名称*/
    @KsYunField(name="Name")
    private String Name;

    /**备份模式。可选：Physical（物理备份），  Logical（逻辑备份）。默认物理备份。 注意：逻辑备份不支持恢复！*/
    @KsYunField(name="BackupMode")
    private String BackupMode;


}