package ksyun.client.kcs.setcacheparameters.v20160701;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname SetCacheParametersResponse
* @Description SetCacheParameters 返回体
*/
@Data
@ToString
public class SetCacheParametersResponse extends BaseResponseModel {

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("Data")
    private String Data;

}
