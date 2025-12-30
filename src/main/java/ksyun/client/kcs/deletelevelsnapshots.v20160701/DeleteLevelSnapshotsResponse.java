package ksyun.client.kcs.deletelevelsnapshots.v20160701;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DeleteLevelSnapshotsResponse
* @Description DeleteLevelSnapshots 返回体
*/
@Data
@ToString
public class DeleteLevelSnapshotsResponse extends BaseResponseModel {

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
