package ksyun.client.epc.rebootsoinstance.v20151101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname RebootSoInstanceResponse
* @Description RebootSoInstance 返回体
*/
@Data
@ToString
public class RebootSoInstanceResponse extends BaseResponseModel {

    /**imageId_1e0a602e3e41*/
    @JsonProperty("ImageId")
    private String ImageId;

    /**requestId_c8e82c4dc8f7*/
    @JsonProperty("RequestId")
    private String RequestId;

}
