package ksyun.client.kcf.deletefunction.v20211215;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DeleteFunctionResponse
* @Description DeleteFunction 返回体
*/
@Data
@ToString
public class DeleteFunctionResponse extends BaseResponseModel {
    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
