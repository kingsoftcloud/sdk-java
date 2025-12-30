package ksyun.client.kec.createsnapshot.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname CreateSnapshotRequest
* @Description 请求参数
*/
@Data
public class CreateSnapshotRequest{
    /**指定文件系统实例ID*/
    @KsYunField(name="FileSystemId")
    private String FileSystemId;

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
