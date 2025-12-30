package ksyun.client.kcf.deletetrigger.v20211215;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DeleteTriggerResponse
* @Description DeleteTrigger 返回体
*/
@Data
@ToString
public class DeleteTriggerResponse extends BaseResponseModel {

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
