package ksyun.client.kfw.modifycfwservicegroup.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ModifyCfwServiceGroupResponse
* @Description ModifyCfwServiceGroup 返回体
*/
@Data
@ToString
public class ModifyCfwServiceGroupResponse extends BaseResponseModel {

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
