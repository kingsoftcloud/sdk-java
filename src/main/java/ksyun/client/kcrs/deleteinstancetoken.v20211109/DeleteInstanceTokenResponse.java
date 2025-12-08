package ksyun.client.kcrs.deleteinstancetoken.v20211109;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DeleteInstanceTokenResponse
* @Description DeleteInstanceToken 返回体
*/
@Data
@ToString
public class DeleteInstanceTokenResponse extends BaseResponseModel {
    /**请求Id*/
    @JsonProperty("RequestId")
    private String RequestId;

}
