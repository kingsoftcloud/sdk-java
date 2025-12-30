package ksyun.client.kcs.setcacheparametergroup.v20160701;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname SetCacheParameterGroupResponse
* @Description SetCacheParameterGroup 返回体
*/
@Data
@ToString
public class SetCacheParameterGroupResponse extends BaseResponseModel {

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
