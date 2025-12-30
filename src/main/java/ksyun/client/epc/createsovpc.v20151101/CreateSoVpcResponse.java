package ksyun.client.epc.createsovpc.v20151101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname CreateSoVpcResponse
* @Description CreateSoVpc 返回体
*/
@Data
@ToString
public class CreateSoVpcResponse extends BaseResponseModel {

    /**b54be2bc-e96a-41d1-8156-3990d1f9ba41*/
    @JsonProperty("VpcId")
    private String VpcId;

    /**1ded7233-54f8-44d1-a2ea-b6fcc0ca7390*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**true*/
    @JsonProperty("Return")
    private Boolean ReturnField;

}
