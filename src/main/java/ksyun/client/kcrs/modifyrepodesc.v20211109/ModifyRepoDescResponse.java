package ksyun.client.kcrs.modifyrepodesc.v20211109;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.Set;

/**
 * @Classname ModifyRepoDescResponse
 * @Description ModifyRepoDesc 返回体
 */
@Data
@ToString
public class ModifyRepoDescResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
