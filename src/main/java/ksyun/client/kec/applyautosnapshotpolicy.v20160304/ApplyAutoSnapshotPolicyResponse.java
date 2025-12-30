package ksyun.client.kec.applyautosnapshotpolicy.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ApplyAutoSnapshotPolicyResponse
* @Description ApplyAutoSnapshotPolicy 返回体
*/
@Data
@ToString
public class ApplyAutoSnapshotPolicyResponse extends BaseResponseModel {

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("ReturnSet")
    private ReturnSetDto ReturnSet;

    @Data
    @ToString
    public static class ReturnSetDto {
        /**自动快照策略ID*/
        @JsonProperty("AutoSnapshotPolicyId")
        private String AutoSnapshotPolicyId;

        /**绑定成功的硬盘ID*/
        @JsonProperty("AttachVolumeIdSuccess")
        private List<String> AttachVolumeIdSuccess;

    }

}
