package ksyun.client.kec.deletesnapshot.v20160304;

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

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

}
