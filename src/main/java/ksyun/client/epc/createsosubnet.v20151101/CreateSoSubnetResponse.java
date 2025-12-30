package ksyun.client.epc.createsosubnet.v20151101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname CreateSoSubnetResponse
* @Description CreateSoSubnet 返回体
*/
@Data
@ToString
public class CreateSoSubnetResponse extends BaseResponseModel {

    /**1ded7233-54f8-44d1-a2ea-b6fcc0ca7390*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**true*/
    @JsonProperty("Return")
    private Boolean ReturnField;

    /**1ded7233-54f8-44d1-a2ea-b6fcc0ca7390*/
    @JsonProperty("SubnetId")
    private String SubnetId;

}
