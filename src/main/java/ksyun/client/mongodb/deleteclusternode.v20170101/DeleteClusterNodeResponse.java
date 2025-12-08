package ksyun.client.mongodb.deleteclusternode.v20170101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DeleteClusterNodeResponse
* @Description DeleteClusterNode 返回体
*/
@Data
@ToString
public class DeleteClusterNodeResponse extends BaseResponseModel {
    /***/
    @JsonProperty("null")
    private String NullField;

}
