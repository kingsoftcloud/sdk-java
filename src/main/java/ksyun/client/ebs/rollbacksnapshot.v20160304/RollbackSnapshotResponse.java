package ksyun.client.ebs.rollbacksnapshot.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname RollbackSnapshotResponse
* @Description RollbackSnapshot 返回体
*/
@Data
@ToString
public class RollbackSnapshotResponse extends BaseResponseModel {

    /**唯一请求ID，每次请求都会返回*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**true:表示成功*/
    @JsonProperty("Return")
    private Boolean ReturnField;

}
