package ksyun.client.kec.createmodel.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname CreateModelResponse
* @Description CreateModel 返回体
*/
@Data
@ToString
public class CreateModelResponse extends BaseResponseModel {
    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("ModelId")
    private String ModelId;

    /***/
    @JsonProperty("ModelName")
    private String ModelName;

}
