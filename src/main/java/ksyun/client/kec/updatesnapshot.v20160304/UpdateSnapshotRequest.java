package ksyun.client.kec.updatesnapshot.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname UpdateSnapshotRequest
* @Description 请求参数
*/
@Data
public class UpdateSnapshotRequest{
    /**指定文件系统实例ID*/
    @KsYunField(name="FileSystemId")
    private String FileSystemId;

    /**生成的快照ID*/
    @KsYunField(name="SnapshotId")
    private String SnapshotId;

    /**快照名称*/
    @KsYunField(name="SnapshotName")
    private String SnapshotName;

    /**快照描述*/
    @KsYunField(name="Description")
    private String Description;

    /**快照保留天数*/
    @KsYunField(name="AliveDays")
    private Integer AliveDays;

}
