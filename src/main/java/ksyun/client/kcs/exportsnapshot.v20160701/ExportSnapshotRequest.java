package ksyun.client.kcs.exportsnapshot.v20160701;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname ExportSnapshotRequest
* @Description 请求参数
*/
@Data
public class ExportSnapshotRequest{
    /**可用区       	 默认：对应机房的a区*/
    @KsYunField(name="AvailableZone")
    private String AvailableZone;

    /**备份ID */
    @KsYunField(name="SnapshotId")
    private String SnapshotId;

    /**存储空间名称 */
    @KsYunField(name="BucketName")
    private String BucketName;

    /**文件名称 */
    @KsYunField(name="ObjectName")
    private String ObjectName;


}