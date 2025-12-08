package ksyun.client.epc.getdynamiccode.v20151101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.Set;

/**
* @Classname GetDynamicCodeResponse
* @Description GetDynamicCode 返回体
*/
@Data
@ToString
public class GetDynamicCodeResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
