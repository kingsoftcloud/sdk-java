package ksyun.client.ebs.modifysnapshottype.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ModifySnapshotTypeResponse
* @Description ModifySnapshotType 返回体
*/
@Data
@ToString
public class ModifySnapshotTypeResponse extends BaseResponseModel {
    /**执行结果*/
    @JsonProperty("Result")
    private Boolean Result;

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
