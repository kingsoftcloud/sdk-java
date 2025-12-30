package ksyun.client.kec.cancelsnapshotpolicy.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname CancelSnapshotPolicyResponse
* @Description CancelSnapshotPolicy 返回体
*/
@Data
@ToString
public class CancelSnapshotPolicyResponse extends BaseResponseModel {

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

}
