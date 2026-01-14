package ksyun.client.kfw.deletecfwservicegroup.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DeleteCfwServiceGroupResponse
* @Description DeleteCfwServiceGroup 返回体
*/
@Data
@ToString
public class DeleteCfwServiceGroupResponse extends BaseResponseModel {

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
