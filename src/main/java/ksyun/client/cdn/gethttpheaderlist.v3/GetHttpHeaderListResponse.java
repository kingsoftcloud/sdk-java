package ksyun.client.cdn.gethttpheaderlist.v3;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname GetHttpHeaderListResponse
* @Description GetHttpHeaderList 返回体
*/
@Data
@ToString
public class GetHttpHeaderListResponse extends BaseResponseModel {

    /**GetHttpHeaderListResponse*/
    @JsonProperty("GetHttpHeaderListResponse")
    private String GetHttpHeaderListResponse;

}
