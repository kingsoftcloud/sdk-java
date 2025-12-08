package ksyun.client.postgresql.updatedbinstanceversion.v20181225;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname UpdateDBInstanceVersionResponse
* @Description UpdateDBInstanceVersion 返回体
*/
@Data
@ToString
public class UpdateDBInstanceVersionResponse extends BaseResponseModel {
    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
