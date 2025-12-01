package ksyun.client.kec.cancelautosnapshotpolicy.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname CancelAutoSnapshotPolicyRequest
* @Description 请求参数
*/
@Data
public class CancelAutoSnapshotPolicyRequest{
    /**自动快照策略ID*/
    @KsYunField(name="AutoSnapshotPolicyId")
    private String AutoSnapshotPolicyId;

    /**待解绑的硬盘ID*/
    @KsYunField(name="AttachVolumeId")
    private List<String> AttachVolumeIdList;

}