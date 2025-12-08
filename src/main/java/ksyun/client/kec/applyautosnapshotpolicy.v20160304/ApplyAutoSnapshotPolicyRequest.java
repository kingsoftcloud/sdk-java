package ksyun.client.kec.applyautosnapshotpolicy.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname ApplyAutoSnapshotPolicyRequest
* @Description 请求参数
*/
@Data
public class ApplyAutoSnapshotPolicyRequest{
    /**自动快照策略ID*/
    @KsYunField(name="AutoSnapshotPolicyId")
    private String AutoSnapshotPolicyId;

    /**绑定的硬盘ID，支持多个硬盘ID*/
    @KsYunField(name="AttachVolumeId",type=2)
    private List<String> AttachVolumeIdList;

}
