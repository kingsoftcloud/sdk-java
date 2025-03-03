package ksyun.client.kcs.settimingsnapshot.v20160701;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname SetTimingSnapshotResponse
 * @Description SetTimingSnapshot 返回体
 */
@Data
@ToString
public class SetTimingSnapshotResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
