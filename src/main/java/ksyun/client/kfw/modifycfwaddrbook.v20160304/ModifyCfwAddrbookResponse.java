package ksyun.client.kfw.modifycfwaddrbook.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ModifyCfwAddrbookResponse
* @Description ModifyCfwAddrbook 返回体
*/
@Data
@ToString
public class ModifyCfwAddrbookResponse extends BaseResponseModel {

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
