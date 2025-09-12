package ksyun.client.vpc.describedirectconnectinterfaces.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.Set;

/**
* @Classname DescribeDirectConnectInterfacesResponse
* @Description DescribeDirectConnectInterfaces 返回体
*/
@Data
@ToString
public class DescribeDirectConnectInterfacesResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
