package ksyun.client.postgresql.modifydbinstanceextension.v20181225;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname ModifyDBInstanceExtensionResponse
 * @Description ModifyDBInstanceExtension 返回体
 */
@Data
@ToString
public class ModifyDBInstanceExtensionResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
