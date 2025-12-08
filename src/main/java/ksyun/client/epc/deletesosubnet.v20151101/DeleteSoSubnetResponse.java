package ksyun.client.epc.deletesosubnet.v20151101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DeleteSoSubnetResponse
* @Description DeleteSoSubnet 返回体
*/
@Data
@ToString
public class DeleteSoSubnetResponse extends BaseResponseModel {
    /**1ded7233-54f8-44d1-a2ea-b6fcc0ca7390*/
    @JsonProperty("RequestId")
    private String RequestId;

}
