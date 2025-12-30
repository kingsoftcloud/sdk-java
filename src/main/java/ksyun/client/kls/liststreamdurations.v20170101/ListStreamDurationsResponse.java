package ksyun.client.kls.liststreamdurations.v20170101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ListStreamDurationsResponse
* @Description ListStreamDurations 返回体
*/
@Data
@ToString
public class ListStreamDurationsResponse extends BaseResponseModel {

    /***/
    @JsonProperty("ListStreamDurationsResponse")
    private String ListStreamDurationsResponse;

}
