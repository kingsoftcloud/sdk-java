package ksyun.client.kec.modifynetworkinterfaceattribute.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname ModifyNetworkInterfaceAttributeResponse
 * @Description ModifyNetworkInterfaceAttribute 返回体
 */
@Data
@ToString
public class ModifyNetworkInterfaceAttributeResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
