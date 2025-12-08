package ksyun.client.kcf.createtrigger.v20211215;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname CreateTriggerResponse
* @Description CreateTrigger 返回体
*/
@Data
@ToString
public class CreateTriggerResponse extends BaseResponseModel {
    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
