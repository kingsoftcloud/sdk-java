package ksyun.client.cdn.setrequestauthconfig.v3;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname SetRequestAuthConfigResponse
* @Description SetRequestAuthConfig 返回体
*/
@Data
@ToString
public class SetRequestAuthConfigResponse extends BaseResponseModel {

    /**SetRequestAuthConfigResponse*/
    @JsonProperty("SetRequestAuthConfigResponse")
    private String SetRequestAuthConfigResponse;

}
