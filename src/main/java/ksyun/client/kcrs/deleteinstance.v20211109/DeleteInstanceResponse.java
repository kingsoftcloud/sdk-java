package ksyun.client.kcrs.deleteinstance.v20211109;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DeleteInstanceResponse
* @Description DeleteInstance 返回体
*/
@Data
@ToString
public class DeleteInstanceResponse extends BaseResponseModel {

    /**请求Id*/
    @JsonProperty("RequestId")
    private String RequestId;

}
