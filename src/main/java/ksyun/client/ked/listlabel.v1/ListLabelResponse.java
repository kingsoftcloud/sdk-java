package ksyun.client.ked.listlabel.v1;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ListLabelResponse
* @Description ListLabel 返回体
*/
@Data
@ToString
public class ListLabelResponse extends BaseResponseModel {

    /***/
    @JsonProperty("requestId")
    private String RequestId;

    /***/
    @JsonProperty("data")
    private List<DataDto> Data;

    @Data
    @ToString
    public static class DataDto {
        /**标签id*/
        @JsonProperty("id")
        private Integer Id;

        /**标签名*/
        @JsonProperty("name")
        private String Name;

    }

}
