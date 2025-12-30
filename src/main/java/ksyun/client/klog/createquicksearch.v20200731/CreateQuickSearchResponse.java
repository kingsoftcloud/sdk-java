package ksyun.client.klog.createquicksearch.v20200731;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname CreateQuickSearchResponse
* @Description CreateQuickSearch 返回体
*/
@Data
@ToString
public class CreateQuickSearchResponse extends BaseResponseModel {

    /**Res*/
    @JsonProperty("Res")
    private String Res;

}
