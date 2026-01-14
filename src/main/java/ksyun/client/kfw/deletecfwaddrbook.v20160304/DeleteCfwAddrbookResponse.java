package ksyun.client.kfw.deletecfwaddrbook.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DeleteCfwAddrbookResponse
* @Description DeleteCfwAddrbook 返回体
*/
@Data
@ToString
public class DeleteCfwAddrbookResponse extends BaseResponseModel {

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
