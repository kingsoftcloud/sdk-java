package ksyun.client.kec.copysnapshot.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname CopySnapshotResponse
* @Description CopySnapshot 返回体
*/
@Data
@ToString
public class CopySnapshotResponse extends BaseResponseModel {
    /***/
    @JsonProperty("Return")
    private Boolean ReturnField;

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
