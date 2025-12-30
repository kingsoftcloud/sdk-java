package ksyun.client.kfw.deletebatchcfwaddrbook.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DeleteBatchCfwAddrbookResponse
* @Description DeleteBatchCfwAddrbook 返回体
*/
@Data
@ToString
public class DeleteBatchCfwAddrbookResponse extends BaseResponseModel {

    /**请求ID，用于标识本次请求*/
    @JsonProperty("RequestId")
    private String RequestId;

}
