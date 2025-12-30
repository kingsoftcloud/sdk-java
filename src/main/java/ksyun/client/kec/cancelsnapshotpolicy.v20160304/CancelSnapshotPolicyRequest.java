package ksyun.client.kec.cancelsnapshotpolicy.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname CancelSnapshotPolicyRequest
* @Description 请求参数
*/
@Data
public class CancelSnapshotPolicyRequest{
    /**快照策略ID*/
    @KsYunField(name="AutoSnapshotPolicyId")
    private String AutoSnapshotPolicyId;

    /**文件系统ID*/
    @KsYunField(name="FileSystemId")
    private String FileSystemId;

}
