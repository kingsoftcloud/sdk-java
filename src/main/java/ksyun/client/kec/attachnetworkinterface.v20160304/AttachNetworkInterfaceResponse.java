package ksyun.client.kec.attachnetworkinterface.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname AttachNetworkInterfaceResponse
* @Description AttachNetworkInterface 返回体
*/
@Data
@ToString
public class AttachNetworkInterfaceResponse extends BaseResponseModel {

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**返回状态*/
    @JsonProperty("Return")
    private Boolean ReturnField;

}
