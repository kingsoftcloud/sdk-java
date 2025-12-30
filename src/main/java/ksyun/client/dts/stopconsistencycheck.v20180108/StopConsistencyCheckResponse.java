package ksyun.client.dts.stopconsistencycheck.v20180108;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname StopConsistencyCheckResponse
* @Description StopConsistencyCheck 返回体
*/
@Data
@ToString
public class StopConsistencyCheckResponse extends BaseResponseModel {

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
