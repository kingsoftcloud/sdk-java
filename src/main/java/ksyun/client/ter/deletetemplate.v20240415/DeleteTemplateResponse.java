package ksyun.client.ter.deletetemplate.v20240415;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DeleteTemplateResponse
* @Description DeleteTemplate 返回体
*/
@Data
@ToString
public class DeleteTemplateResponse extends BaseResponseModel {
    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /**结果*/
    @JsonProperty("Return")
    private Boolean ReturnField;

}
