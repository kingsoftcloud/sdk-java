package ksyun.client.kec.deletelocalvolumesnapshot.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DeleteLocalVolumeSnapshotRequest
* @Description 请求参数
*/
@Data
public class DeleteLocalVolumeSnapshotRequest{
    /**快照Id，支持批量删除，格式为LocalVolumeSnapshotId.N=XXX，N=1,2,3…100。*/
    @KsYunField(name="LocalVolumeSnapshotId",type=2)
    private List<String> LocalVolumeSnapshotIdList;


}