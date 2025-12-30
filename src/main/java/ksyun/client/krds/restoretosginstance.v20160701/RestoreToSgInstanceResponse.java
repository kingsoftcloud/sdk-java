package ksyun.client.krds.restoretosginstance.v20160701;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname RestoreToSgInstanceResponse
* @Description RestoreToSgInstance 返回体
*/
@Data
@ToString
public class RestoreToSgInstanceResponse extends BaseResponseModel {

    /***/
    @JsonProperty("RequestStageId")
    private String RequestStageId;

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
