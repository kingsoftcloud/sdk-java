package ksyun.client.kcs.deletecacheparametergroup.v20160701;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DeleteCacheParameterGroupResponse
* @Description DeleteCacheParameterGroup 返回体
*/
@Data
@ToString
public class DeleteCacheParameterGroupResponse extends BaseResponseModel {

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
