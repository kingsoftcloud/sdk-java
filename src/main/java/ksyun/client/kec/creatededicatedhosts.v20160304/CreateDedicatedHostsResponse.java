package ksyun.client.kec.creatededicatedhosts.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname CreateDedicatedHostsResponse
 * @Description CreateDedicatedHosts 返回体
 */
@Data
@ToString
public class CreateDedicatedHostsResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
