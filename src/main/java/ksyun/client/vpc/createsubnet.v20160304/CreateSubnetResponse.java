package ksyun.client.vpc.createsubnet.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname CreateSubnetResponse
* @Description CreateSubnet 返回体
*/
@Data
@ToString
public class CreateSubnetResponse extends BaseResponseModel {
    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

}
