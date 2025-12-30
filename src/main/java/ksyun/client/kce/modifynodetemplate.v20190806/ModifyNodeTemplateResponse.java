package ksyun.client.kce.modifynodetemplate.v20190806;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ModifyNodeTemplateResponse
* @Description ModifyNodeTemplate 返回体
*/
@Data
@ToString
public class ModifyNodeTemplateResponse extends BaseResponseModel {

    /**请求id*/
    @JsonProperty("RequestId")
    private String RequestId;

}
