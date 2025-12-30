package ksyun.client.ebs.createsnapshot.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname CreateSnapshotResponse
* @Description CreateSnapshot 返回体
*/
@Data
@ToString
public class CreateSnapshotResponse extends BaseResponseModel {

    /**唯一请求ID，每次请求都会返回*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**快照ID*/
    @JsonProperty("SnapshotId")
    private String SnapshotId;

}
