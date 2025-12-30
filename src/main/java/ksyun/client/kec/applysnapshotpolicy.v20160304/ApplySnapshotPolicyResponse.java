package ksyun.client.kec.applysnapshotpolicy.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ApplySnapshotPolicyResponse
* @Description ApplySnapshotPolicy 返回体
*/
@Data
@ToString
public class ApplySnapshotPolicyResponse extends BaseResponseModel {

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

}
