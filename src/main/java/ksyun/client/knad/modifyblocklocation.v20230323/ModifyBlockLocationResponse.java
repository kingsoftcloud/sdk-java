package ksyun.client.knad.modifyblocklocation.v20230323;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.Set;

/**
* @Classname ModifyBlockLocationResponse
* @Description ModifyBlockLocation 返回体
*/
@Data
@ToString
public class ModifyBlockLocationResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
