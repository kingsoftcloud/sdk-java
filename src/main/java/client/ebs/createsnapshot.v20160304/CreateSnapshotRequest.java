package client.ebs.createsnapshot.v20160304;
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
    /**只支持是EBS3.0的硬盘，且状态为使用中或待挂载，使用中时主机状态为运行中或停止。长度36个字符，包括字母、数字、-、_*/
    @KsYunField(name="VolumeId")
    private String VolumeId;

    /**快照名称，长度2-50个字符，包括字母、数字、“-”、“_”。不传自动生成，不能以auto开头*/
    @KsYunField(name="SnapshotName")
    private String SnapshotName;

    /**快照描述，长度0-128字符*/
    @KsYunField(name="SnapshotDesc")
    private String SnapshotDesc;

    /**快照类型，默认CommonSnapShot*/
    @KsYunField(name="SnapshotType")
    private String SnapshotType;


}