package ksyun.client.kec.createdataguardgroup.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname CreateDataGuardGroupResponse
* @Description CreateDataGuardGroup 返回体
*/
@Data
@ToString
public class CreateDataGuardGroupResponse extends BaseResponseModel {

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**容灾分组ID*/
    @JsonProperty("DataGuardId")
    private String DataGuardId;

}
