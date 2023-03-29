package ksyun.client.kec.describelocalvolumesnapshots.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeLocalVolumeSnapshotsRequest
* @Description 请求参数
*/
@Data
public class DescribeLocalVolumeSnapshotsRequest{
    /**Action*/
    @KsYunField(name="Action")
    private String Action;

    /**Version*/
    @KsYunField(name="Version")
    private String Version;

    /**本地硬盘名称。
*/
    @KsYunField(name="LocalVolumeName")
    private String LocalVolumeName;

    /**本地硬盘快照ID。
*/
    @KsYunField(name="SourceLocalVolumeId")
    private String SourceLocalVolumeId;


}