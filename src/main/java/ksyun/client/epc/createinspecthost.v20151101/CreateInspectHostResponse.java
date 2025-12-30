package ksyun.client.epc.createinspecthost.v20151101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname CreateInspectHostResponse
* @Description CreateInspectHost 返回体
*/
@Data
@ToString
public class CreateInspectHostResponse extends BaseResponseModel {

    /***/
    @JsonProperty("InspectId")
    private String InspectId;

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("Return")
    private Boolean ReturnField;

}
