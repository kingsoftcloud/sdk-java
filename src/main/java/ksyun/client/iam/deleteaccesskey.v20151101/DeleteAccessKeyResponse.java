package ksyun.client.iam.deleteaccesskey.v20151101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DeleteAccessKeyResponse
* @Description DeleteAccessKey 返回体
*/
@Data
@ToString
public class DeleteAccessKeyResponse extends BaseResponseModel {

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
