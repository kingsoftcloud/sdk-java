package ksyun.client.epc.modifysokeypairattribute.v20151101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ModifySoKeyPairAttributeResponse
* @Description ModifySoKeyPairAttribute 返回体
*/
@Data
@ToString
public class ModifySoKeyPairAttributeResponse extends BaseResponseModel {
    /**3e51192a-9bfc-4788-861c-b0905571b913*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**123*/
    @JsonProperty("KeyPairName")
    private String KeyPairName;

    /**true*/
    @JsonProperty("Return")
    private Boolean ReturnField;

}
