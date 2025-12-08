package ksyun.client.dts.setconsistencycheck.v20180108;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.Set;

/**
* @Classname SetConsistencyCheckResponse
* @Description SetConsistencyCheck 返回体
*/
@Data
@ToString
public class SetConsistencyCheckResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
