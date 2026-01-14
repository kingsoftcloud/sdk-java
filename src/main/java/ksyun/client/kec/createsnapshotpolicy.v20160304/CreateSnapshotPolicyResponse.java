package ksyun.client.kec.createsnapshotpolicy.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname CreateSnapshotPolicyResponse
* @Description CreateSnapshotPolicy 返回体
*/
@Data
@ToString
public class CreateSnapshotPolicyResponse extends BaseResponseModel {

    /**自动快照策略 ID*/
    @JsonProperty("AutoSnapshotPolicyId")
    private String AutoSnapshotPolicyId;

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

}
