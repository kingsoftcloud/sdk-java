package ksyun.client.kce.createlogrule.v20190806;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname CreateLogRuleResponse
* @Description CreateLogRule 返回体
*/
@Data
@ToString
public class CreateLogRuleResponse extends BaseResponseModel {
    /**请求Id*/
    @JsonProperty("RequestId")
    private String RequestId;

}
