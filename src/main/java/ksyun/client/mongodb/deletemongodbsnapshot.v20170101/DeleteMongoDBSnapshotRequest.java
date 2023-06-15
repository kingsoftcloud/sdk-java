package ksyun.client.mongodb.deletemongodbsnapshot.v20170101;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DeleteMongoDBSnapshotRequest
* @Description 请求参数
*/
@Data
public class DeleteMongoDBSnapshotRequest{
    /**实例Id。*/
    @KsYunField(name="InstanceId")
    private String InstanceId;

    /**备份Id*/
    @KsYunField(name="SnapshotId")
    private String SnapshotId;


}