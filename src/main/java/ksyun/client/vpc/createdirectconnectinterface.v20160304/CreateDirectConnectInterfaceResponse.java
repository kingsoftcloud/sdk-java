package ksyun.client.vpc.createdirectconnectinterface.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.Set;

/**
* @Classname CreateDirectConnectInterfaceResponse
* @Description CreateDirectConnectInterface 返回体
*/
@Data
@ToString
public class CreateDirectConnectInterfaceResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
