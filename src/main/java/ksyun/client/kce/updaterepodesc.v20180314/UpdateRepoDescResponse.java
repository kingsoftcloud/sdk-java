package ksyun.client.kce.updaterepodesc.v20180314;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname UpdateRepoDescResponse
* @Description UpdateRepoDesc 返回体
*/
@Data
@ToString
public class UpdateRepoDescResponse extends BaseResponseModel {

    /**请求id*/
    @JsonProperty("RequestId")
    private String RequestId;

}
