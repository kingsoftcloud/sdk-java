package ksyun.client.vpc.modifynetworkpathname.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ModifyNetworkPathNameResponse
* @Description ModifyNetworkPathName 返回体
*/
@Data
@ToString
public class ModifyNetworkPathNameResponse extends BaseResponseModel {

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
