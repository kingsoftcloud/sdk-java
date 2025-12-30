package ksyun.client.tagv2.deletetag.v20200901;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DeleteTagResponse
* @Description DeleteTag 返回体
*/
@Data
@ToString
public class DeleteTagResponse extends BaseResponseModel {

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
