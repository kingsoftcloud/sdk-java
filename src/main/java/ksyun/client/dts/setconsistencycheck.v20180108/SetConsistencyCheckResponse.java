package ksyun.client.dts.setconsistencycheck.v20180108;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname SetConsistencyCheckResponse
* @Description SetConsistencyCheck 返回体
*/
@Data
@ToString
public class SetConsistencyCheckResponse extends BaseResponseModel {

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
