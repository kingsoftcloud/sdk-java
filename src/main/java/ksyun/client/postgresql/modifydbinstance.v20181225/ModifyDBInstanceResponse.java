package ksyun.client.postgresql.modifydbinstance.v20181225;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.Set;

/**
 * @Classname ModifyDBInstanceResponse
 * @Description ModifyDBInstance 返回体
 */
@Data
@ToString
public class ModifyDBInstanceResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
