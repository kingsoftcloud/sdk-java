package ksyun.client.klog.deletequicksearchs.v20200731;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DeleteQuickSearchsResponse
* @Description DeleteQuickSearchs 返回体
*/
@Data
@ToString
public class DeleteQuickSearchsResponse extends BaseResponseModel {

    /**Res*/
    @JsonProperty("Res")
    private String Res;

}
