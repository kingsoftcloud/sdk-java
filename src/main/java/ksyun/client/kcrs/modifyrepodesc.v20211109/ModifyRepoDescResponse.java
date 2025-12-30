package ksyun.client.kcrs.modifyrepodesc.v20211109;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ModifyRepoDescResponse
* @Description ModifyRepoDesc 返回体
*/
@Data
@ToString
public class ModifyRepoDescResponse extends BaseResponseModel {

    /**请求Id*/
    @JsonProperty("RequestId")
    private String RequestId;

}
