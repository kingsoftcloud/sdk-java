package ksyun.client.kcrs.deleterepotag.v20211109;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DeleteRepoTagResponse
* @Description DeleteRepoTag 返回体
*/
@Data
@ToString
public class DeleteRepoTagResponse extends BaseResponseModel {

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
