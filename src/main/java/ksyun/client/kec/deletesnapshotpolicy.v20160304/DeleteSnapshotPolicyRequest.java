package ksyun.client.kec.deletesnapshotpolicy.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DeleteSnapshotPolicyRequest
* @Description 请求参数
*/
@Data
public class DeleteSnapshotPolicyRequest{
    /**自动快照策略ID，支持批量删除*/
    @KsYunField(name="AutoSnapshotPolicyId",type=1)
    private List<String> AutoSnapshotPolicyIdList;

}
