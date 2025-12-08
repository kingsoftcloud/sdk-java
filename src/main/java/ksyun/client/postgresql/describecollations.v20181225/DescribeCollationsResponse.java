package ksyun.client.postgresql.describecollations.v20181225;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeCollationsResponse
* @Description DescribeCollations 返回体
*/
@Data
@ToString
public class DescribeCollationsResponse extends BaseResponseModel {
    /***/
    @JsonProperty("Data")
    private DataDto Data;

    @Data
    @ToString
    public static class DataDto {
        /**排序规则列表，每个子项为对应的排序规则，及其对应的ctype和name。*/
        @JsonProperty("Collations")
        private DataDtoCollationsDto Collations;

        @Data
        @ToString
        public static class DataDtoCollationsDto {
            /***/
            @JsonProperty("LATIN5")
            private DataDtoCollationsDtoLATIN5Dto LATIN5;

            @Data
            @ToString
            public static class DataDtoCollationsDtoLATIN5Dto {
                /***/
                @JsonProperty("ctype_name")
                private List<String> Ctype_name;

                /***/
                @JsonProperty("collation_name")
                private List<String> Collation_name;

            }

        }

    }

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
