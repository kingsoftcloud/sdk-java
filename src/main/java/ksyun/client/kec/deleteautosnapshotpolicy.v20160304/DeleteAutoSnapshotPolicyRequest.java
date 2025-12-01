package ksyun.client.kec.deleteautosnapshotpolicy.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DeleteAutoSnapshotPolicyRequest
* @Description 请求参数
*/
@Data
public class DeleteAutoSnapshotPolicyRequest{
    /**自动快照策略ID*/
    @KsYunField(name="AutoSnapshotPolicyId")
    private List<String> AutoSnapshotPolicyIdList;

}