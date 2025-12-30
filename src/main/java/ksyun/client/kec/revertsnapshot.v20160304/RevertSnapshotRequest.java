package ksyun.client.kec.revertsnapshot.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname RevertSnapshotRequest
* @Description 请求参数
*/
@Data
public class RevertSnapshotRequest{
    /**文件系统实例ID*/
    @KsYunField(name="FileSystemId")
    private String FileSystemId;

    /**快照ID*/
    @KsYunField(name="SnapshotId")
    private String SnapshotId;

}
