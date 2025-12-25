package ksyun.client.kec.describeautosnapshotpolicy.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeAutoSnapshotPolicyRequest
* @Description 请求参数
*/
@Data
public class DescribeAutoSnapshotPolicyRequest{
    /**自动快照策略名称*/
    @KsYunField(name="AutoSnapshotPolicyName")
    private String AutoSnapshotPolicyName;

    /**快照策略id*/
    @KsYunField(name = "AutoSnapshotPolicyId", type = 1)
    private List<String> AutoSnapshotPolicyIdList;

}
