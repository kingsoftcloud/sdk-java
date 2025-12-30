package ksyun.client.kcs.deletesnapshot.v20160701;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DeleteSnapshotResponse
* @Description DeleteSnapshot 返回体
*/
@Data
@ToString
public class DeleteSnapshotResponse extends BaseResponseModel {

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
