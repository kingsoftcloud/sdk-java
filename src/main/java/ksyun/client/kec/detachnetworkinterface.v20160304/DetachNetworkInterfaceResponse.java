package ksyun.client.kec.detachnetworkinterface.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname DetachNetworkInterfaceResponse
 * @Description DetachNetworkInterface 返回体
 */
@Data
@ToString
public class DetachNetworkInterfaceResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
