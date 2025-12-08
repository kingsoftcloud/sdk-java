package ksyun.client.waf.deletewaf.v20200707;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DeleteWafResponse
* @Description DeleteWaf 返回体
*/
@Data
@ToString
public class DeleteWafResponse extends BaseResponseModel {
    /**RequestId*/
    @JsonProperty("RequestId")
    private String RequestId;

}
