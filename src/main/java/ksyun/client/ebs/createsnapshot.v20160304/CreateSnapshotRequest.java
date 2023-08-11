package ksyun.client.ebs.createsnapshot.v20160304;

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
    /**云硬盘创建快照时需为使用中或待挂载状态，使用中时主机状态为运行中或停止。长度36个字符，包括字母、数字、-、_*/
    @KsYunField(name="VolumeId")
    private String VolumeId;

    /**快照名称，长度2-50个字符，包括字母、数字、“-”、“_”。不传自动生成，不能以auto开头*/
    @KsYunField(name="SnapshotName")
    private String SnapshotName;

    /**快照描述，长度0-128字符*/
    @KsYunField(name="SnapshotDesc")
    private String SnapshotDesc;

    /**快照类型支持极速可用快照（LocalSnapShot）、普通快照（CommonSnapShot），默认CommonSnapShot*/
    @KsYunField(name="SnapshotType")
    private String SnapshotType;


}