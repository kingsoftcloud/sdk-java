package ksyun.client.klog.listquicksearchs.v20200731;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ListQuickSearchsResponse
* @Description ListQuickSearchs 返回体
*/
@Data
@ToString
public class ListQuickSearchsResponse extends BaseResponseModel {
    /**Res*/
    @JsonProperty("Res")
    private String Res;

}
