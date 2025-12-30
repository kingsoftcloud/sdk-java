package ksyun.client.kec.createautosnapshotpolicy.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname CreateAutoSnapshotPolicyResponse
* @Description CreateAutoSnapshotPolicy 返回体
*/
@Data
@ToString
public class CreateAutoSnapshotPolicyResponse extends BaseResponseModel {

    /**请求id*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**自动快照策略ID*/
    @JsonProperty("AutoSnapshotPolicyId")
    private String AutoSnapshotPolicyId;

}
