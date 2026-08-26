package ksyun.client.vpc.createnetworkpath.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname CreateNetworkPathResponse
* @Description CreateNetworkPath 返回体
*/
@Data
@ToString
public class CreateNetworkPathResponse extends BaseResponseModel {

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /**路径分析ID*/
    @JsonProperty("PathId")
    private String PathId;

}
