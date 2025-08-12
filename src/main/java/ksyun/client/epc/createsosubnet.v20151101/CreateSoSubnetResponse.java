package ksyun.client.epc.createsosubnet.v20151101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.Set;

/**
 * @Classname CreateSoSubnetResponse
 * @Description CreateSoSubnet 返回体
 */
@Data
@ToString
public class CreateSoSubnetResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
