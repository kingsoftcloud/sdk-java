package ksyun.client.ked.createclouddeskgettoken.v20250501;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.Set;

/**
* @Classname CreateCloudDeskgetTokenResponse
* @Description CreateCloudDeskgetToken 返回体
*/
@Data
@ToString
public class CreateCloudDeskgetTokenResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
