package ksyun.client.dts.createconsistencycheck.v20180108;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname CreateConsistencyCheckResponse
* @Description CreateConsistencyCheck 返回体
*/
@Data
@ToString
public class CreateConsistencyCheckResponse extends BaseResponseModel {

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
