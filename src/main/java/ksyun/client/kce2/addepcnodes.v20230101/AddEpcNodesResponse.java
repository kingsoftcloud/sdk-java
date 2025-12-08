package ksyun.client.kce2.addepcnodes.v20230101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.Set;

/**
* @Classname AddEpcNodesResponse
* @Description AddEpcNodes 返回体
*/
@Data
@ToString
public class AddEpcNodesResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
