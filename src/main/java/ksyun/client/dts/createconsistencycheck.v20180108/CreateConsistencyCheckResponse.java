package ksyun.client.dts.createconsistencycheck.v20180108;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname CreateConsistencyCheckResponse
 * @Description CreateConsistencyCheck 返回体
 */
@Data
@ToString
public class CreateConsistencyCheckResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
