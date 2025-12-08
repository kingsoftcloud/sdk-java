package ksyun.client.knad.modifyblocklocation.v20230323;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ModifyBlockLocationResponse
* @Description ModifyBlockLocation 返回体
*/
@Data
@ToString
public class ModifyBlockLocationResponse extends BaseResponseModel {
    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("Return")
    private Boolean ReturnField;

}
