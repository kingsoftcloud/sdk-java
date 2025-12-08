package ksyun.client.kcf.getlogdate.v20211215;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname GetLogDateResponse
* @Description GetLogDate 返回体
*/
@Data
@ToString
public class GetLogDateResponse extends BaseResponseModel {
    /***/
    @JsonProperty("id")
    private Integer Id;

}
