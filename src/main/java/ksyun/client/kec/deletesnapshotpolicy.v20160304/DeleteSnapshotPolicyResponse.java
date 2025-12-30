package ksyun.client.kec.deletesnapshotpolicy.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DeleteSnapshotPolicyResponse
* @Description DeleteSnapshotPolicy 返回体
*/
@Data
@ToString
public class DeleteSnapshotPolicyResponse extends BaseResponseModel {

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

}
