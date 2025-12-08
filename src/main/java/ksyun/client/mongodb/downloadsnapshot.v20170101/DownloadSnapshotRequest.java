package ksyun.client.mongodb.downloadsnapshot.v20170101;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DownloadSnapshotRequest
* @Description 请求参数
*/
@Data
public class DownloadSnapshotRequest{
    /**备份ID。请注意：暂不支持分片集群实例备份的下载。
*/
    @KsYunField(name="SnapshotId")
    private String SnapshotId;

    /**实例Id。*/
    @KsYunField(name="InstanceId")
    private String InstanceId;

}
