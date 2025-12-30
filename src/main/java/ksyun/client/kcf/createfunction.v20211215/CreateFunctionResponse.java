package ksyun.client.kcf.createfunction.v20211215;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname CreateFunctionResponse
* @Description CreateFunction 返回体
*/
@Data
@ToString
public class CreateFunctionResponse extends BaseResponseModel {

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("Data")
    private DataDto Data;

    @Data
    @ToString
    public static class DataDto {
        /***/
        @JsonProperty("ID")
        private String ID;

        /***/
        @JsonProperty("Name")
        private DataNameDto Name;

        @Data
        @ToString
        public static class DataNameDto {
        }

    }

}
