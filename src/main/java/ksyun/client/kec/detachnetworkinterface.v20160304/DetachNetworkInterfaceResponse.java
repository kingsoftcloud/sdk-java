package ksyun.client.kec.detachnetworkinterface.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DetachNetworkInterfaceResponse
* @Description DetachNetworkInterface 返回体
*/
@Data
@ToString
public class DetachNetworkInterfaceResponse extends BaseResponseModel {

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("Return")
    private Boolean ReturnField;

}
