package ksyun.client.kec.deleteautosnapshotpolicy.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DeleteAutoSnapshotPolicyResponse
* @Description DeleteAutoSnapshotPolicy 返回体
*/
@Data
@ToString
public class DeleteAutoSnapshotPolicyResponse extends BaseResponseModel {

    /**请求id*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**自动快照策略ID*/
    @JsonProperty("AutoSnapshotPolicySet")
    private List<String> AutoSnapshotPolicySet;

}
