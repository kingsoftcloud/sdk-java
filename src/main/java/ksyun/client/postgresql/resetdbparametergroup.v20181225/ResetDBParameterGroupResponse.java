package ksyun.client.postgresql.resetdbparametergroup.v20181225;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname ResetDBParameterGroupResponse
 * @Description ResetDBParameterGroup 返回体
 */
@Data
@ToString
public class ResetDBParameterGroupResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
