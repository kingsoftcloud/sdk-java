package ksyun.client.kcs.restoresnapshot.v20160701;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname RestoreSnapshotResponse
* @Description RestoreSnapshot 返回体
*/
@Data
@ToString
public class RestoreSnapshotResponse extends BaseResponseModel {
    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
