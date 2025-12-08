package ksyun.client.postgresql.modifydbinstanceextension.v20181225;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ModifyDBInstanceExtensionResponse
* @Description ModifyDBInstanceExtension 返回体
*/
@Data
@ToString
public class ModifyDBInstanceExtensionResponse extends BaseResponseModel {
    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
