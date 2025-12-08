package ksyun.client.kcs.settimingsnapshot.v20160701;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname SetTimingSnapshotResponse
* @Description SetTimingSnapshot 返回体
*/
@Data
@ToString
public class SetTimingSnapshotResponse extends BaseResponseModel {
    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
