package ksyun.client.mongodb.createparamgroup.v20170101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname CreateParamGroupResponse
* @Description CreateParamGroup 返回体
*/
@Data
@ToString
public class CreateParamGroupResponse extends BaseResponseModel {

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("Data")
    private DataDto Data;

    @Data
    @ToString
    public static class DataDto {
        /***/
        @JsonProperty("ParamGroupId")
        private String ParamGroupId;

    }

}
