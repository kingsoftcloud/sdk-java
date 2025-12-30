package ksyun.client.kcrs.deleterepository.v20211109;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DeleteRepositoryResponse
* @Description DeleteRepository 返回体
*/
@Data
@ToString
public class DeleteRepositoryResponse extends BaseResponseModel {

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

}
