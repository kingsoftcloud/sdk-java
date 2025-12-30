package ksyun.client.eip.modifyeippool.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ModifyEipPoolResponse
* @Description ModifyEipPool 返回体
*/
@Data
@ToString
public class ModifyEipPoolResponse extends BaseResponseModel {

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
