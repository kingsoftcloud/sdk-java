package ksyun.client.vpc.createnetworkinterface.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname CreateNetworkInterfaceResponse
* @Description CreateNetworkInterface 返回体
*/
@Data
@ToString
public class CreateNetworkInterfaceResponse extends BaseResponseModel {
    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**网卡ID*/
    @JsonProperty("NetworkInterfaceId")
    private String NetworkInterfaceId;

}
