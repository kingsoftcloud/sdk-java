package ksyun.client.vpc.deletenetworkinterface.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DeleteNetworkInterfaceResponse
* @Description DeleteNetworkInterface 返回体
*/
@Data
@ToString
public class DeleteNetworkInterfaceResponse extends BaseResponseModel {
    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**操作是否成功*/
    @JsonProperty("Return")
    private Boolean ReturnField;

}
