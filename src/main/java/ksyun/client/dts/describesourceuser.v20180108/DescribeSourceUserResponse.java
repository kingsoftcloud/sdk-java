package ksyun.client.dts.describesourceuser.v20180108;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeSourceUserResponse
* @Description DescribeSourceUser 返回体
*/
@Data
@ToString
public class DescribeSourceUserResponse extends BaseResponseModel {
    /***/
    @JsonProperty("Data")
    private DataDto Data;

    @Data
    @ToString
    public static class DataDto {
        /***/
        @JsonProperty("SourceUser")
        private List<SourceUserDto> SourceUser;

        @Data
        @ToString
        public static class SourceUserDto {
            /***/
            @JsonProperty("Username")
            private String Username;

            /***/
            @JsonProperty("Host")
            private String Host;

            /***/
            @JsonProperty("Description")
            private String Description;

            /***/
            @JsonProperty("Priv")
            private List<String> Priv;

            /***/
            @JsonProperty("UserAvailable")
            private String UserAvailable;

        }

    }

}
