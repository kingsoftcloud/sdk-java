package ksyun.client.kce.modifyreponamespacetype.v20180314;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ModifyRepoNamespaceTypeResponse
* @Description ModifyRepoNamespaceType 返回体
*/
@Data
@ToString
public class ModifyRepoNamespaceTypeResponse extends BaseResponseModel {
    /**请求id*/
    @JsonProperty("RequestId")
    private String RequestId;

}
