package ksyun.client.kec.modifydedicatedclustername.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ModifyDedicatedClusterNameResponse
* @Description ModifyDedicatedClusterName 返回体
*/
@Data
@ToString
public class ModifyDedicatedClusterNameResponse extends BaseResponseModel {

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("Return")
    private String ReturnField;

}
