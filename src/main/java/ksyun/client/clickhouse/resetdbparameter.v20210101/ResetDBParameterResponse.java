package ksyun.client.clickhouse.resetdbparameter.v20210101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname ResetDBParameterResponse
 * @Description ResetDBParameter 返回体
 */
@Data
@ToString
public class ResetDBParameterResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
