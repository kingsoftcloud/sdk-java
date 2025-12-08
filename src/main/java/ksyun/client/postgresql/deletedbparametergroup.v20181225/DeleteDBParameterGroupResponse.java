package ksyun.client.postgresql.deletedbparametergroup.v20181225;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DeleteDBParameterGroupResponse
* @Description DeleteDBParameterGroup 返回体
*/
@Data
@ToString
public class DeleteDBParameterGroupResponse extends BaseResponseModel {
    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
